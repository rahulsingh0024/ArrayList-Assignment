import java.util.ArrayList;
import java.util.Arrays;

public class RemoveElementFomArrayList {
	
	public static void main(String[] args) 
    {
        ArrayList<String> namesList = new ArrayList<String>(Arrays.asList( "CAT", "DOG", "COW") );
         
        System.out.println(namesList);  
         
        
        namesList.remove(1);
         
        System.out.println(namesList); 
    }
}

