import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int C = sc.nextInt();

		for(int i=0 ; i<C ; i++) {
			
			int N = sc.nextInt();
			int[] arr = new int[N];
			
			int sum=0;
			for(int j=0 ; j<N ; j++) {
				arr[j] = sc.nextInt();
				sum += arr[j];
			}
			// 평균 ave, 상위권 학생의 수 count.
			double ave = sum/(double)N;
			int count=0;
			for(int j=0 ; j<N ; j++) {
				if(ave<arr[j])
					count++;
			}
			// 상위권 학생의 수 / 전체 학생의 수 * 100
			System.out.printf("%5.3f%%\n", (double)count/N*100);
		}
		sc.close();
	}

}
