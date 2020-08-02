/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Uri04;

import java.util.Scanner;

/**
 *
 * @author edivan
 */
public class Modelos {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int x;
        boolean teste = true;
        do {
            try {
                x = Integer.parseInt(input.next());
                teste = true;
            } catch (Exception e) {
                System.out.println("NAO");
            }
        } while (!teste);
        //..
        System.out.println("int");
    }

}
