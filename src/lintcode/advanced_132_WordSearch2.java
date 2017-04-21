package lintcode;

import java.util.*;

public class advanced_132_WordSearch2 {
    /**
     * @param board: A list of lists of character
     * @param words: A list of string
     * @return: A list of string
     */
    public ArrayList<String> wordSearchII(char[][] board, ArrayList<String> words) {
        // write your code here
        // step 1
        TrieTree tree = new TrieTree();
        for (String s : words) tree.insert(s);

        // step 2
        Set<String> set = new HashSet<>();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                char c = board[i][j];
                help(board, i, j, tree.root.children[c - 'a'], set);
            }
        }

        ArrayList<String> res = new ArrayList<String>();
        for (String s : set) res.add(s);
        return res;


    }
    static int[][] directs = {{0, 1}, {-1, 0}, {1,0}, {0, -1}};
    public void help(char[][] board, int i, int j, TrieNode cur, Set<String> res) {
        if (cur == null) return;
        if (cur.s != null) {
            System.out.println("i: " + i + ", j: " + j);
            res.add(cur.s);
        }
        for (int[] d : directs) {
            int it = i + d[0];
            int jt = j + d[1];
            if (it >= board.length || it < 0 || jt >= board[0].length || jt < 0) continue;
            char c = board[it][jt];
            if (c == ' ') continue;
            // todo bug
            board[it][jt] = ' ';
            help(board, it, jt, cur.children[c - 'a'], res);
            board[it][jt] = c;
        }
    }
}

class TrieNode {
    public String s = null;
    TrieNode[] children = new TrieNode[26];
    public TrieNode() {

    }
}

class TrieTree {
    TrieNode root = new TrieNode();

    public TrieTree() {

    }

    public boolean find(String word) {
        return false;
    }

    public void help(String word, int index, TrieNode cur) {
        if (index == word.length()) {
            cur.s = word;
            // System.out.println(word);
            return;
        }
        char c = word.charAt(index);
        if (cur.children[c - 'a'] == null) {
            cur.children[c - 'a'] = new TrieNode();
        }
        help(word, index + 1, cur.children[c - 'a']);
    }

    public void insert(String word) {
        help(word, 0, root);
    }
}