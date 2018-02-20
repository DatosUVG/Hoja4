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
public class Node2<E> {
    protected Node2<E> next;
    protected E item;
    
    public Node2(E item, Node2<E> next){
        this.item = item;
        this.next = next;
    }
    
    public void setItem(E item){
        this.item = item;
    }
    
    public E getItem(){
        return item;
    }
    
    public void setNext(Node2<E> next){
        this.next = next;
    }
    
    public Node2<E> getNext(){
        return next;
    }
    
}
