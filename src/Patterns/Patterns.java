/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Patterns;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author nisanurbaydas
 */
public class Patterns {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        
        Scanner read = new Scanner(System.in);
        System.out.print("Dosya Yolunu Gir : ");
        String filePath = read.next();
        
        File file = new File(filePath);
        ReadDataFromFile data = new ReadDataFromFile();
        
        while(!file.exists() || file.length() == 0) {
            System.out.println("Dosya boş veya böyle bir dosya yok");
            System.out.print("Dosya Yolunu Tekrar Gir : ");
            filePath = read.next();

            file = new File(filePath);
            data = new ReadDataFromFile();
        }

        String[] dataToArray = data.dataToArray(file); //Dosyadan dizi oluşturma
        
        System.out.print("Satır Sayısı Gir : ");
        int rows = read.nextInt();

        System.out.print("Sütun Sayısı Gir : ");
        int cols = read.nextInt();
        System.out.println("\n");
        
        while((rows * cols) == 0 || (rows * cols) > dataToArray.length) {
            System.out.println("Satır ve Sütun çarpımı 0 veya dosyadaki verinin uzunluğundan büyük olamaz");
            
            System.out.print("Satır Sayısını Tekrar Gir : ");
            rows = read.nextInt();

            System.out.print("Sütun Sayısını Tekrar Gir : ");
            cols = read.nextInt();
        }
        
        
        System.out.println("Dosyadaki Veri Dizisi");
        System.out.println(Arrays.toString(dataToArray)); //Dosyadan diziyi yazdırma
        System.out.println("\n");
        
        String[][] arrayToMatrix = data.arrayToMatrix(dataToArray, rows, cols); //Diziden matris oluşturma
        System.out.println("Dosyadaki Verinin Matrise Donüştürülmesi");
        data.printMatrix(arrayToMatrix, rows, cols);
        System.out.println("\n");
        
        
        /** Pattern A işlemleri, 
         * klasik matris okuması olduğu için sadece okuma yapıp ekrana yazıyoruz.
         */
        PatternA patternA = new PatternA();
        System.out.println("Pattern A'ye göre Matrisin okunup ekrana basılması");
        patternA.printMatrix(arrayToMatrix, rows, cols);
        System.out.println("\n");
        
        
        // Pattern-A'ya göre dosya oluşturulup yazılması
        WriteDataToFile writeDataToFile = new WriteDataToFile();
        File fileA = new File("fileA.txt");
        writeDataToFile.printDataToFile(fileA, dataToArray);
        
        
        /** 
         * Pattern B islemleri.
         */
        PatternB patternB = new PatternB();
        String[] matrixToPatternBArray = patternB.matrixToPatternBArray(arrayToMatrix, rows, cols);
        System.out.println("Pattern B'ye göre Matrisin okunup yeni diziye dönüştürülmesi");
        System.out.println(Arrays.toString(matrixToPatternBArray));
        System.out.println("\n");
        
        // Pattern-B'ya göre dosya oluşturulup yazılması
        File fileB = new File("fileB.txt");
        writeDataToFile.printDataToFile(fileB, matrixToPatternBArray);
        
        String[][] arrayBToMatrix = data.arrayToMatrix(matrixToPatternBArray, rows, cols);
        System.out.println("Pattern B'ye göre yeni Matris Oluşturulması");
        data.printMatrix(arrayBToMatrix, rows, cols);
        System.out.println("\n");
        
        
        /** Pattern C işlemleri
         * Not: Sprial, dıştan içe okunmuştur...
         */
        PatternC patternC = new PatternC();
        String[] matrixToPatternCArray = patternC.matrixToPatternCArray(arrayToMatrix, rows, cols);
        System.out.println("Pattern C'ye göre Matrisin okunup yeni diziye dönüştürülmesi");
        System.out.println(Arrays.toString(matrixToPatternCArray));
        System.out.println("\n");
        
        // Pattern-B'ya göre dosya oluşturulup yazılması
        File fileC = new File("fileC.txt");
        writeDataToFile.printDataToFile(fileC, matrixToPatternCArray);
        
        String[][] arrayCToMatrix = data.arrayToMatrix(matrixToPatternCArray, rows, cols);
        System.out.println("Pattern C'ye göre yeni Matris Oluşturulması");
        data.printMatrix(arrayCToMatrix, rows, cols);
        System.out.println("\n");
        
        
        /** 
         * Pattern D işlemleri.
         */
        PatternD patternD = new PatternD();
        String[] matrixToPatternDArray = patternD.walkArray(arrayToMatrix, rows, cols);
        System.out.println("Pattern D'ye göre Matrisin okunup yeni diziye dönüştürülmesi");
        System.out.println(Arrays.toString(matrixToPatternDArray));
        System.out.println("\n");
        
        // Pattern-B'ya göre dosya oluşturulup yazılması
        File fileD = new File("fileD.txt");
        writeDataToFile.printDataToFile(fileD, matrixToPatternDArray);
        
        String[][] arrayDToMatrix = data.arrayToMatrix(matrixToPatternDArray, rows, cols);
        System.out.println("Pattern D'ye göre yeni Matris Oluşturulması");
        data.printMatrix(arrayDToMatrix, rows, cols);
        System.out.println("\n");
        
        
        /** 
         * Pattern G işlemleri.
         */
        PatternG patternG = new PatternG();
        String[] matrixToPatternGArray = patternG.matrixToPatternGArray(arrayToMatrix, rows, cols);
        System.out.println("Pattern G'ye göre Matrisin okunup yeni diziye dönüştürülmesi");
        System.out.println(Arrays.toString(matrixToPatternGArray));
        System.out.println("\n");
        
        // Pattern-B'ya göre dosya oluşturulup yazılması
        File fileG = new File("fileG.txt");
        writeDataToFile.printDataToFile(fileG, matrixToPatternGArray);
        
        String[][] arrayGToMatrix = data.arrayToMatrix(matrixToPatternGArray, rows, cols);
        System.out.println("Pattern G'ye göre yeni Matris Oluşturulması");
        data.printMatrix(arrayGToMatrix, rows, cols);
        System.out.println("\n");
    }
    
}
