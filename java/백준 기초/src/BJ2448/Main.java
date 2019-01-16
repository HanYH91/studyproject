package BJ2448;
//별 찍기 - 11
import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		String[] starArr = new String[N];
		starArr[0] = "  *  ";
		starArr[1] = " * * ";
		starArr[2] = "*****";
		
		// 복사할 횟수 3->0, 6->1, 12->2, 24->3 ...
		int copyCount = (int) (Math.log(N/3)/Math.log(2));
		for(int i=1 ; i<=copyCount ; i++)
		{
			// 총 라인수의 반. 
			int copyStart = (int) (3*Math.pow(2, i-1));
			
			// 각 라인별 앞뒤 공백 만들어주기.
			// 3줄마다 3칸씩 앞뒤에 공백이 생기므로, 라인수/2 만큼의 크기로 만들어주면 된다.
			String blank = "";
			for(int j=0 ; j<copyStart ; j++)
				blank += " ";
			
			// 이미 완성되어 있는 별모양 두개를 복사해서 밑에다 붙인다.
			// 그 후 복사 완료한 기존에 별 앞뒤에 아까 만들어놓았던 공백을 붙인다.
			for(int j=0 ; j<copyStart ; j++)
			{
				starArr[copyStart+j] = starArr[j] + " " + starArr[j];
				starArr[j] = blank + starArr[j] + blank;
			}
			
			
		}

		for(int k=0 ; k<starArr.length ; k++)
			System.out.printf(starArr[k] + "\n");
			
		sc.close();
	}
	
}
