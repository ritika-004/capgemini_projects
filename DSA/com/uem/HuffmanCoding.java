package com.uem;

import java.util.*;

class HuffmanNode {
    char ch;
    int freq;
    HuffmanNode left, right;

    HuffmanNode(char ch, int freq) {
        this.ch = ch;
        this.freq = freq;
        left=right=null;
    }
}

public class HuffmanCoding {

    static void printCode(HuffmanNode root, String code) {
        if (root == null)
            return;

        if (root.left == null && root.right == null) {
            System.out.println(root.ch + " : " + code);
        }

        printCode(root.left, code + "0");
        printCode(root.right, code + "1");
    }

    public static void main(String[] args) {

        char[] chars = { 'a', 'b', 'c', 'd' };
        int[] freq = { 5, 9, 12, 13 };

        PriorityQueue<HuffmanNode> pq =
                new PriorityQueue<>(Comparator.comparingInt(n -> n.freq));

        for (int i = 0; i < chars.length; i++) {
            pq.add(new HuffmanNode(chars[i], freq[i]));
        }

        while (pq.size() > 1) {
            HuffmanNode left = pq.poll();
            HuffmanNode right = pq.poll();

            HuffmanNode newNode =
                    new HuffmanNode('-', left.freq + right.freq);
            newNode.left = left;
            newNode.right = right;

            pq.add(newNode);
        }

        HuffmanNode root = pq.poll();
        printCode(root, "");
    }
}
