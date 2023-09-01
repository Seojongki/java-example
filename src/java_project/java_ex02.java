package java_project;

public class java_ex02 {

	public static void main(String[] args) {
		//1~20까지의 정수중에서 2의 배수이면서 5의 배수인 수의 개수를 구하시오 
		
		int cnt = 0;
		
		for(int i=1; i<21; i++) {
			if(i%2 == 0 && i%5 == 0 ) {
				cnt = cnt + 1;
			}
		}
		System.out.println(cnt);
		
	}

}



