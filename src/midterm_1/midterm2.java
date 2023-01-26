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
public class midterm2 {
    
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double s,ns=0;
        Scanner input = new Scanner(System.in);
        System.out.println("輸入一個度數(正整數)：");
        int number = input.nextInt();
        if (number<=120){
            s=number*2.1;
            ns=number*2.1;
            System.out.println("Summer months: "+s); 
            System.out.println("Non-Summer months: "+ns);
        }
        else if (number>120 && number<=330){
            s=120*2.1+(number-120)*3.02;
            ns=120*2.1+(number-120)*2.68;
            System.out.println("Summer months:"+s); 
            System.out.println("Non-Summer months:"+ns);
        }        
        else if (number>330 && number<=500){
            s=120*2.1+210*3.02+(number-330)*4.39;
            ns=120*2.1+210*2.68+(number-330)*3.61;
            System.out.println("Summer months: "+s); 
            System.out.println("Non-Summer months: "+ns);
        }   
        else if (number>500 && number<=700){
            s=120*2.10+210*3.02+170*4.39+(number-500)*4.97;
            ns=120*2.10+210*2.68+170*3.61+(number-500)*4.01;
            System.out.println("Summer months: "+s); 
            System.out.println("Non-Summer months: "+ns);
        }
        else if (number>700){
            s=120*2.10+210*3.02+170*4.39+200*4.97+(number-700)*5.63;
            ns=120*2.10+210*2.68+170*3.61+200*4.01+(number-700)*4.50;
            System.out.println("Summer months: "+s); 
            System.out.println("Non-Summer months: "+ns);
        }
    } 
}
