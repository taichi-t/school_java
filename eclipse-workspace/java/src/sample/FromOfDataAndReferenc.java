package sample;

public class FromOfDataAndReferenc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//データ型
//		int x = 10;
//		int y = x;
//		y = 5;
//		System.out.println(x);
//		System.out.println(y);
		
		//参照型
//		int [] a = {3,5,7};
//		int [] b = a;
//		b[1] = 8;
//		System.out.println(a[1]);
//		System.out.println(b[1]);
		
		// 3 8 になるはずだが　8 8　になる　なぜなら　参照型だとbの番地を変更するとaの番地も変更されるから。
		
		//exeption
		String s = "Hello";
		String t = s;
		t = "world";
		System.out.println(s);
		System.out.println(t);
		
		//この場合、参照型なのでworld　world　と表示されると思いきや、string型はデータ型と限りなく近い動きをするので、
//		hello　world　となる。これは例外。
		


	}

}
