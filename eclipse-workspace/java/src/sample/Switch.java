package sample;

public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//switch
		String signal = "green";
		
		switch (signal) {
		case "red":
			System.out.println("Stop!");
			break;
		case "blue":
		case "green" :
			System.out.println("You can go");
			break;
		case "yellow":
			System.out.println("Caution");
			break;
		default:
			System.out.println("wrong signal");
			break;
		}
	}

}
