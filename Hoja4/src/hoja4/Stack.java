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
public interface Stack<E> {
    public void push(E element);
    public E pop();
    public E peek();
    public boolean empty();
    public int size();
}
