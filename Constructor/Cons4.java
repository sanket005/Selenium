package Constructor;
class A{ int i=10;
A(){
	System.out.println("i am A constructor");
	
}void display(){
	System.out.println("i am display method of class A");
}
}
class X{ int i =20;
X(){
	System.out.println("i am X constuctor");
}void display(){
	System.out.println("i am display method of class X");
}
}

public class Cons4 {
	void display() {
		System.out.println("i am display method of class Cons4");
	}
	public static void main(String[] args) {
		System.out.println("main method start");
		A a1=new A();
		  a1.display();
		  System.out.println("class A global variable i= "+a1.i);
		  
		X x1=new X();
		  x1.display();
		  System.out.println("class X globle variable i= "+x1.i);
		  
		Cons4 v1=new Cons4();
		v1.display();
		System.out.println("main method end here");

	}

}
