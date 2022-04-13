/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algo2final;

/**
 *
 * @author nisanurbaydas
 */
public class PatternA {
    void printMatrix(String[][] array, int rows, int cols) {
        for(int i = 0; i<rows; i++){
            for(int j = 0; j<cols; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println("");
        }
    }
}
