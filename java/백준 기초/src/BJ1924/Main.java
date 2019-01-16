package BJ1924;
// 2007년

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] dayOfWeek = { "MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN" };
		int[] dayOfMonth = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int y = sc.nextInt();
		
		int sumOfDay = y-1;
		while(x>1)
		{
			sumOfDay += dayOfMonth[--x];
		}
		
		String res = dayOfWeek[sumOfDay%7];
		
		System.out.println(res);
		
	}

}
