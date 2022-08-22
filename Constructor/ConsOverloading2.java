package Constructor;

public class ConsOverloading2 {
	
	ConsOverloading2() {
		System.out.print("Zero Parameterized Constructor");
		System.out.println(" having no parameters");
	}
	ConsOverloading2(int a) {
		System.out.print("Parameterized Constructor");
		System.out.println(" having int parameters");
	}
	ConsOverloading2(double b) {
		System.out.print("Parameterized Constructor");
		System.out.println(" having double parameters");
	}
	ConsOverloading2(int a, double b, int c) {
		System.out.print("Parameterized Constructor");
		System.out.println(" having int,double,int parameters");
	}	
	ConsOverloading2(double a, int b, int c) {
		System.out.print("Parameterized Constructor");
		System.out.println(" having double,int,int parameters");
	}
	public static void main(String args[]) {
		ConsOverloading2 pc5 = new ConsOverloading2();
		ConsOverloading2 pc1 = new ConsOverloading2(12);
		ConsOverloading2 pc2 = new ConsOverloading2(13.34);
		ConsOverloading2 pc3 = new ConsOverloading2(10,13.34,45);
		ConsOverloading2 pc4 = new ConsOverloading2(13.34,23,87);
	}
}
/**
 * Constructor Overloading: more than on constructor in a  class
 * Rule: 
 * 1. type of args differ or
 * 2. number of args differ or
 * 3. position of args differ
 * 
 */
