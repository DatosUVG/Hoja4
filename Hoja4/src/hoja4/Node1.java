/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hoja4;

/**
 *
 * @author andyq
 */
public class Node1<E> {

    protected Node1<E> next;
    protected Node1<E> prev;
    protected E item;

    public Node1(E item, Node1<E> next, Node1<E> prev) {
        this.next = next;
        this.prev = prev;
        this.item = item;

    }

    public void setItem(E item) {
        this.item = item;
    }

    public E getItem() {
        return item;
    }

    public void setNext(Node1<E> next) {
        this.next = next;
    }

    public Node1<E> getNext() {
        return next;
    }

    public void setPrev(Node1<E> prev) {
        this.prev = prev;
    }

    public Node1<E> getPrev() {
        return prev;
    }

}
