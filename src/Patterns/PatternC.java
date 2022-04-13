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
public class PatternC {
    public String[] matrixToPatternCArray(String array[][], int rows, int cols) {
        int startRow = 0;
        int startCol = 0;
        int start = 0;
        String[] arrayPatternC = new String[rows*cols];
  
        while (startRow < rows && startCol < cols) {
            for (int i = startCol; i < cols; i++) {
                arrayPatternC[start] = array[startRow][i];
                start++;
            } 
            startRow++; 
  
            for (int i = startRow; i < rows; i++) {
                arrayPatternC[start] = array[i][cols - 1];
                start++;
            } 
            cols--; 
  
            if (startRow < rows) { 
                for (int i = cols - 1; i >= startCol; i--) {
                    arrayPatternC[start] = array[rows - 1][i];
                    start++;
                } 
                rows--; 
            } 
  
            if (startCol < cols) { 
                for (int i = rows - 1; i >= startRow; i--) {
                    arrayPatternC[start] = array[i][startCol];
                    start++;
                } 
                startCol++; 
            } 
        }
        
        return arrayPatternC;
    }
}
