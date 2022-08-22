package Constructor;

public class cons_overloading1 {
	int age;
	double salary;
cons_overloading1(){
		System.out.println("i am zero para constructor");
		
	}
cons_overloading1(int a){
	age=a;
	System.out.println("i am int para constructor ");
}
cons_overloading1(double s){
	salary=s;
	System.out.println("i am double para constructor");
}
cons_overloading1(int a,double s){
	age=a;
	salary=s;
	System.out.println("i am int double para constructor");
}

	public static void main(String[] args) {
		System.out.println("Programm start here");
		
		cons_overloading1 m1= new cons_overloading1();
		System.out.println("age= "+m1.age);
		System.out.println("salary= "+m1.salary);
		
		cons_overloading1 m2= new cons_overloading1(12);
		System.out.println("age= "+m2.age);
		System.out.println("salary= "+m2.salary);
		
		cons_overloading1 m3= new cons_overloading1(45000.15);
		System.out.println("age= "+m3.age);
		System.out.println("salary "+m3.salary);
		
		cons_overloading1 m4= new cons_overloading1(40,60000.50);
		System.out.println("age= "+m4.age);
		System.out.println("salary= "+m4.salary);
		
		System.out.println("i am successfully run this programm");
	}

}
