package BJ4673;

public class Main {

	public static void main(String[] args) {

		boolean[] arr = new boolean[10001];

		
		for(int i=1 ; i<=10000 ; i++) {
			int d = i  + i/1000 + (i/100)%10 + (i/10)%10 + i%10;
			while(d<10000 && !arr[d]) {
				arr[d] = true;
				d = d  + d/1000 + (d/100)%10 + (d/10)%10 + d%10;
			}
		}
		

		for(int i=1 ; i<10000 ; i++) {
			if(arr[i] == false)
				System.out.println(i);
		}
	}

}
