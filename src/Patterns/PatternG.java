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
public class PatternG {

    public String[] matrixToPatternGArray(String array[][], int rows, int cols) {
        String matrixG[][] = new String[rows][cols];

        int a = 0;
        int loop = 0;
        int b = 0;
        int k = 0;
        while (loop < rows / 2) {
            for (int i = 0; i < rows / 2; i++) {
                matrixG[i][a] = array[b][k];
                k = k + 2;
            }
            a++;
            k = 1;
            for (int i = 0; i < rows / 2; i++) {
                matrixG[i][a] = array[b][k];
                k = k + 2;
            }
            a++;
            k = 0;

            loop++;
            b++;
        }
        loop = 0;
        a = 0;
        b = rows / 2;
        k = 0;
        while (loop < rows / 2) {
            if (b == rows) {
                break;
            }
            for (int i = rows / 2; i < rows; i++) {
                matrixG[i][a] = array[b][k];
                k = k + 2;
            }
            a++;
            k = 1;
            for (int i = rows / 2; i < rows; i++) {
                matrixG[i][a] = array[b][k];
                k = k + 2;
            }
            a++;
            k = 0;
            b++;
            loop++;
        }
        
        String[] myArray = new String[rows*cols];
        int start = 0;
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                myArray[start] = matrixG[i][j];
                start++;
            }
        }
        
        return myArray;
    }
}
