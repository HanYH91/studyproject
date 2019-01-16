package BJ11721;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		
		while(str.length()>=10)
		{
			System.out.println(str.substring(0, 10));
			str = str.substring(10);
		}
		System.out.println(str);
		
		
	}

}
