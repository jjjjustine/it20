/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MultidimensionalArray;

/**
 *
 * @author Jane Justine
 */
public class MultidimensionalArray {
     public static void main(String[] args) {
              String[][] program = {
            {"***", "**", "***"},
            {"*", "****", "*****"},
            {"**", "***", "****"}
        };
             
        for (int i = 0; i < program.length; i++) { 
            for (int j = 0; j < program[i].length; j++) { 
                System.out.print(program[i][j] + " ");
            }
            System.out.println();
     }
     }
}
