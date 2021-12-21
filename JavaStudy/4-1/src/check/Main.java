package check;

import constants.Constants;

public class Main {
	
	private static String firstName = "池田";
	private static String lastName = "亮";
	
	public static void main(String[] args) {
		printName(firstName, lastName);
		
		Pet pt = new Pet(Constants.CHECK_CLASS_JAVA,Constants.CHECK_CLASS_HOGE);
		RobotPet rbpt = new RobotPet(Constants.CHECK_CLASS_R2D2,Constants.CHECK_CLASS_LUKE);
		pt.introduce();
		rbpt.introduce();		
		// TODO 自動生成されたメソッド・スタブs
		

	}
	
	private static void printName(String firstName, String lastName) {
		System.out.println("printNameメソッド → " + firstName + lastName);
	}

}
