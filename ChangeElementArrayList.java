package ArrayList;

import java.util.ArrayList;

public class ChangeElementArrayList {
	

	   public static void main(String[] args) {
	      ArrayList<String> names = new ArrayList<String>();
	      names.add("Ravi");
	      names.add("Surya");
	      names.add("Ajeet");
	      names.add("Chaitanya");
	      names.set(0, "Nick");
	      System.out.println(names);
	   }
	}


