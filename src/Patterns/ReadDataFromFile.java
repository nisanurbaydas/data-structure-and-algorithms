/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algo2final;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author nisanurbaydas
 */
public class ReadDataFromFile {
    String str = null;
    
    String[] dataToArray(File file) {
        try {
            Scanner sc = new Scanner(file);
            while(sc.hasNextLine()){
                str = sc.nextLine();
            }
            sc.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        
        String[] ar = str.split(",");
        return ar;
    }
    
    void printData(String[] array, int len){
        String output = "";
        for(int i = 0; i<len; i++) {
            if(i!=(len-1)) {
                output += array[i] + ",";
            } else {
                output += array[i] + "";
            }
        }
        
        System.out.println(output);
    }
    
    String[][] arrayToMatrix(String[] array, int rows, int cols) {
        String[][] arr = new String[rows][cols];
        int start = 0;
        
        for(int i = 0; i<rows; i++) {
            for(int j = 0; j<cols; j++) {
                arr[i][j] = array[start];
                start++;
            }
        }
        
        return arr;
    }
    
    void printMatrix(String[][] array, int rows, int cols) {
        for(int i = 0; i<rows; i++){
            for(int j = 0; j<cols; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println("");
        }
    }
}
