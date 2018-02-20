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
public abstract class AbstractList<E> implements ListU<E> {
    
    public AbstractList(){
    
    }
    
    public boolean isEmpty(){
        return size() == 0;
    }
    
    public void addLast(E value){
        add(size(), value);
    }
    
    public void addFirst(E value){
        add(0, value);
    }
    
    public E getFirst(){
        return get(0);
    }
    
    public E getLast(){
        return get(size()-1);
    }
    
    public E removeFirst(){
        return remove(0);
    }
    
    public E removeLast(){
        return remove(size() - 1);
    }
    
    public void add(E value){
        addLast(value);
    }
    
    public E remove(){
        return removeLast();
    }
    
    public E get(){
        return getLast();
    }
    
    
}
