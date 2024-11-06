package org.example;

public class OwnHashMap<K, V> {

    private class Entry<K, V>{

        private K key;
        private V val;
        private Entry<K, V> next;

        public Entry(K key, V val){
            this.key = key;
            this.val = val;
        }

        public K getKey() {
            return key;
        }

        public void setKey(K key) {
            this.key = key;
        }

        public V getVal() {
            return val;
        }

        public void setVal(V val) {
            this.val = val;
        }

        @Override
        public String toString() {
            Entry<K,V> temp = this;
            StringBuilder sb = new StringBuilder();
            while (temp != null) {
                sb.append(temp.key + " -> " + temp.val + ",");
                temp = temp.next;
            }
            return sb.toString();
        }
    }

    private final int SIZE = 5;

    private Entry<K, V> table[];

    public OwnHashMap(){
        table = new Entry[SIZE];
    }

    public void put(K key, V val){

        // can check for null

        // can also create own hashcode
        int hash = key.hashCode();
        int index = hash % SIZE;

        Entry<K, V> entry = table[index];

        if(entry == null){
            table[index] = new Entry<>(key, val);
        }

        else{
            while (entry.next != null){
                if(entry.getKey().equals(key)){
                    // key already exist
                    entry.setVal(val);
                    return;
                }
                entry = entry.next;
            }

            if(entry.getKey().equals(key)){
                // key already exist
                entry.setVal(val);
                return;
            }

            entry.next = new Entry<>(key,val);
        }
    }

    public V get(K key){

        // can check if key is not null

        int hash = key.hashCode();
        int index = hash % SIZE;

        Entry<K, V> entry = table[index];

        if(entry == null){
            return null;
        }

        while (entry != null){

            if(entry.getKey().equals(key))
                return entry.getVal();

            entry = entry.next;
        }

        return null;
    }

    public Entry<K, V> remove(K key){

        int hash = key.hashCode();
        int index = hash % SIZE;

        Entry<K, V> entry = table[index];

        if(entry == null){
            return null;
        }

        if(entry.getKey().equals(key)){
            table[index] = entry.next;
            entry.next = null;

            return entry;
        }

        Entry<K, V> prev = entry;
        entry = entry.next;

        while (entry != null){
            if(entry.getKey().equals(key)){
                prev.next = entry.next;
                entry.next = null;

                return entry;
            }

            prev = entry;
            entry = entry.next;
        }

        return null;
    }

    @Override
    public String toString(){

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < SIZE; i++) {
            if (table[i] != null) {
                sb.append(i + " " + table[i] + "\n");
            } else {
                sb.append(i + " " + "null" + "\n");
            }
        }

        return sb.toString();
    }

}
