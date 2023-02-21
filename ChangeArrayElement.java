/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class ChangeArrayElement {
    public static void main(String[] args){
        String[] Cars = {"volvo \t","BMW \t","ford \t", "Mazda \t"};
        Cars[1]= "Audi\t";
        for(int i =0; i<Cars.length;i++){
            System.out.print(Cars[i]); //System.out.print(i);
        }
    
    }
    
}
