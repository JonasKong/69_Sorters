/**
  Implement an insertion sort, in the Sorters structure
 */
import java.util.ArrayList;

public class InsertionSorter extends Sorter {
	
    /**
      Construct an instance to process the user's data
     */
    public InsertionSorter(  ArrayList< String> usersData) {
        super(usersData);
    }
    

    /**
      sort the user's data, implementing insertion sort
     */
    	
	public String valueToInsert;
	
	private void insert1 (int indexOfComparison){
		if (valueToInsert.compareTo(elements.get(indexOfComparison)) > 0) {
			elements.set(indexOfComparison, valueToInsert);
		} else if ((valueToInsert.compareTo(elements.get(indexOfComparison))) < 0 
							&& (indexOfComparison == 0)){
			elements.set(indexOfComparison + 1, elements.get(indexOfComparison));
			elements.set(indexOfComparison, valueToInsert);
		} else {
			elements.set(indexOfComparison + 1, elements.get(indexOfComparison));
			indexOfComparison--;
			insert1(indexOfComparison);
		}
			
	}
	
	public void mySort () {
		for (int toBeCompared = 1; toBeCompared < elements.size() - 1; toBeCompared ++) {
			valueToInsert = elements.get(toBeCompared);
			insert1(toBeCompared - 1);
		}
	}
}
