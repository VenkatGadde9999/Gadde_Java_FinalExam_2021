/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question10_InfiniteRecursion;
import java.util.Scanner;
/**
 *
 * @author 16055
 */
public class InfiniteFactorialRecursion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		long factorial = infiniteRecursionFactorial(num);
		System.out.println(num + "! = " + factorial);
		sc.close();
    }
    
    public static long infiniteRecursionFactorial(int num) {
		return num * infiniteRecursionFactorial(num - 1);
	}
}
