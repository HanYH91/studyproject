package BJ2448;
//별 찍기 - 11
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		String[] starArr = new String[N];
		starArr[0] = "  *  ";
		starArr[1] = " * * ";
		starArr[2] = "*****";
		
		// 복사할 횟수 3->0, 6->1, 12->2, 24->3 ...
		int copyCount = (int) (Math.log(N/3)/Math.log(2));
		String countBlank = "   ";
		for(int i=1 ; i<=copyCount ; i++)
		{
			// 총 라인수의 반. 
			int copyStart = (int) (3*Math.pow(2, i-1));
			
			// 이미 완성되어 있는 별모양 두개를 복사해서 밑에다 붙인다.
			// 그 후 복사 완료한 기존에 별 앞뒤에 공백을 붙인다.
			for(int j=0 ; j<copyStart ; j++)
			{
				starArr[copyStart+j] = starArr[j] + " " + starArr[j];
				starArr[j] = countBlank + starArr[j] + countBlank;
			}
			countBlank += countBlank;
		}

		for(int k=0 ; k<starArr.length ; k++)
			System.out.printf(starArr[k] + "\n");
			
		sc.close();
	}
	
}
