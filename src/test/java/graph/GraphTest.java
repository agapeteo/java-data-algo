package graph;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GraphTest {

    @Test
    public void elementsDfs() {
        // given
        Graph<String> graph = new Graph<>();

        // when
        graph.addBothEdges("a", "b");
        graph.addBothEdges("b", "c");
        graph.addBothEdges("b", "d");
        graph.addBothEdges("c", "e");
        graph.addBothEdges("d", "e");
        List<String> actual = graph.elementsDfs();

        // then
        assertEquals(Arrays.asList("a", "b", "c", "e", "d"), actual);
    }

    @Test
    public void elementsBfs() {
        // given
        Graph<String> graph = new Graph<>();

        // when
        graph.addBothEdges("a", "b");
        graph.addBothEdges("b", "c");
        graph.addBothEdges("b", "d");
        graph.addBothEdges("c", "e");
        graph.addBothEdges("d", "e");
        List<String> actual = graph.elementsBfs();

        // then
        assertEquals(Arrays.asList("a", "b", "c", "d", "e"), actual);
    }

    @Test
    public void shouldBeConnected() {
        // given
        Graph<String> graph = new Graph<>();

        // when
        graph.addBothEdges("a", "b");
        graph.addBothEdges("b", "c");
        graph.addBothEdges("b", "d");
        graph.addBothEdges("c", "e");
        graph.addBothEdges("d", "e");

        // then
        assertTrue(graph.connected("a", "e"));
    }

    @Test
    public void shouldNotBeConnected() {
        // given
        Graph<String> graph = new Graph<>();

        // when
        graph.addBothEdges("a", "b");
        graph.addBothEdges("b", "c");
        graph.addBothEdges("b", "d");
        graph.addBothEdges("c", "e");
        graph.addBothEdges("d", "e");

        graph.addBothEdges("x", "y");
        graph.addBothEdges("y", "z");

        // then
        assertFalse(graph.connected("a", "z"));
    }

}