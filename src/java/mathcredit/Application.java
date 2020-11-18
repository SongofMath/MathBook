/**
 * 
 */
package mathcredit;

import java.util.List;

import mathcredit.mathbook.SieveOfAtkin;

/**
 * @author bill
 * 
 */
public class Application {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> primes = SieveOfAtkin.getPrimes(100,1000);
		System.out.println(primes);
	}
	
	/*
	 * Proof of SieveOfAtkin
	 */
	
	/*
	 * target: obtaining primes of 32-bits 
	 */

}
