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
public class ListF<E> extends AbstractList<E>
{
    protected Node2<E> tip;
    protected int size;
    
    public ListF()
    {
        tip = null;
        size = 0;
    }

    public int size() 
    {
        return size;
    }

    public E get(int j) 
    {
        if(j < 0 || j > size -1)
        {
            return null;
        }
        else
        {
            Node2<E> curNode = tip;
            for(int i = 0; i < j; i++)
            {
                curNode = curNode.getNext();
            }
            return curNode.getItem();
        }
    }

    public E remove(int j) 
    {
        if(j < 0 || j > size -1)
        {
            return null;
        }
        
        else
        {            
            E temp = null;
            Node2<E> curNode = tip;
            if(size == 1)
            {
                temp = tip.getItem();
                tip = null;
                size = 0;
            }
            
            else
            {
                for(int i = 0; i < j-1; i++)
                {
                    curNode = curNode.getNext();
                }
            
                temp = curNode.getNext().getItem();
                curNode.setNext(curNode.getNext().getNext());
                size = size - 1;
                
            }
            
            return temp;
        }
    }

    public void add(int j, E u) 
    {
        if(j < 0 || j > size)
        {
            return;
        }
        else
        {
            if(tip == null)
            {
                tip = new Node2<E>(u, null);
            }
            Node2<E> curNode = tip;
            for(int i = 0; i < j-1; i++)
            {
                curNode = curNode.getNext();
            }
            Node2<E> nuevoNodo = new Node2(u, curNode.getNext());
            curNode.setNext(nuevoNodo);
        }
        size = size + 1;
    }
}
