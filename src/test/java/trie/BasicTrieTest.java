package trie;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BasicTrieTest {

    @Test
    void basic() {
        Trie trie = new BasicTrie();
        trie.add("cat");
        trie.add("can");
        trie.add("cast");
        trie.add("boost");

        assertTrue(trie.contains("cat"));
        assertTrue(trie.contains("can"));
        assertFalse(trie.contains("cas"));
        assertFalse(trie.contains("casting"));
        assertFalse(trie.contains("cost"));
        assertTrue(trie.contains("boost"));
        assertFalse(trie.contains("but"));
        assertFalse(trie.contains("bot"));
    }
}