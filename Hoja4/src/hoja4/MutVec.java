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
public class MutVec<E> {
    public Object[] a;
    int pos;
    public MutVec(){
        this(10);
    }
    
    public MutVec(int i){
        a = new Object[i];
    }
    
    public void add(E element){
        adj(pos ++);
        a[pos++] = element;
    }
    
    public E get(int i){
        return (E)a[i];
    }
    
    public E remove(int i){
        E tmp = (E)a[i];
        if(pos < a.length){
            for(int j; j < pos; j++){
                a[j] = a[j++];
            }
            a[pos--] = null;
        }
        else{
            a[pos-1] = null;
            pos--;
            
        }
        return tmp;
    }
    
    public boolean isEmpty(){
        if(pos == 0){
            return true;
        }
        else{
            return false;
        }
    }
    
    public int size(){
        return pos;
    }
    
    public void adj(int i){
        if(i > a.length){
            Object[] newA = new Object[i*2];
            for(int j = 0; j < a.length; j++){
                newA[j] = a[i];
            }
            a = newA;
        }
    }
}
