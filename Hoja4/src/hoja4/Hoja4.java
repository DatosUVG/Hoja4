/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hoja4;

import java.util.List;
import java.util.Scanner;

/**
 *
 * @author andyq
 */
public class Hoja4 {

     public static void main(String[] args) 
    {
        System.out.println("Enter your option: ");
        System.out.println("0 for a  ArrayList for Stacks");
        System.out.println("1 for Vectors in Stacks");
        System.out.println("2 for simple lists");
        System.out.println("3 for double lists");
        System.out.println("4 For Stack lists (And to calculate)");
        try
        {
            Scanner s = new Scanner(System.in);
            int opt = s.nextInt();
            ImpCal.getIns(opt);
            
        }
        catch(Exception e){ System.out.println(e.getMessage()); }
        
        
    }
    
}
