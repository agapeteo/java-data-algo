package trie;

import java.util.HashMap;
import java.util.Map;

public class BasicTrie implements Trie {
    private static class Node {
        Map<Character, Node> nodes = new HashMap();
        boolean isLast;
    }

    private Node root = new Node();

    @Override
    public void add(String word) {
        if (word.isEmpty()) return;

        add(root, word.toCharArray(), 0);
    }

    private void add(Node node, char[] chars, int idx) {
        if (idx >= chars.length) {
            return;
        }
        char curChar = chars[idx];
        Node nextNode = node.nodes.get(curChar);
        if (nextNode == null) {
            nextNode = new Node();
            node.nodes.put(curChar, nextNode);
        }
        if (idx == chars.length - 1) {
            nextNode.isLast = true;
        }
        add(nextNode, chars, idx + 1);
    }

    @Override
    public boolean contains(String word) {
        if (word.isEmpty()) return false;

        return contains(root, word.toCharArray(), 0);
    }

    private boolean contains(Node node, char[] chars, int idx) {
        if (idx >= chars.length) return false;

        char curChar = chars[idx];
        Node nextNode = node.nodes.get(curChar);

        if (nextNode == null) {
            return false;
        } else {
            if (idx == chars.length - 1 && nextNode.isLast) {
                return true;
            }
        }
        return contains(nextNode, chars, idx + 1);
    }
}
