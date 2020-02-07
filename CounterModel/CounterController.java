/*
Leonard Hawkes
CIT 130
3/20/2015
Implement the following UML for a counter that increments once a second until
 a given number of seconds is reached.
 */

package countermodel;


public class CounterController {
    
    private int start, end;
    
    public CounterController(int s, int e){
        start = s;
        end = e;
    }
    
    public void Start(){
        System.out.println("\nCounterController Starting.\n");
        CounterModel cm = new CounterModel(start);
        for(int i = start; i < end; i++){
            cm.Increment();
        }
    }
    
}
