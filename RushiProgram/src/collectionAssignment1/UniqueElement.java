package collectionAssignment1;

import java.util.ArrayList;
import java.util.LinkedHashSet;

class UniqueElement {

	public static void main(String[] args) {
		
         ArrayList<String> a1=new ArrayList<String>();
         
         a1.add("Sun");
         a1.add("Mon");
         a1.add("Sun");
         a1.add("Tue");
         a1.add("Wed");
         a1.add("Mon");
         
         System.out.println(a1);
         
         LinkedHashSet<String> hs=new LinkedHashSet<String>(a1);
         
         ArrayList<String> a2=new ArrayList<String>(hs);
         System.out.println(a2);
	}

}
