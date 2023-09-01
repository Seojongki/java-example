package java_project;

import java.util.Scanner;

public class java_ex201 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		String Quadrant = "";
		
		if(a > 0 && b > 0 ) {
			Quadrant = "1";
		}else if(a > 0 && b < 0 ) {
			Quadrant = "4";
		}else if(a < 0 && b > 0 ) {
			Quadrant = "2";
		}else if(a < 0 && b < 0 ) {
			Quadrant = "3";
		}
		
		System.out.println(Quadrant+" 사분면");
		
		sc.close();
		
		
		
	}

}
