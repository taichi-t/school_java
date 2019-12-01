package asighment4;

import java.util.Scanner;

public class Q4Encapsulation {
	String name;
	int age;
	String id;
	String gender;

	// ================================
//	          return info
	// ================================
	private String getName() {
		return name;
	}

	private int getAge() {
		return age;
	}

	private String getId() {
		return id;
	}

	private String getGender() {
		return gender;
	}
	// ================================
//    set info
//================================

	public void setName(String newName) {
		this.name = newName;

	}

	public void setAge(int newAge) {
		this.age = newAge;

	}

	public void setId(String newId) {
		this.id = newId;

	}

	public void setGender(String newGender) {
		this.gender = newGender;

	}
	// ================================
//  input info
//===============================

	public static void main(String[] args) {
		Scanner inputA = new Scanner(System.in);
		Q4Encapsulation myQ4 = new Q4Encapsulation();
		System.out.println("name:");
		String newName = inputA.next();
		myQ4.setName(newName);

		System.out.println("Age:");
		int newAge = inputA.nextInt();
		myQ4.setAge(newAge);

		System.out.println("ID:");
		String newId = inputA.next();
		myQ4.setId(newId);

		System.out.println("Gender:");
		String newGender = inputA.next();
		myQ4.setGender(newGender);

		System.out.println("Name: " + myQ4.getName());
		System.out.println("Age: " + myQ4.getAge());
		System.out.println("ID: " + myQ4.getId());
		System.out.println("Gender: " + myQ4.getGender());

	}

}
