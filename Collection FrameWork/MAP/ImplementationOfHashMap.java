import java.util.*;
public class ImplementationOfHashMap {
    static class HashMap<K, V>{
        private class Node {
            K key;
            V value;
            public Node(K key, V value){
                this.key = key;
                this.value = value;
            }
        }
        private int n; // number of nodes
        private int N; // number of buckets
        private LinkedList<Node> buckets[];

    }
}
