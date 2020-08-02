/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cinema;

import static Cinema.Cinema02.c1;

/**
 *
 * @author edivan
 */
public class matriz {

    public static void main(String[] args) {

        for (int i = 0; i < 3; i++) {
            System.out.printf((char) ('A' + 0) + " ");
            for (int j = 0; j < 3; j++) {
                System.out.printf(" ",j);
                if (c1[i][j] == 0) {
//                    System.out.printf((char) ('A' + i) + "" + j + " Livre\n");
                    
                }
            }
        }
    }
}
