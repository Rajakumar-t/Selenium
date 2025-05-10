package week1.day2;

import org.apache.commons.math3.stat.descriptive.summary.SumOfSquares;

public class LearnOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 6;
		int b = 9;
		System.out.println("arithmatic");
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a / b);
		System.out.println(a % b);
		System.out.println(a * b);
		System.out.println("comparison");
		System.out.println(a >= b);
		System.out.println(a <= b);
		System.out.println(a == b);
		System.out.println(a != b);
		System.out.println("assigment");
		System.out.println(a = a % 4);
		a += 5;
		System.out.println(a);
		a *= 5;
		System.out.println(a);
		a -= 30;
		System.out.println(a);
		a /= 5;
		System.out.println(a);
		System.out.println("Logic");
		a = 1;
		System.out.println(a + "" + b);
		System.out.println("<<<<");

		System.out.println("----------");
		System.out.println(a & b);
		System.out.println("&&&&&");
		System.out.println(++a + ++a - a--);
		if (a > b) {
			System.out.println("A is less than b");
		} else if (a < b) {
			System.out.println(" A is greater than B");
		} else {

			System.out.println("a is equal to B");
		}
		
			 
		}
	

}
