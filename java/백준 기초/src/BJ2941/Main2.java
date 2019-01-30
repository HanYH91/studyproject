package BJ2941;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();

		String[] delim = { "dz=", "c=", "c-", "d-", "lj", "nj", "s=", "z=" };
		
		for(String s : delim)
			str = str.replace(s, ".");
		
		System.out.println(str.length());
	}

}
