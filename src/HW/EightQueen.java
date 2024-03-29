/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HW;

/**
 *
 * @author Wei
 */
public class EightQueen {
    static int[] result = new int[8]; //八個皇后的位置

    public static void main(String[] args) {
        cal8queens(0);
    }

    public static void cal8queens(int row) {
        if (row == 8) { // 8個皇后都放好了
            printQueens(result);
            return;
        }
        for (int column = 0; column < 8; column++) {
            if (isOk(row, column)) {
                result[row] = column;
                cal8queens(row + 1);
            }
        }
    }

    public static boolean isOk(int row, int column) {
        int leftup = column - 1, rightup = column + 1;
        for (int i = row - 1; i >= 0; i--) {
            if (result[i] == column) return false; // 第i行的column列有棋子嗎？
            if (leftup >= 0) {
                if (result[i] == leftup) return false;
            }
            if (rightup < 8) {
                if (result[i] == rightup) return false;
            }
            leftup--;
            rightup++;
        }
        return true;
    }

    public static void printQueens(int[] result) { 
        for (int row = 0; row < 8; row++) {
            for (int column = 0; column < 8; column++) {
                if (result[row] == column) System.out.print("Q ");
                else System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
