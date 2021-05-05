/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question10_Recursion;

/**
 *
 * @author 16055
 */
public class FactorialDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          int number = 4, result;
        result = factorial(number);
        System.out.println(number + " factorial = " + result);
    }
    
    static int factorial( int n ) {
        if (n != 0)  // termination condition
            return n * factorial(n-1); // recursive call
        else
            return 1;
    }
    
}
