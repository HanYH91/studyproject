package 입출력;

import java.io.*;

public class BufferTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			FileReader fr = new FileReader("test.txt");

			BufferedReader bf = new BufferedReader(fr);
		    BufferedWriter bw = new BufferedWriter(new FileWriter("test.txt"));
		    
		    bw.write("qweasd");
		    bw.newLine();
		    bw.flush();
		    	
		    bf.close();
		    bw.close();
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}

}
