package ArrayList;

import java.util.ArrayList;

public class IteratingArrayList {

	  public static void main(String args[]){  
	     ArrayList<String> alist=new ArrayList<String>();  
	     alist.add("Welcome");  
	     alist.add("To");  
	     alist.add("SangamOne");  

	  
	     //iterating ArrayList
	     for(String str:alist)  
	        System.out.println(str);  
	     }  
	}

