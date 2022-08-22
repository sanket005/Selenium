package Constructor;

public class Cons1 {
public Cons1() {
	System.out.println("zero para constructor");
	}

	public Cons1(int a,int b) {
		System.out.println("int int constructor");
		}
	
	public Cons1(char C) {
		System.out.println("single para constructor");

	}
	public static void main(String[] args) {
		Cons1 c1= new Cons1();
		Cons1 c2= new Cons1('M');
		Cons1 c3= new Cons1(12,12);
		

	}

}
