package map;

import java.util.function.Function;

class Solution {

    static <T, R> Node<R> map(Node<T> head, Function<T, R> f) {

        if (head == null) return null;

        Node<R> newHead = new Node<R>(f.apply(head.data));
        Node<R> second = newHead;

        while(head.next != null){
            head = head.next;
            second.next = new Node<R>(f.apply(head.data));
            second = second.next;
        }
        return newHead;
    }
}
/*
    Implement the method map, which accepts a linked list (head) and a mapping function, and returns a new linked list
     (head) where every element is the result of applying the given mapping method to each element of the original list.

        Make sure you do not modify the original list!

        For example: Given the list: 1 -> 2 -> 3, and the mapping function x => x * 2, map should return 2 -> 4 -> 6*/
