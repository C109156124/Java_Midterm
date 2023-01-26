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
public class midterm4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here       
        Scanner input = new Scanner(System.in);
        System.out.println("X軸座標：");
        int x = input.nextInt();
        System.out.println("Y軸座標：");       
        int y = input.nextInt();
        int z = x*x+y*y;      
        if(x==0 && y==0){
            System.out.println("該點位於原點");
        }
        else if(x>0 && y==0){
            System.out.println("該點位於右半平面X軸上，離原點距離為根號"+z);
        }
        else if(x<0 && y==0){
            System.out.println("該點位於左半平面X軸上，離原點距離為根號"+z);
        }
        else if(x==0 && y>0){
            System.out.println("該點位於上半平面Y軸上，離原點距離為根號"+z);
        }
        else if(x==0 && y<0){
            System.out.println("該點位於下半平面Y軸上，離原點距離為根號"+z);
        }
        else if(x>0 && y>0){
            System.out.println("該點位於第一象限，離原點距離為根號"+z);
        }
        else if(x<0 && y>0){
            System.out.println("該點位於第二象限，離原點距離為根號"+z);
        }
        else if(x<0 && y<0){
            System.out.println("該點位於第三象限，離原點距離為根號"+z);
        }
        else if(x>0 && y<0){
            System.out.println("該點位於第四象限，離原點距離為根號"+z);
        }
    }    
}
