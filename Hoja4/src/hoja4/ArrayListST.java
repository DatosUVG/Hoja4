/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hoja4;

import java.util.ArrayList;

/**
 *
 * @author andyq
 */
public class ArrayListST<E> implements Stack<E> {

    protected ArrayList<E> list;

    public ArrayListST() {
        list = new ArrayList();
    }

    @Override
    public void push(E element) {
        list.add(element);
    }

    @Override
    public E pop() {
        return list.remove(list.size() - 1);
    }

    @Override
    public E peek() {
        return list.get(list.size() - 1);
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
