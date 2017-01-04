package tree;


public class tree_211_code_AddandSearchWord {

    public static void main(String[] args) {
        tree_211_code_AddandSearchWord c = new tree_211_code_AddandSearchWord();
        c.addWord("bad");
        c.addWord("dad");
        c.addWord("mad");
        System.out.println(c.search("pad"));
        System.out.println(c.search("bad"));
        System.out.println(c.search(".ad"));

        // todo bug case1
        c.addWord("a");
        System.out.println(c.search("."));

    }

    class TrieNode {
        char value;
        TrieNode[] children = new TrieNode[26];
        boolean isWord = false;

        TrieNode(char value) {
            this.value = value;
        }
    }
    TrieNode root = new TrieNode(' ');

    // Adds a word into the data structure.
    public void addWord(String word) {
        TrieNode temp = root;
        for (int i = 0; i < word.length(); i++) {
            char cur = word.charAt(i);
            if (temp.children[cur - 'a'] == null)
                temp.children[cur - 'a'] = new TrieNode(cur);
            temp = temp.children[cur - 'a'];
        }
        temp.isWord = true;
    }

    // Returns if the word is in the data structure. A word could
    // contain the dot character '.' to represent any one letter.
    public boolean search(String word) { // todo 这里需要好好写, 最好改为题解里的方式
        boolean res = false;
        for (TrieNode node : root.children)
            res |= help(word, node, 0);
        return res;
    }

    public boolean help(String word, TrieNode cur, int start) {
        if (cur == null) return false;
        if (start == word.length() - 1) return cur.isWord && cur.value == word.charAt(start); // todo bug
        boolean res = false;
        char curC = word.charAt(start);
        if (curC == '.' || curC == cur.value) {
            for (TrieNode node : cur.children)
                res |= help(word, node, start + 1);
        }
        return res;
    }

}
/** 题
 *
 * http:
 *


 */

/** Solution
 * 时间  空间
 *
 *
 *
 参考网站


 TODO solotion
 ######s1######
 --performance
 time:
 space:

 --data structure

 --steps



 ######s2######
 --performance
 time:
 space:

 --data structure

 --steps

 ######sFinal######
 TODO case

 TODO bug
 bug1

 if (start == word.length() - 1) return cur.isWord && cur.value == word.charAt(start); // todo bug
 =>
 if (start == word.length() - 1) return cur.isWord && (cur.value == word.charAt(start)
 || '.' == word.charAt(start));
 bug2

 bug3

 TODO follow
 todo#! 有时可以用set 优化map
 */

/*
TODO tutorial


 */
