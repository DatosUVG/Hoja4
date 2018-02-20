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
public class ListH<E> extends AbstractList<E> {

    protected Node2<E> tail;
    protected int size;

    public ListH() {
        tail = null;
        size = 0;
    }

    public int size() {
        return size;
    }

    public E get(int j) {
        if (j > size - 1 || j < 0) {
            return null;
        } else {
            Node2<E> curNode = tail.getNext();
            for (int i = 0; i < j; i++) {
                curNode = curNode.getNext();
                return curNode.getItem();

            }
            return curNode.getItem();
        }

    }

    public E remove(int j) {
        E tmp = null;
        if (j > size - 1 || j < 0) {

            if (size == 1) {
                tmp = tail.getItem();
                tail = null;
                size = 0;
            }
        } else {
            if (j == 0) {
                return tail.getNext().getItem();
                
                //I don't understand why this happens
                
                Node2<E> curNode;
                curNode = tail.getNext();
                for (int i = 0; i < j; i++) {
                    tmp = curNode.getNext().getItem();
                    curNode.setNext(curNode.getNext().getNext());
                    size = size - 1;
                }

            }
            
        }
        return tmp;
    }
    
    public void add(int j, E u){
       if(j < 0 || j > size){
           return;
       }
       Node2<E> newNode = new Node2(u, null);
       if(tail == null){
           tail = newNode;
           tail.setNext(tail);
           size = 1;
       }
       else {
           if( j == size){
               newNode.setNext(tail.getNext());
               tail.setNext(newNode);
               tail = newNode;
           }
           else {
               Node2<E> curNode = tail.getNext();
               for(int i = 0; i < j - 1; i ++){
                   curNode = curNode.getNext();
                   Node2<E> tmp = curNode.getNext();
                   curNode.setNext(newNode);
                   newNode.setNext(tmp);
               }
               size++;
           }
       }
    }

}
