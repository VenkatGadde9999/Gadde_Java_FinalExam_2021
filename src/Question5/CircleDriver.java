/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question5;

/**
 *
 * @author 16055
 */
public class CircleDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ComparableCircle FirstCircle = new ComparableCircle(5.0);
        ComparableCircle SecondCircle = new ComparableCircle(3.0);
        int compare = FirstCircle.compareTo(SecondCircle);
        if (compare == 1) {
            System.out.println("FirstCircle is larger");
        } else if (compare == -1) {
            System.out.println("SecondCircle is larger");
        } else {
            System.out.println("Both Circles are of equal area.");
        }

    }
    
}
