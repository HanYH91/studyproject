package 입출력;

import java.io.*;

public class PrintWriterTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		PrintWriter pw = new PrintWriter(new FileWriter("p.txt"));
		pw.printf("올해는 %d년입니다.",2019);
		pw.println();
		pw.println("나는 자바가 좋습니다.");
		pw.print("매일매일 자바공부해야지");
		pw.close();

	}

}
