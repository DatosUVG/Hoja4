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
public interface ListU<E> {
    
    //For number of elements
    public int size();
    
    //Boolean that checks if a list is empty
    public boolean isEmpty();
    
    //Adds an element at the start
    public void addFirst(E value);
    
    //Adds an element to the end
    public void addLast(E value);
    
    //returns the first value
    public E getFirst();
    
    //Returns the last value
    public E getLast();
    
    //Removes the first value
    public E removeFirst();
    
    //Removes the last value
    public E removeLast();
    
    //Adds to the end of the list
    public void add(E value);
    
    //Removes from the end of the list
    public E remove();
    
    //Returns the last value in a desired list
    public E get();
    
    
    public E get(int j);
    public E remove(int j);
    
    //Adds in between a list
    public void add(int j, E u);
    
}
