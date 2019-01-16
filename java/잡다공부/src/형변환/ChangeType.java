	package 형변환;

public class ChangeType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double d = 5e-2; // 5*10^2..... 3e-2 = 3*10^(-2) = 0.03
		
		// 피연산자 중 어느 한쪽이 String이면 다른 한쪽을 자동으로 String으로 변환한 다음 두 String을 결합한다.
		String str = 123 + "";
		str = str + 'a';
		Long aaa = 235262623L;
		str = "" + aaa;
		int num = Integer.parseInt(str);
		str = String.valueOf(num);		// 따라서 이 함수 사용이 더 낫다.
		str = Integer.toString(num);	// num이 null일 경우 에러.
		
		
		// 자동 형변환, 묵시적 형변환
		// byte -> short -> int -> long -> float -> double
		// char -> int
		byte b = 0;
		char c = '0';
		int a = b; 
		a = c;
		long l = 10000L;
		float f = l;
		
		// 강제 형변환, 명시적 형변환
		// (타입) 하면 됨. (Cast 연산자)
		b = (byte)a;
		l = (long)f;
		c = (char)a;
		
	}

}
