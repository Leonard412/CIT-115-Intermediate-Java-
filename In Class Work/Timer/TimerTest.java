/*
 * test a timer
 */
import java.util.Scanner;

public class TimerTest{
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		System.out.println("This progam tests a timer.");
		String go = "y";
		int start=0, end=0;
		while(go.equals("Y")||go.equals("y")){
			System.out.println("Enter a start number of seconds");
			start = input.nextInt();
			System.out.println("Enter an end number of seconds");
			end = input.nextInt();
            CounterController cc = new CounterController(start,end);
            cc.Start();
			System.out.println("\nContinue?(y/n)");
            go = input.next();
		}
	}
}