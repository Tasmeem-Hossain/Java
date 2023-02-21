
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class SumNumber {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int number;
        int sum =0;
        int i = 1;
        System.out.println("Enter any number: ");
        number = input.nextInt();
        while (i <= number){
            sum += i;
            System.out.println("Sum is: "+ sum);
            i++;
            System.out.println("\n");
           
        }
        
    }
    
}
