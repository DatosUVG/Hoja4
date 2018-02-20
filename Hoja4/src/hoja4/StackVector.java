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
public class StackVector<E> implements Stack<E> {

    public MutVec vector;
    public int count;

    public StackVector() {
        vector = new MutVec();
        count = 0;
    }

    @Override
    public void push(E element) {
        vector.add(element);
    }

    @Override
    public E pop() {
        if (count == 0) {
            throw new IllegalStateException("Empty");
        }
        E elements = (E) vector.remove(count - 1);
        count = count - 1;
        return elements;
    }

    @Override
    public E peek() {
        if (count == 0) {
            throw new IllegalStateException("Empty");

        }
        E elements = (E) vector.get(count - 1);
        return elements;
    }

    @Override
    public boolean empty() {
        if (count != 0) {
            return false;
        }
        return true;
    }

    @Override
    public int size() {
        return count;
    }

}
