package sanket;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylist {

	public static void main(String[] args) {
	ArrayList<String> ary=new ArrayList<String>();
	System.out.println(ary.size());
	System.out.println(ary);
	ary.add("abc");
	ary.add("def");
	ary.add("hij");
	System.out.println(ary.size());
	System.out.println(ary);
	
//while(itr.hasNext()) {
//	System.out.println(itr.next());
//}
	ary.removeIf(str->str.contains("abc"));
	//Iterator<String> itr=ary.iterator();
//	while(itr.hasNext()) {
//	System.out.println(itr.next());
//}
	ary.forEach(str1->{
		System.out.println(str1);
	});
	}

}
