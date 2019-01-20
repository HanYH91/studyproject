package BJ1546;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int max = -1;
		int sum = 0;;
		for(int i=0 ; i<N ; i++) {
			int x = sc.nextInt();
			sum += x;
			if(x > max) 
				max = x;
		}
		
		System.out.println(sum*100/(double)max/N);
		
		sc.close();
	}

}
