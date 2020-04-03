package graph;

import java.util.*;

public class Graph<E> {
    private final Map<E, Set<E>> edges;

    public Graph() {
        edges = new HashMap<>();
    }

    void addBothEdges(E from, E to) {
        addEdge(from, to);
        addEdge(to, from);
    }

    private void addEdge(E from, E to) {
        Set<E> currentEdges = edges.get(from);
        if (currentEdges == null) {
            currentEdges = new HashSet<>();
            edges.put(from, currentEdges);
        }
        currentEdges.add(to);
    }

    public List<E> elementsDfs() {
        List<E> resultList = new ArrayList<>();
        Set<E> visited = new HashSet<>();
        edges.keySet().forEach(v -> elementsDfs(v, resultList, visited));
        return resultList;
    }

    private void elementsDfs(E vertex, List<E> resultList, Set<E> visited) {
        if (visited.contains(vertex)) return;

        resultList.add(vertex);
        visited.add(vertex);

        edges.get(vertex).forEach(v -> elementsDfs(v, resultList, visited));
    }

    public List<E> elementsBfs() {
        List<E> resultList = new ArrayList<>();
        Set<E> visited = new HashSet<>();
        edges.keySet().forEach(v -> elementsBfs(v, resultList, visited));
        return resultList;
    }

    private void elementsBfs(E vertex, List<E> resultList, Set<E> visited) {
        Deque<E> queue = new LinkedList<>();
        queue.add(vertex);

        while (!queue.isEmpty()) {
            E eachVertex = queue.pollFirst();

            if (visited.contains(eachVertex)) continue;

            resultList.add(eachVertex);
            visited.add(eachVertex);

            edges.get(eachVertex).forEach(v -> queue.add(v));
        }
    }

    public boolean connected(E start, E target) {
        Set<E> visited = new HashSet<>();
        return connectedFromNode(start, target, visited);
    }

    private boolean connectedFromNode(E start, E target, Set<E> visited) {
        if (visited.contains(start)) return false;

        if (start == target) return true;

        visited.add(start);

        for (E vertex: edges.get(start)) {
            if (connectedFromNode(vertex, target, visited)) return true;
        }

        return false;
    }
}
