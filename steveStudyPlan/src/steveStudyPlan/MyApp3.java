package steveStudyPlan;

import java.util.Scanner;
import java.util.Random;

public class MyApp3 {
 public static void main(String[] args) {
	// change the view depend on conditions.
	 //check the number from a user to answer
	 	Integer answer = new Random().nextInt(10) + 1;
	 	Integer count = 0;
	 	
	 	while(true) {
 		System.out.print("Your guess?"); 
		Integer guess = new Scanner(System.in).nextInt();
		count++;
		
		if(answer == guess) {
		 System.out.println("Bingo! it tool " + count + " guesses!");
		 break; //to get out of this loop when the an answer is correct.
		}else if (answer > guess){
		 System.out.println("The answer is higher!");
		}else {
			System.out.println("The answer is lower!");
		}

	 }
}
	 	// 1 to 10 number is necessity.
	 	//checking the number from a user in terms of whether is correct or not and show the result up.
		
}
