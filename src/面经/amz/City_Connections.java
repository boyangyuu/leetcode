package 面经.amz;

/*
最小连通树
todo learn
Kruskal 算法, 贪心算法,  找到最小连通边 (a,b, cost), 那么既然想连通 a,b , 即链接包含a的集合, 和b的集合, 那么此边一定是最佳策略
具体证明不要去想, 贪心算法的证明非常难

step 1
根据cost排序,

step 2 union
 if 此节点已在集合中
 else
    union(node1, node2)
    result.add

step 3 check size

rectangle overlap, window sum, longest palindrome, k nearest points, mst, order dependency, deep copy, top five average, max mean subtree

 */

import java.util.*; //这句话极度重要
class Connection{
    String node1;
    String node2;
    int cost;
    public Connection(String a, String b, int c){
        node1 = a;
        node2 = b;
        cost = c;
    }
}
//下面进入正题
public class City_Connections {
    Map<String, String> father = new HashMap<>(); // node->root


    public static void main(String[] args) {
        ArrayList<Connection> connections = new ArrayList<>();
        //这里还是一个苯环形状，有化学出身的看到这里可以鼓掌了
        connections.add(new Connection("A","B",6));
        connections.add(new Connection("B","C",4));
        connections.add(new Connection("C","D",5));
        connections.add(new Connection("D","E",8));
        connections.add(new Connection("E","F",1));
        connections.add(new Connection("B","F",10));
        connections.add(new Connection("E","C",9));
        connections.add(new Connection("F","C",7));
        connections.add(new Connection("B","E",3));
        connections.add(new Connection("A","F",1));

//        connections.add(new Connection("M","N",1)); test null

        List<Connection> res = new City_Connections().getLowCost(connections);
        if (res == null) System.out.println("null");
        else
            for (Connection c : res){
                System.out.println(c.node1 + " -> " + c.node2 + " 需要花费大洋 : " + c.cost);
            }
    }

    public List<Connection> getLowCost(ArrayList<Connection> connections) {
        List<Connection> res = new ArrayList<>();
        // step 1 Kruskal sort
        connections.sort((c1, c2)->c1.cost - c2.cost);

        // step 2 init father
        Set<String> nodes = new HashSet<>();

        for (Connection con : connections) {
            nodes.add(con.node1);
            nodes.add(con.node2);

            father.put(con.node1, con.node1);
            father.put(con.node2, con.node2);
        }

        // step 3 union until size == nodes.size (已经连通所有城市)
        for (Connection con : connections) {
            if (union(con.node1, con.node2)) {
                res.add(con);
            }
            if (res.size() == nodes.size() - 1) return res;
        }


        return null;
    }

    private boolean union(String node1, String node2) {
        String root1 = find(node1);
        String root2 = find(node2);
        if (!root1.equals(root2)) {
            father.put(root1, father.get(root2));
            return true;
        }
        else
            return false;
    }

    private String find(String node1) {
        if (node1.equals(father.get(node1))) {
            return node1;
        }
        father.put(node1, find(father.get(node1)));
        return father.get(node1);
    }

/*

题目内容是这样的，给十几个城市供电，连接不同城市的花费不同，让花费最小同时连到所有的边。给出一系列connection类，里面是edge两端的城市名和它们之间的一个cost，找出要你挑一些边，把所有城市连接起来并且总花费最小。不能有环，最后所以城市要连成一个连通块。
不能的话输出空表，最后还要按城市名字排序输出，按照node1来排序,如果一样的话再排node2。


input :
{"Acity","Bcity",1}
("Acity","Ccity",2}
("Bcity","Ccity",3}
output：
("Acity","Bcity",1}
("Acity","Ccity",2}

find the minumum way to connect all cities
补充一句，test case一共有6个。


 */
}
