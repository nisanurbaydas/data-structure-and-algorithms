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
public class PatternB {
    public String[] matrixToPatternBArray(String[][] array, int rows, int cols) {
        String[] arrayPatternB = new String[rows*cols];
        int start = 0;
        
        for(int i = 0; i<rows; i++) {
            if(i%2==0) {
                for(int j = 0; j<cols; j++) {
                    arrayPatternB[start] = array[i][j];
                    start++;
                }
            } else {
                for(int j = cols-1; j>=0; j--) {
                    arrayPatternB[start] = array[i][j];
                    start++;
                }
            }
        }
        
        return arrayPatternB;
    }
    
    public String[][] arrayToPatternBMatrix(String[] array, int rows, int cols) {
        int start = 0;
        String[][] matrixPatternB = null;
        for(int i=0; i<rows; i++) {
            for(int j=0; j<cols; j++) {
                matrixPatternB[i][j] = array[start];
                start++;
            }
        }
        
        return matrixPatternB;
    }
    
    public String printArray(String[][] myArray) {
        String output = "";
        for (int h = 0; h < myArray.length; h++) {
            output += printLine(myArray[h]) + "\n";
        }
        return output;
    }

    private String printLine(String[] array) {
        String output = "";

        for (int i = 0; i < array.length; i++) {
            String value = String.format("%3d", array[i]);
            output += value + "\t";
        }

        return output;
    }
}
