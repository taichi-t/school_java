package sample;

public class Methodoverload {

	public static void sayHi(String name) {
		// TODO Auto-generated method stub
		int x = 10;
		System.out.println("Hi!" + name);
	}
	
	//overload
	
	public static void sayHi() {
		System.out.println("Hi! Nobody!");
	}
	
	public static void main(String[] args) {
		sayHi();
		sayHi(" Steve");//引数
//		System.out.println(name);
//		System.out.println(x);
	}
	
	//変数を使うときはその変数がどこで有効か考えながら使う
	

}
