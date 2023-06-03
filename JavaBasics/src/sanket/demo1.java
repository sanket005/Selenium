package sanket;
public class demo1{
	public static double Triangle(double l,double h) {
		return 0.5*(l*h);
	}
	private static float Circle(float r) {
		return 3.14f*r*r;
	}
	public double Rectangle(int l, int b) {
		return l*b;
	}
	public double Square(int l) {
		return l*l;
	}
	
	public static void main(String[] args) {
	double p=10, q=10;
	demo1 m1=new demo1();
	demo1 m2=new demo1();
	System.out.println("area of triangle:" + demo1.Triangle(4,5));
	System.out.println("area of triangle:"+demo1.Triangle(p,q));
	System.out.println("area of Circle:"+demo1.Circle(40));
	System.out.println("area of rectangle; "+m1.Rectangle(15,15));
	System.out.println("area of Square; "+m2.Square(15));
}
	
	}

