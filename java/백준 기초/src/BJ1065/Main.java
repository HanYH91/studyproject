package BJ1065;
// 한수

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int res;
		
		if(N < 100)
			res = N;
		else {

			res = 99;
			
			for(int i=111 ; i<=N ; i++) {
				// (100의 자릿수 - 10의 자릿수) == (10의 자릿수 - 1의 자릿수)
				if(((i/100)-((i/10)%10)) == (((i/10)%10)-(i%10)))
					res++;
			}
		}
		
		System.out.println(res);

		sc.close();
	}

}
