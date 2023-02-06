/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.whileloop;

/**
 *
 * @author User
 */
import java.util.Scanner;
public class TableMultiplication {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        System.out.println("Enter any Number: ");
        number = input.nextInt();
        
        for(int i = 1; i<=10; i++){
            System.out.println(number +"x"+ i+"="+ (number * i));
        }
       
        int i = 1;
        
    }
}
