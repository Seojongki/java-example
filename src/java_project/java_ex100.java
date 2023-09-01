package java_project;

import java.util.Random;
import java.util.Scanner;

public class java_ex100 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		// 51번
//		String num = scan.nextLine();
//		String num1 = num.substring(1,2);
//		String num2 = num.substring(0,1);
//		System.out.println(num1+"/"+num2);
//		
//		String sum_str = "";
//		int sum = 0;
//		
//		sum_str = num1+num2;
//		sum = Integer.parseInt(sum_str)*2;		
//		System.out.println(sum);
//		if(sum<=50) {
//			System.out.println("GOOD");
//		}else if(sum>50) {
//			System.out.println("OH MY GOD");
//		}
		
		//52번
//		int num = scan.nextInt();
//		int modNum = 0;
//		String result = "";
//		
//		System.out.println(num%10);
//		
//		modNum = num%10;
//		if(num>10 && num<20) {
//			result = num+"th";
//		}else {
//			switch(modNum) {
//				case 1: result = num+"st"; break;
//				case 2: result = num+"nd"; break;
//				case 3: result = num+"rd"; break;
//				default: result = num+"th"; break;
//			}
//		}
//		System.out.println(result);
		
		//53번
//		float a = scan.nextInt();
//		float b = scan.nextInt();
//		float[] result = {
//				a+b
//				, b+a
//				, a-b
//				, b-a
//				, a*b
//				, b*a
//				, a/b
//				, b/a
//				, (float)Math.pow(a, b)
//				, (float)Math.pow(b, a)
//		};
//		
//		
//		float max =0;
//		
//		for(int i=0; i<result.length; i++) {
//			System.out.println(result[i]);
//			
//			if(max < result[i]) {
//				max = result[i];
//			}
//		}
//		System.out.print("최대값: ");
//		System.out.printf("%1f",max);
		
		//54번
//		int a = scan.nextInt();
//		int b = scan.nextInt();
//		int multi = 0;
//		String result = "";
//		if(a>b) {
//			if(a%b==0) {
//				multi = a/b;
//				result = b+"*"+multi+"="+(b*multi);
//			}else {
//				result="none";
//			}
//		}else {
//			if(b%a==0) {
//				multi = b/a;
//				result = a+"*"+multi+"="+(a*multi);
//			}else {
//				result="none";
//			}			
//		}
//		System.out.println("결과: "+result);
		
		//55번
//		int a = scan.nextInt();
//		String result = "";
//		if(a>=90 && a<=100) {
//			result="A";
//		}else if(a>=80 && a<90) {
//			result="B";
//		}else if(a>=70 && a<80) {
//			result="C";
//		}else if(a>=60 && a<70) {
//			result="D";
//		}else{
//			result="F";
//		}
//		System.out.println("등급: "+result);
		
		//56번
//		int a = scan.nextInt();
//		int b = scan.nextInt();
//		int c = scan.nextInt();
//		int d = scan.nextInt();
//		int sum = 0;
//		String result = "";
//		
//		sum = a+b+c+d;
//		
//		switch(sum) {
//			case 1: result="도"; break;
//			case 2: result="개"; break;
//			case 3: result="걸"; break;
//			case 4: result="윷"; break;
//			case 0: result="모"; break;
//		}
//		
//		System.out.println("결과: "+result);
		
		//57번
//		int a = scan.nextInt();
//		int b = scan.nextInt();
//		int[] arr = {a,b};
//		int sum = 0;
//		
//		for(int i=0; i<arr.length;i++) {
//			switch(arr[i]) {
//				case 1: sum += 400; break;
//				case 2: sum += 340; break;
//				case 3: sum += 170; break;
//				case 4: sum += 100; break;
//				case 5: sum += 70; break;
//			}
//		}
//		System.out.println(sum);
//		if(sum>500) {
//			System.out.println("angry");
//		}else {
//			System.out.println("no angry");
//		}
		
		//58번
//		int a = scan.nextInt();
//		int b = scan.nextInt();
//		int c = scan.nextInt();
//		
//		if(c<(a+b)) {
//			System.out.println("yes");
//		}else {
//			System.out.println("no");
//		}
		
		//59번
//		int a = scan.nextInt();
//		int b = scan.nextInt();
//		int c = scan.nextInt();
//		int d = scan.nextInt();
//		int e = scan.nextInt();
//		int f = scan.nextInt();
//		int g = scan.nextInt();
//		int[] rotto = {13, 23, 24, 35, 40, 45};
//		int[] juhee = {a, b, c, d, e, f};
//		int boners = 7;
//		int cnt = 0;
//		String result = "";
//		
//		for(int i=0; i<rotto.length; i++) {
//			for(int j=0; j<juhee.length; j++) {
//				if(rotto[i]==juhee[j]) {
//					cnt++;
//				}
//			}
//		}
//		//System.out.println(cnt);
//		if(cnt>5) {
//			if(boners==g) {
//				cnt++;
//			}
//		}
//		
//		switch(cnt) {
//			case 7: result="1"; break;
//			case 6: result="2"; break;
//			case 5: result="3"; break;
//			case 4: result="4"; break;
//			case 3: result="5"; break;
//			default: result="0"; break;
//		}
//		System.out.println("결과: "+result);
		
		//60번
//		int a = scan.nextInt();
//		int b = scan.nextInt();
//		int c = scan.nextInt();
//		int[] arr = {a,b,c};
//		
//		
//		for(int i=0; i<arr.length; i++) {		
//		if(arr[i]<=170) {
//			System.out.println("CRASH "+arr[i]);
//			break;
//		}
		
		//61번
//		int a = scan.nextInt();
//		String multi = scan.next();
//		int b = scan.nextInt();
//		float result = 0;
//		
//		switch(multi) {
//			case "+": result=(a+b); break;
//			case "-": result=(a-b); break;
//			case "*": result=(a*b); break;
//			case "/": result=((float)a/b); break;
//		}
//		System.out.println(result);
		
		//62번
//		String a = scan.nextLine();
//		String b = scan.nextLine();
//		String c = scan.nextLine();
//		
//		if(Integer.parseInt(b)<10) {
//			b = "0"+b;
//		}
//		
//		if(Integer.parseInt(c)<10) {
//			c = "00"+c;
//		}else if(Integer.parseInt(c)<100) {
//			c = "0"+c;
//		}
//		System.out.println(a+b+c);
		
		//63번
//		int day = scan.nextInt();
//		int time = 0;
//		
//		time = day * 24;
//		System.out.println(time);
		
		//64번
//		int a = scan.nextInt();
//		int b = scan.nextInt();
//		
//		System.out.println(a%b);
		
		//65번
//		int a = scan.nextInt();
//		for(int i=1; i<=a; i++) {
//			if(((i%10%3)==0 && i%10!=0) || (i>28 && i<40)) {
//				System.out.print("X ");
//			}else {
//				System.out.print(i+" ");
//			}
//		}
		
		
		//66번
//		int a = scan.nextInt();
//		int sum = 0;
//		for(int i=1; i<=a; i++) {
//			if(sum < a) {
//				sum += i;
//			}else {
//				System.out.println(sum);
//				break;
//			}
//			
//		}
		
		//67번
//		boolean countYn = true;
//		int cnt = scan.nextInt();
//		
//		while(countYn) {
//			if(cnt==0) {
//				countYn = false;
//			}else {				
//				System.out.println(cnt);
//				cnt--;
//			}
//		}
		
		//68번
//		int cnt = scan.nextInt();
//		for(int i=0; i<=cnt; i++) {
//			System.out.println(i);
//		}
		
		//69번
//		int a = scan.nextInt();
//		int d = scan.nextInt();
//		int n = scan.nextInt();
//		int result = 0;
//		
//		result = d*(n-1)+a;
//		System.out.println(result);
		
		//70번
//		int a = scan.nextInt();
//		int r = scan.nextInt();
//		int n = scan.nextInt();
//		
//		int su = 0;
//		
//		for(int i=1; i<n; i++) {
//			if(i==1) {
//				su = a*r;
//			}else {
//				su= su*r;
//			}
//		}
//		System.out.println(su);
		
		//71번
//		Random ran = new Random();
//		int cnt = ran.nextInt(8)+2;
//		System.out.println("개수: "+cnt);
//		int sum = 0;
//		for(int i=0; i<cnt; i++){
//			int num  = ran.nextInt(8)+2;
//			sum = sum + num;
//			System.out.println(num);
//		}
//		System.out.println("결과: "+sum);
		
		
		//72번
		Random ran = new Random();
		int cnt = ran.nextInt(10)+1;
		int arr[] = new int[cnt];
		System.out.println("랜덤개수: "+cnt);
		for(int i=0; i<cnt; i++) {
			arr[i] = ran.nextInt(1000);
			System.out.println(arr[i]);
		}
		
		int max = 0;
		//int temp = 0;
		for(int j=0; j<cnt; j++) {
			if(j==0) {
				max = arr[j];
			}else {
				if(max < arr[j]) {
					max = arr[j];
				}
			}
		}
		
		System.out.println("최대값: "+max);
		
		//73번
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
	}

}
