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

import java.util.Stack;

/**
 *
 * @author andyq
 */


public class ImpCal implements Calcu{
    //This section has been taken from the original calculator file
    
    
    //Errors 
    private final String ERROR_INVALID_CHAR = "ERROR: Expression contains an invalid character";
    private final String ERROR_INVALID_DIVISION = "ERROR: This division is not posible";
    private final String ERROR_INSUFFICIENT = "ERROR: Operation couldn't take place because of an error in the document.";
    private final String ERROR_INVALID_EXPRESSION = "ERROR: Expression couldn't be read or understood";
    
    private Stack<Float> stack;
    
    
    public ImpCal(){
        stack = new ImpStack();
    }
    
    /* 
    * @param exp
    * calculates based on the expression
    */
    
    @Override
    public String calcular(String exp){
        String result = " ";
        for(char a : exp.toCharArray()){
            if(a == ' ') continue;
            else if(a <= '9' && a >= '0'){
                stack.push(Float.parseFloat(String.valueOf(a)));
            }
            else {
                if(stack.size() > 1){
                    Float option1 = stack.pop();
                    Float option2 = stack.pop();
                    switch(a){
                        case '+':
                            stack.push(sum(option1, option2));
                            break;
                        case '-':
                            stack.push(substract(option1, option2));
                            break;
                        case '*':
                            stack.push(multiply(option1, option2));
                            break;
                        case 'x':
                            stack.push(multiply(option1, option2));
                            break;
                        case '/':
                            try{
                            stack.push(divide(option1, option2));
                            }
                            catch(IllegalArgumentException e)
                            {
                                return ERROR_INVALID_DIVISION;
                            }
                            break;
                        default:
                            return ERROR_INVALID_CHAR;
                            }
                    }
                else{
                    return ERROR_INSUFFICIENT;
                }
            }
        }
        if(stack.size() == 1){
            result = String.valueOf(stack.pop());
        }
        else
            result = ERROR_INVALID_EXPRESSION;
            return result;
        
        
        
        
        // Basic operations
        
        
    }
    
    
    
    //Basic Operations
     private Float sum(Float x, Float y){
         Float result = x + y;
         return result;
     }
     
     private Float substract( Float x, Float y){
         Float result = x - y;
         return result;
     }
     
    private Float multiply(Float x, Float y){
        Float result = x * y;
        return result;
    }
    
    private Float divide(Float x, Float y){
        Float result = x / y;
        
        if( y==0){
            System.out.println(ERROR_INVALID_DIVISION);
        }
        else{
        result = x / y;
        }
        return result;
    }

    @Override
    public String calculate(String expression) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
