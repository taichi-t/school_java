package sample;

public class IfCondetion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//if
		// &&(and) ||(or) !(not)
		int score = 81;
//		if(score > 80) {
//			System.out.println("Great");	
//		}else if(score >60){
//			System.out.println("Not bad");	
//		}else {
//			System.out.println("so so...");	
//		}
		String msg =  score > 80 ? "Great" : "so so...";
		System.out.println(msg);	
		 
	}

}
