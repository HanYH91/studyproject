package printf;

public class PrintfTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// boolean -> %b
		// 10진수 -> %d
		// 8진수 -> %o
		// 16진수 -> %x, %X
		// 부동 소수점 -> %f
		// 지수 -> %e
		// 문자 -> %c
		// 문자열 -> %s
		
		int num = 123;

		System.out.printf("[%5d]\n", num);	// 5칸으로 출력 뒤에 숫자.
		System.out.printf("[%-5d]\n", num);	// 5칸으로 출력 앞에 숫자.
		System.out.printf("[%05d]\n", num);	// 5칸으로 출력. 빈칸은 0
		
		char c = '*';
		System.out.printf("[%5c]\n", c);	// 5칸으로 출력 뒤에 숫자.

		double d = 5e-2; // 5*10^2..... 3e-2 = 3*10^(-2) = 0.03
		System.out.printf("[%f]\n", d);	// 5칸으로 출력 뒤에 숫자.
		
		int octNum = 010;	// 8진수로 10. 10진수로 8.
		int hexNum = 0x10;	// 16진수로 10. 10진수로 16.
		int binNum = 0b10;	// 2진수로 10. 10진수로 2.

		System.out.printf("[%o][%d]\n", octNum, octNum);	// 5칸으로 출력 뒤에 숫자.
		System.out.printf("[%#o]\n", octNum);	// 5칸으로 출력 뒤에 숫자.
		System.out.printf("[%x][%d]\n", hexNum, hexNum);	// 5칸으로 출력 뒤에 숫자.
		System.out.printf("[%#x]\n", hexNum);	// 5칸으로 출력 뒤에 숫자.
	}

}
