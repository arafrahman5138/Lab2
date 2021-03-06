import bridges.base.Array;
import bridges.connect.Bridges;
import bridges.base.Element;


public class Setup {
	public static void main(String[] args) throws Exception {

	    /* Initialize a Bridges connection with your credentials  */
	    /* TODO: plug your own BRIDGES credentials */
	    Bridges bridges = new Bridges(0, "arafrahman", "1253203124957");
		   // Bridges[] bridge = new Bridges[10];

	    /* Set an assignment title */
	    bridges.setTitle("Array Example by Araf Rahman");

	    /* Set up the array dimensions, allocate an Array of Elements */
	    /* TODO: Make an array of size 10 */
	    int arraySize = 10;
	    Array<Integer> arr = new Array<Integer> (arraySize);
	    
	    /* Populate the array with integers */
	    /* TODO: Make the array store square numbers*/
	    for (int i = 0; i < 10; i++) {
	    	arr.getElement(i).setValue (i*i);
	    	arr.getElement(i).setLabel(String.valueOf(i*i));
	    }
	    arr.getElement(0).setValue (0);
	    /* set the value as a Label */
	    arr.getElement(0).setLabel(String.valueOf(0));
	    
	    /* Tell BRIDGES which data structure to visualize */
	    bridges.setDataStructure(arr);

	    /* Visualize the Array */
	    bridges.visualize();
	    
	    
	    
	   
	}
}
