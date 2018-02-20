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
public abstract class AbstractStack<E> implements Stack<E> {
    
    public boolean empty(){
        return size() == 0;
    }

}
