/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algo2final;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author nisanurbaydas
 */
public class PatternD {

    public String[] walkArray(String[][] myArray, int rows, int cols) {

        List<String> temp = new ArrayList<>(rows * cols);
        List<String> capraz = new ArrayList<>(Math.max(rows, cols));

        boolean tersSirala = true;

        for (int col = rows - 1; col >= 0; col--) {
            for (int row = 0; row < rows && col + row < cols; row++) {
                capraz.add(myArray[row][col + row]);
            }

            if (tersSirala) {
                Collections.reverse(capraz);
            }

            temp.addAll(capraz);
            tersSirala = !tersSirala;
            capraz.clear();
        }

        for (int row = 1; row < rows; row++) {
            for (int col = 0; col < cols && col + row < rows; col++) {
                capraz.add(myArray[col + row][col]);
            }

            if (tersSirala) {
                Collections.reverse(capraz);
            }

            temp.addAll(capraz);
            tersSirala = !tersSirala;
            capraz.clear();
        }

        String[] output = new String[temp.size()];
        for (int i = 0; i < temp.size(); i++) {
            output[i] = temp.get(i);
        }
        return output;
    }
}
