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
public class midterm5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("請輸入階乘值M：");
        int m = input.nextInt();
        int n=1;
        int i=1; 
        while(i<m){
            i=i*n;
            n=n+1;            
        }
        System.out.println("超過M為"+m+"的最小階層N值為:"+(n-1));
    }  
}
