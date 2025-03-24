package m01;

//import java.util.Collections;
//import java.util.List;

import edu.princeton.cs.algs4.Stack;
import edu.princeton.cs.algs4.StdOut;

/**
 * CSIS 2420 Midterm1 coding challenge.
 *
 * @author starter code + Phuc Hoang
 *
 */
public class Module1Test {

	/**
	 * Creates an Iterable<Double> that includes the elements from
	 * stack <code>stack</code> with the following modifications</p>
	 *
	 * <ol type = "A">
	 * <li>Includes only elements from <code>stack</code>
	 *     that are greater -10 and less than 10.
	 * <li>multiply negative numbers with -1 </li>
	 * <li>Replaces 0 with 25 </li>
	 * <li>Adds a second number after each element from <code>stack</code>
	 *     that is twice the number. </li>
	 * <li>Corner cases: <br />
	 * If <code>stack</code> is empty, an empty Iterable<String> should be returned <br />
	 * If <code>stack</code> is null, null should be returned. (No exception)</li>
	 * </ol>
	 *
	 * @param stack
	 * @return the Iterable<Double> created based on the description
	 */
	public static Iterable<Double> challenge(Stack<Double> stack) {
		Stack<Double> result = new Stack<>();
		if (stack == null) {
			return result = null;
		}
		
		//if (stack.isEmpty()) {
		//	return Collections.emptyList();
		//}
		
		
		for (double number : stack) {
			//if (number == null) {
			//	continue;
			//}
			if (number >= -10 && number < 10) {
				 if (number < 0) number *= -1;
				if (number == 0) {
					number = 25;
				}
				result.push(number * 2);
				result.push(number);
			}
		}
		//Collections.reverse((List<?>) result);
		return result;
	}
	
		
	//	  if (stack == null) return null;
	//	  if (stack.isEmpty()) return new ArrayList<>();
	//
	//	  List<Double> result = new ArrayList<>();
	//	     while (!stack.isEmpty()) {
	//	        double n = stack.pop();
	//	         if (n >= -10 && n < 10) {
	//	           if (n < 0) n *= -1;
	//	           else if (n == 0) n = 25;
	//	           	result.add(n);
	//	            result.add(n * 2);
	//	          }
	//	   }
	//
	//	    return result;
 

	/* = = = = = = = = = Test Client = = = = = = = = = */

	// The main method is for your own testing.
	// If you prefer to write JUnit tests to test your code, that's fine, too.

	public static void main(String[] args) {
		System.out.println("Test 1");
		Stack<Double> s = new Stack<>();
		s.push(1.1);
		s.push(-3.3);
		s.push(0d);
		s.push(12.2);
		s.push(4.4);
		s.push(-10.1);

		StdOut.println(s + "=> " + challenge(s));
		// expected output:
		// -10.1 4.4 12.2 0.0 -3.3 1.1 => 4.4 8.8 25.0 50.0 3.3 6.6 1.1 2.2 
	
		//is empty, an empty Iterable<String> should be returned
		System.out.println("Test 2");
		Stack<Double> s2 = new Stack<>();
		StdOut.println(s2 + "=> " + challenge(s2));
		
		//If <code>stack</code> is null, null should be returned. (No exception)</li>
		System.out.println("Test 3");
		Stack<Double> s3 = new Stack<>();
		s3.push(null);
		StdOut.println(s3 + "=> " + challenge(s3));
		
	
	
}
}