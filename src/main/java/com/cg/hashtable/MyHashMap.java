package com.cg.hashtable;

public class MyHashMap<K, V> {
    LinkedList<K,V> list;

    public MyHashMap(){
        this.list = new  LinkedList<>();
    }

    public V get(K key) {
        MyMapNode<K,V> mapNode = (MyMapNode<K, V>) list.search(key);
        return (mapNode == null) ? null : mapNode.getValue();
    }

    public void add(K key, V value) {
        MyMapNode<K,V> mapNode = (MyMapNode<K, V>) list.search(key);
        if(mapNode==null){
            mapNode = new MyMapNode<>(key,value);
            list.append(mapNode);
        }
        else
            mapNode.setValue(value);
    }

    @Override
    public String toString() {
        return "HashNodes {"+ list + "}";
    }
}
