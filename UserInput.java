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
public class UserInput {
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int number;
        System.out.println("Enter any number: ");
        number = input.nextInt();
        System.out.println("number: "+number);
        
    }
}
