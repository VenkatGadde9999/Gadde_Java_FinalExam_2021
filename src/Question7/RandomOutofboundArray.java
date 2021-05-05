/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question7;

import java.util.Scanner;

/**
 *
 * @author 16055
 */
public class RandomOutofboundArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int[] Array = new int[100];
        for (int i = 0; i < 100; i++) {
            Array[i] = (int) (Math.random() * 100);
        }
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter index: ");

        try {
            // Display the corresponding element value
            System.out.println("The corresponding element is "
                    + Array[scanner.nextInt()]);
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Out of Bounds.");
        }
    }

}
