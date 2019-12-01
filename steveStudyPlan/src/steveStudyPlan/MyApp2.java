package steveStudyPlan;

import java.util.Scanner;

public class MyApp2 {

	public static void main(String[] args) {
		//to get integer and show it by using System.out.println()
		System.out.print("Your guess?"); // println = ln = show up something in new line.
		Integer guess = new Scanner(System.in).nextInt();
		// getting integer from new ~~~.
		System.out.println("Your guess: " + guess);
	}

}
