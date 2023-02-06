
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class Power {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int base;
        int power;
        int result = 1;
        System.out.print("Enter a number for base: ");
        base = input.nextInt();
        System.out.print("Enter a number for power: ");
        power = input.nextInt();
        
        for(int i=1; i<=power; i++){
            result = result * base;
            
            
        }
        System.out.print(base+"^"+power+"="+result);
    }
    
}
