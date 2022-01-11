import java.util.ArrayList;

public class SearchAnElementInArrayList {
	
	
	  public static void main(String[] args) {
	   
	    //create an ArrayList object
	    ArrayList<String> arrayList = new ArrayList<String>();
	   
	    //Add elements to Arraylist
	    arrayList.add("1");
	    arrayList.add("2");
	    arrayList.add("3");
	    arrayList.add("4");
	    arrayList.add("5");
	    arrayList.add("1");
	    arrayList.add("2");
	 
	    /*
	      To check whether the specified element exists in Java ArrayList use
	      boolean contains(Object element) method.
	      It returns true if the ArrayList contains the specified objct,  otherwise false.
	    */
	   
	    boolean blnFound = arrayList.contains("2");
	    System.out.println("Does arrayList contain 2 ? " + blnFound);
	 
	    /*
	      To get an index of specified element in ArrayList use
	      int indexOf(Object element) method.
	      This method returns the index of the specified element in ArrayList.
	      It returns -1 if not found.
	    */
	 
	    int index = arrayList.indexOf("4");
	    if(index == -1)
	      System.out.println("ArrayList does not contain 4");
	    else
	      System.out.println("ArrayList contains 4 at index :" + index);
	     
	  
	  }   
	}
	


