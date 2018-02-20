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
public class Factory {
    
    
    public static Stack createSt(int opt){
        Stack a = null;
        if(opt == 0){
            a = new ArrayListST();
        }
        if(opt == 1){
            a = (Stack) new StackVector();
        }
        if(opt == 2){
            a = new StackList(new ListF<>());
        }
        if(opt == 3){
            
        }
        if(opt == 4){
            a = new StackList((ListU) new ListF());
        }
        return a;
    }
}
