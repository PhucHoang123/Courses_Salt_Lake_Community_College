package m01;

import edu.princeton.cs.algs4.Stack;
import edu.princeton.cs.algs4.StdOut;

/**
 * CSIS 2420 Midterm1 coding challenge.
 *
 * @author starter code + ............... // TODO 1: replace dots with your name
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
		if (stack == null)
			 return null;
			Stack<Double> s = new Stack<>();
			while (!stack.isEmpty()) {
			 double num = stack.pop();
			 if (num > -10 && num < 10) {
			  if (num < 0) {
			   num *= -1;
			  } else if (num == 0) {
			   num = 25;
			  }
			  s.push(num);
			  s.push(num * 2);
			 }
			}

			return s;  // TODO 2
	}
	

	/* = = = = = = = = = Test Client = = = = = = = = = */

	// The main method is for your own testing.
	// If you prefer to write JUnit tests to test your code, that's fine, too.

	public static void main(String[] args) {
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

		Stack<Double> s1 = new Stack<>();
		s1.push(2.2);
		s1.push(-9.9);
		s1.push(-4.4);
		s1.push(-8.8);
		StdOut.println(s1 + "=> " + challenge(s1));
		// expected output:
		// -8.8 -4.4 -9.9 2.2 => 4.4 8.8 9.9 18.8
		// TODO 3: add code (or write jUnit tests) for more complete testing
		}

}
