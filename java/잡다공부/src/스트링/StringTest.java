package 스트링;

import java.util.StringTokenizer;

public class StringTest {

	public static void main(String[] args) {

		String str = "abcDefGhiJklmnoPQrstuvwXyz";
		String str5 = "abCdefGhiJklmnoPQrstuvwXyz";
		String str8 = "cDe";

		System.out.println("대분자 "+str.toUpperCase());
		System.out.println("대분자 "+str.toLowerCase());
		System.out.println("두개가 같음? "+str.equals(str5));	
		System.out.println("두개가 같음?(대소문자 무시) "+str.equalsIgnoreCase(str5));	
		System.out.println("들어있음? "+str.contains(str8));	
		System.out.println("들어있음? "+str5.contains(str8));	

		System.out.println("문자열의 길이는 "+str.length());
		System.out.println("특정 인덱스: "+str.charAt(3));
		System.out.println("3번부터 끝까지 잘라내기: "+str.substring(3));
		System.out.println("2번부터 4번까지 잘라내기: "+str.substring(2, 5));
		// 문자열 -> 배열, 배열 -> 문자열
		char[] charArr = str.toCharArray();	// 개수는 charArr.length ()없다.
		str = new String(charArr);
		
		String str2 = "1, 2, , 3, 4,5";
		String[] strArr = str2.split(", ");	// 띄어쓰기도 포함해서 읽는다. 빈칸도 하나로 인정. 느림
		
		StringTokenizer st = new StringTokenizer(str2, ", "); // 띄어쓰기 무시. 빈칸은 인정 안함. 빠름
		System.out.println("1번");
		while(st.hasMoreTokens())
		{
			System.out.println(st.nextToken());
			// 토큰을 꺼내옴
			// 남아있는 토큰 수 : st.countTokens();
		}
		System.out.println("2번");
		for(int i=0 ; i<strArr.length ; i++)
		{
			System.out.println(strArr[i]);
		}
		System.out.println("3번");
		for(String s : strArr)
		{
			System.out.println(s);
		}
		
		String aa = " a d b a ";
		System.out.println(aa);
		System.out.println("앞뒤 공백 자르기 :" + aa.trim());
		
		String bb ="Hello Java4Android"; 
		System.out.println(bb.indexOf("a"));
		System.out.println(bb.lastIndexOf("a"));
		System.out.println(bb.replace("Hello", "Hi"));

		
	}

}
