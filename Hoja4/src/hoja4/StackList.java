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
public class StackList<E> implements Stack<E> {

    protected ListU<E> list;

    public StackList(ListU list) {
        this.list = list;
    }

    @Override
    public void push(E element) {
        list.addLast(element);
    }

    @Override
    public E pop() {
        return list.removeLast();
    }

    @Override
    public E peek() {
        return list.getLast();
    }

    @Override
    public boolean empty() {
        return list.isEmpty();
    }

    @Override
    public int size() {
        return list.size();
    }

}
