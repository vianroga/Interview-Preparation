/**
 * 
 */
package hackerrank.practice;

import java.util.Scanner;

/**
 * @author Lenovo
 *
 */
public class SolveMeFirst {
	
	static int solveMeFirst(int a, int b) {
	      // Hint: Type return a+b; below
		int suma=a+b;
	    return suma;
		}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner in = new Scanner(System.in);
	        int a;
	        a = in.nextInt();
	        int b;
	        b = in.nextInt();
	        int sum;
	        sum = solveMeFirst(a, b);
	        System.out.println(sum);
	}

}
