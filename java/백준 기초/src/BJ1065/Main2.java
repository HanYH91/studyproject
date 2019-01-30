package BJ1065;
// 한수

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int res;
		
		// 99 이하의 값은 모두 등차수열
		// 총 등차수열의 개수 = 입력 값.
		// 입력 값이 100 이상이라면 99개 + 100이상의 수 중에 등차수열의 개수.
		if(N < 100)
			res = N;
		else {
			res = 99;
			
			// i는 등차수열에서 1의 자리를 제외한 값.
			for(int i=11; i<=99 ; i++) {
				// 일의 자리 수 = 십의 자리수*2 - 백의 자리수.
				int num1 = (i%10)*2 -(i/10);
				int sum = i*10 + num1;
				if(sum>N)
					break;
				
				// 1의 자리 수가 0~9 일 경우에만 OK.
				// 1의 자리 수가 10 이상일 경우 백의 자리 +1, 십의 자리 = 0
				if(num1 < 10 && num1>=0)
					res++;
				else if(num1>9)
					i = (i+10)/10*10;
			}
			
		}
		
		System.out.println(res);
		
		sc.close();
	}

}
