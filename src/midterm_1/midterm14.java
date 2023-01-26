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
public class midterm14 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("輸入一字串為：");
        String str=scanner.next();   
        System.out.println("There are "+str.length()+" characters");
    }
}
