package java_project;

public class java_ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] coinUnit = {500, 100, 50, 10}; 
		int money = 2680;
		
		System.out.println("money = " + money);
		
		for(int i=0; i<coinUnit.length; i++) {
			
			if(coinUnit[i]==500) {
				System.out.println("500원: " + money/coinUnit[i]);
			}
			
			if(coinUnit[i]==100) {
				System.out.println("100원: " + (money%500)/coinUnit[i]);
			}
			
			if(coinUnit[i]==50) {
				System.out.println("50원: " + (money%100)/coinUnit[i]);
			}
			
			if(coinUnit[i]==10) {
				System.out.println("10원: " + (money%50)/coinUnit[i]);
			}
		}
	}

}
