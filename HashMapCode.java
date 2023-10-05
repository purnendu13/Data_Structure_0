import java.util.LinkedList;

public class HashMapCode {
    static class HashMap<K,V>{
        private class Node{
            K key;
            V value;
            Node(K key,V value){
                this.key=key;
                this.value=value;
            }
        }
        private int n; // no of nodes
        private int N; // no of bucket or array size
        private LinkedList<Node>buckets[]; //N = buckets.length

        public HashMap(){
            this.N=4;
            this.buckets=new LinkedList[4];
            for (int i = 0; i < 4; i++) {
                    this.buckets[i]=new LinkedList<>();
            }
        }
        public void put(K key,V value){

        }
        public boolean isContains(K key){
            return false;
        }
        public V remove(K key){
            return null;
        }
        public V get(K key){
            return null;
        }


    }
    public static void main(String[] args) {

    }
}
