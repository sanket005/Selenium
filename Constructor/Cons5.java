package Constructor;
  
class B{ int i =10;
    B(int a){
    	System.out.println("int para constuctor ");
    	
    }

	B(){
		System.out.println("i am B constuctor");
		i=20;
	}
}

public class Cons5 {

	public static void main(String[] args) {
		System.out.println("i am main method of Cons5 class");
		B v1=new B();
        System.out.println("class B globle variable i= "+v1.i);
        B v2=new B();
        System.out.println("class B globle variable i= "+v2.i);
        System.out.println("program end here");
	}

}
