/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midterm_1;

/**
 *
 * @author Wei
 */
import java.util.Scanner;
public class midterm3 {
    
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("輸入：");
        int number = input.nextInt();
        if (number%12==4){
            System.out.println("rat"); 
        }
        else if (number%12==5){
            System.out.println("ox"); 
        }
        else if (number%12==6){
            System.out.println("tiger"); 
        }
        else if (number%12==7){
            System.out.println("rabbit"); 
        }
        else if (number%12==8){
            System.out.println("dragon"); 
        }
        else if (number%12==9){
            System.out.println("snake"); 
        }
        else if (number%12==10){
            System.out.println("horse"); 
        }
        else if (number%12==11){
            System.out.println("sheep"); 
        }
        else if (number%12==0){
            System.out.println("monkey"); 
        }
        else if (number%12==1){
            System.out.println("rooster"); 
        }
        else if (number%12==2){
            System.out.println("dog"); 
        }
        else if (number%12==3){
            System.out.println("pig"); 
        }
    }        
}
