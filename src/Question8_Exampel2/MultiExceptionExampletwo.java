/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question8_Exampel2;

/**
 *
 * @author 16055
 */
public class MultiExceptionExampletwo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            myMethod();

        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
      static void myMethod() throws ArithmeticException, NumberFormatException {

        int a = 9;
        int b = 0;
        if (b == 0) {
            throw new ArithmeticException("Arithmetic Exception Occured");
        }
        a = Integer.parseInt(null);
        throw new NumberFormatException("NumberFormat Exception occured");

    }
}
