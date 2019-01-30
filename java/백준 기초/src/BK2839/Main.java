package BK2839;
// 설탕 배달

import java.util.Scanner;

class Sugar
{
	int WeightCount(int N)
	{
		int maxOf5kg = N/5;
		for(int s5kg=maxOf5kg ; s5kg>=0 ; s5kg--)
		{
			int s3kg=0;
			while(s3kg*3 + s5kg*5 <= N)
			{
				if(s3kg*3 + s5kg*5 == N)
					return s5kg+s3kg;	
				
				s3kg++;
			}
		}
		return -1;
	}
}

public class Main {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		Sugar obj = new Sugar();
		System.out.println(obj.WeightCount(N));
		
		sc.close();
		
	}

}
