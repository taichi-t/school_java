package sample;

public class Method {

	//void 何も返さない
	public static String sayHi(String name) {
//		System.out.println("Hi! "+ name );
		return "Hi! "+ name;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//method
//		sayHi();
//		sayHi("Tom");
//		sayHi("Tom");
		String msg = sayHi("Steve");
		System.out.println(msg);

	}

}
