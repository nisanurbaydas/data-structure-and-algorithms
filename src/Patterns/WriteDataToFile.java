/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algo2final;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class WriteDataToFile {
    public void printDataToFile(File file, String[] array) throws IOException {
        
        String output = "";
        for(int i = 0; i<array.length; i++) {
            if(i!=(array.length-1)) {
                output += array[i] + ",";
            } else {
                output += array[i] + "";
            }
        }
        
        BufferedWriter writer = null;
        try {
            writer = new BufferedWriter(new FileWriter(file));
            writer.write(output);
        } catch ( IOException e ) {
            e.printStackTrace();
        } finally {
          if ( writer != null ) {
            writer.close();
          }
        }
    }
}
