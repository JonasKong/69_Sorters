/**
  Implement an selection sort, in the Sorters structure
 */
import java.util.ArrayList;

public class SelectionSorter extends Sorter {

    /**
      Construct an instance to process the user's data
     */
    public SelectionSorter(  ArrayList< String> usersData) {
        super(usersData);
    }
    

    /**
      sort the user's data, implementing selection sort
     */
    private int dweebIndex( int startAt) {
        // use the starting element as a first guess
        int dweebAt = startAt;
        String dweeb = elements.get( dweebAt);
        
        for( int testAt = startAt +1
           ; testAt < elements.size()
           ; testAt++)
            if( elements.get( testAt).compareTo( dweeb) < 0) {
                // Found a smaller value. Remember it.
                dweebAt = testAt;
                dweeb = elements.get( dweebAt);
            }
        return dweebAt;
     }
	 public void mySort() {
	 
	 for( int next = 0
           ; next < elements.size() -1  // last needs no sort
           ; next++) {
		elements.set( next
                        , elements.set( dweebIndex( next)
                                      , elements.get( next))
                        );
            }
    }
}
