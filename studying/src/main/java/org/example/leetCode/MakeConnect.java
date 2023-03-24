package org.example.leetCode;
import java.util.*;

public class MakeConnect {
    public static void main(String[] args) {

    }
    public int makeConnected(int n, int[][] connections) {
        if (connections.length < n - 1) return -1;

        List<Set<Integer>> graph = new List<>() {
            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @Override
            public Iterator<Set<Integer>> iterator() {
                return null;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public <T> T[] toArray(T[] a) {
                return null;
            }

            @Override
            public boolean add(Set<Integer> integers) {
                return false;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean containsAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean addAll(Collection<? extends Set<Integer>> c) {
                return false;
            }

            @Override
            public boolean addAll(int index, Collection<? extends Set<Integer>> c) {
                return false;
            }

            @Override
            public boolean removeAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean retainAll(Collection<?> c) {
                return false;
            }

            @Override
            public void clear() {

            }

            @Override
            public boolean equals(Object o) {
                return false;
            }

            @Override
            public int hashCode() {
                return 0;
            }

            @Override
            public Set<Integer> get(int index) {
                return null;
            }

            @Override
            public Set<Integer> set(int index, Set<Integer> element) {
                return null;
            }

            @Override
            public void add(int index, Set<Integer> element) {

            }

            @Override
            public Set<Integer> remove(int index) {
                return null;
            }

            @Override
            public int indexOf(Object o) {
                return 0;
            }

            @Override
            public int lastIndexOf(Object o) {
                return 0;
            }

            @Override
            public ListIterator<Set<Integer>> listIterator() {
                return null;
            }

            @Override
            public ListIterator<Set<Integer>> listIterator(int index) {
                return null;
            }

            @Override
            public List<Set<Integer>> subList(int fromIndex, int toIndex) {
                return null;
            }
        };
        for (int i = 0; i < n; i++) graph.add(new HashSet<>());
        for (int[] connection : connections) {
            int u = connection[0], v = connection[1];
            graph.get(u).add(v);
            graph.get(v).add(u);
        }

        int[] visited = new int[n];
        int components = 0;
        for (int i = 0; i < n; i++) {
            if (visited[i] == 0) {
                components++;
                dfs(i, graph, visited);
            }
        }

        return components - 1;
    }

    private int dfs(int node, List<Set<Integer>> graph, int[] visited) {
        if (visited[node] != 0) return 0;
        visited[node] = 1;
        for (int neighbor : graph.get(node)) dfs(neighbor, graph, visited);
        return 1;
    }
}
