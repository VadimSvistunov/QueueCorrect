package com.company;

public class Queue {

    Node first = null;
    Node last = null;
    int size = 0;

    void add(int data) {
        if(first == null) {
            first = new Node(data);
            last = first;
        } else {
            last.next = new Node(data);
            last = last.next;
        }
        size++;
    }

    void clear() {
        first.next = null;
        first = null;
        last = null;
    }

    void show(int traffic) {
        Node current = getFirst();
        boolean flag = true;
        do{
            for(int i = 0; i < traffic; i++) {
                if(current != null) {
                    System.out.printf("%d ", current.data);
                    current = getFirst();
                } else {
                    flag = false;
                    break;
                }
            }
            System.out.println("");
        }while(flag);
        System.out.println("");
    }

    private Node getFirst() {
        if(first != null) {
            Node node = first;
            if (first == last) {
                first = null;
            } else {
                first = first.next;
            }
            return node;
        }
        return null;

    }

    int showFirst() {
        return first.data;
    }

    int getSize() {
        return size;
    }

    int getFirstData() {
        int data = first.data;
        if(first == last) {
            first = null;
        } else {
            first = first.next;
        }
        return data;
    }

    boolean isEmpty() {
        return first == null;
    }

    class Node {
        Node next;
        int data;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }
}
