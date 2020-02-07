public class CounterModel{
	private int counter;
	public CounterModel(int c){
		counter = c;
	}
	public void Increment(){
		try {
			Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        counter++;
		CounterView cv = new CounterView();
		cv.Display(counter);
	}
}