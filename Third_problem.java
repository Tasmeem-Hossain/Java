/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.forloop;

/**
 *
 * @author User
 */
import java.util.Scanner;
public class Third_problem {
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        int num;
        System.out.print("Enter positive integer: ");
        num = console.nextInt();
        System.out.println("Multiplication Table of" + num);
        for (int i= 1; i<=10; i++)
        {
            System.out.println(num +"x"+ i+"="+(num*i));
        }
                
    }
    
}
