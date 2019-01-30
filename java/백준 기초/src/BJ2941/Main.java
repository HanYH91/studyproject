package BJ2941;

import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();

		// "dz="를 구분자로 나눠서 strArr에 저장한다.
		String[] strArr = str.split("dz=");

		// strArr에 저장된 문자들을 이름이 str1인 하나의 문자열에 저장한다.
		String str1 = "";
		for(String s : strArr) 
			str1 += s;
		// str1은 "dz="가 빠진 문자열이되고 x에 빠진 dz=의 개수를 저장한다.
		int x = (str.length()-str1.length())/3;
		
		// "dz="를 뺀 문자열에 "dz="대신 "c=|c-|d-|lj|nj|s=|z="구분자로 다시한번 작업한다.
		strArr = str1.split("c=|c-|d-|lj|nj|s=|z=");

		String str2 = "";
		for(String s : strArr) 
			str2 += s;
		// 마찬가지고 str2는 구분자를 다 뺀 문자열. 
		// y는 이번에 제외한 구분자들의 개수.
		int y = (str1.length()-str2.length())/2;
		
		// dz=의 개수 + 2글자 구분자들의 개수 + 구분자 아닌 문자들의 개수
		int cnt = x + y + str2.length();
		
		System.out.println(cnt);
		
	}
}
