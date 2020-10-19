package com.cg.hashtable;

public class LinkedList<K,V> {
        private MyMapNode head = null;
        private MyMapNode tail = null;

        public void append(MyMapNode end) {

            MyMapNode node = head;
            tail = end;
            if (head == null) {
                head = end;
            } else {
                while (node.getNext() != null) {
                    node = node.getNext();

                }
                node.setNext(end);
            }
        }

        public MyMapNode<K,V> search(K key) {
            MyMapNode temp = head;
            while (temp != null) {
                if (temp.getKey().equals(key)) {
                    return temp;
                }
                temp = temp.getNext();
            }
            return null;
        }

        public void printLinkedList() {
            MyMapNode node = head;
            while (node != null) {
                System.out.print(node);
                if (node != tail) {
                    System.out.print(" -> ");
                }
                node = node.getNext();
            }
        }
    }

