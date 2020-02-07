public class CounterController{

	private	int start, end;
	public CounterController(int s, int e){
			start = s; end = e;
		}
	public void Start(){
		System.out.println("\nCounterController Starting.\n");
		CounterModel cm = new CounterModel(start);
        for(int i = start; i < end; i++)
        	cm.Increment();
		}
}