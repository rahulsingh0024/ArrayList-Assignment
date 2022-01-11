import java.util.ArrayList;
import java.util.Collections;

public class CopyOneArrayListToAnother {
	
	
	 
	    public static void main(String[] args) {
	        
	        ArrayList<String> aListCars = new ArrayList<String>();
	        
	        aListCars.add("VOLVO");
	        aListCars.add("BMW");
	        
	        ArrayList<String>  aListBike = new ArrayList<String>();
	        
	        aListBike.add("DUCATI");
	        aListBike.add("HONDA");
	        
	        /*
	         * To copy elements of one ArrayList to another, use
	         * copy method of Collections class
	         */
	        
	        //copy  aListBike to aListCars
	        Collections.copy(aListCars,  aListBike);
	        
	        System.out.println(aListCars);
	       
	    }
	}



