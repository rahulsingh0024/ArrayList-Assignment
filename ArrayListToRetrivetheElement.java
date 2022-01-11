import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListToRetrivetheElement {
	
	 public static void main(String[] args) 
	    {
	        ArrayList<String> list = new ArrayList<>(Arrays
	                    .asList("CAT", "ELEPHANT", "LION", "COW"));
	         
	        String firstName = list.get(3);         //COW
	        String secondName = list.get(2);        //LION
	         String thirdname =list.get(0);         //CAT
	         
	         
	         
	        System.out.println(firstName);
	        System.out.println(secondName);
	        System.out.println(thirdname);
	    }
	}


