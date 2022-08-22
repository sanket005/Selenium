package Constructor;

public class Cons3 {
	int roll;
	double salary;
	Cons3(int a,int b){
		roll=a;
		salary=b;
	}
void display() {
	System.out.println(roll+" "+salary);
}
	public static void main(String[] args) {
	    Cons3 b1=new Cons3(101,50000);
	    Cons3 b2=new Cons3(200,15000);
	    b1.display();
	    b2.display();

	}

}
