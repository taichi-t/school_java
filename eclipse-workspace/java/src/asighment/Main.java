package asighment;

public class Main {
	public static void main(String[] args) {
		Animal animal = new Animal();
		Fish fish = new Fish();
		Dog dog = new Dog();
		Cat cat = new Cat();

		System.out.println();
		System.out.println("------------fish----------");
		fish.eat();
		fish.sleep();
		System.out.println("----------dog-------------");
		dog.eat();
		dog.sleep();
		System.out.println("----------cat-------------");
		cat.eat();
		cat.sleep();
	}
}