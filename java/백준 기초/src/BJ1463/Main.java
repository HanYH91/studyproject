package BJ1463;
// 1로 만들기.

import java.util.Scanner;

public class Main {

	static int min(int x, int y, int z) {
		if(x>=y)
			return Math.min(y, z);
		else
			return Math.min(x, z);
	}
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		int[] arr = new int[N+1];
		
		arr[1] = 0;
		for(int i=2 ; i<=N ; i++) {
			int temp;
			if(i%2==0) {
				if(i%3==0) 
					temp = min(arr[i-1], arr[i/2], arr[i/3]) + 1;
				else
					temp = Math.min(arr[i-1], arr[i/2]) + 1;
			}
			else {
				if(i%3==0) 
					temp = Math.min(arr[i-1], arr[i/3]) + 1;
				else
					temp = arr[i-1] + 1;
			}
			arr[i] = temp;
		}
		
		System.out.println(arr[N]);
	}

}
