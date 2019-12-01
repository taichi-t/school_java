package steveStudyPlan;

import java.util.Scanner;

public class MyApp {

	public static void main(String[] args) {
		System.out.print("Your name?"); // println = ln = show up something in new line.
		String name = new Scanner(System.in).next(); //Scanner methods means to get a value form user's action
		System.out.println("hello " + name);//this is methods showing message.
		System.out.println("hello " + name + " again!");
	}

}
