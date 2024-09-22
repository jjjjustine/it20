/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DisplayViaForLoop;

/**
 *
 * @author Jane Justine
 */
public class DisplayViaForLoop {
     public static void main(String[] args) {
     String[][] Asterisk = {
            {"***", "**", "***"},
            {"*", "****", "*****"},
            {"**", "***", "****"}
        };

        System.out.println("Asterisks:");
        for (int i = 0; i < Asterisk.length; i++) { 
            for (int j = 0; j < Asterisk[i].length; j++) {
                System.out.print(Asterisk[i][j] + " "); 
            }
            System.out.println();
        }
}
}
