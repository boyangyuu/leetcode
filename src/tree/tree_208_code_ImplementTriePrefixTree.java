package tree;

// todo 很复杂的一道题, 不过的确挺好玩的 , 参考 http://dongxicheng.org/structure/trietree/
public class tree_208_code_ImplementTriePrefixTree {

    public static void main(String[] args) {
        //[2,1,3,*,*,*,4] 1层 2; 2层 1,3 ;3层 4
        TreeNode root = new TreeNode(2);TreeNode root1 = new TreeNode(1);TreeNode root3 = new TreeNode(3);
        TreeNode root4 = new TreeNode(4);root.left = root1;root.right=root3;root3.right=root4;

    }

    class TrieNode {
        // Initialize your data structure here.
        char value;
        TrieNode[] children = new TrieNode[26];
        boolean isWord = false;

        public TrieNode(char value) {
            this.value = value;
        }

        public TrieNode() {}
    }

    private TrieNode root;

    public tree_208_code_ImplementTriePrefixTree() {
        root = new TrieNode(' ');
    }

    // Inserts a word into the trie.
    public void insert(String word) {
        TrieNode tmp = root;
        for (int i = 0; i < word.length(); i++) {
            char cur = word.charAt(i);
            if (tmp.children[cur - 'a'] == null) {
                tmp.children[cur - 'a'] = new TrieNode(cur);
            }
            tmp = tmp.children[cur - 'a'];
        }
        tmp.isWord = true;
    }

    // Returns if the word is in the trie.
    public boolean search(String word) {
        TrieNode tmp = root;
        for (int i = 0; i < word.length(); i++) {
            char cur = word.charAt(i);
            if (tmp.children[cur - 'a'] == null) return false;
            tmp = tmp.children[cur - 'a'];
        }
        return tmp.isWord;
    }

    // Returns if there is any word in the trie
    // that starts with the given prefix.
    // todo bug
    public boolean startsWith(String prefix) {
        TrieNode tmp = root;
        for (int i = 0; i < prefix.length(); i++) {
            char cur = prefix.charAt(i);
            if (tmp.children[cur - 'a'] == null) return false;
            tmp = tmp.children[cur - 'a'];
        }
        return true;
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

 bug2

 bug3

 TODO follow
 todo#! 有时可以用set 优化map
 */

/*
TODO tutorial


 */
