package BJ15552;

import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub

		try {

	    	BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
	    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	    	
	    	String str = bf.readLine();
	    	int N = Integer.parseInt(str);
	    	
	    	for(int i=0 ; i<N ; i++)
	    	{
	    		String str2 = bf.readLine();
	    		String[] strArr = str2.split(" ");

	    		int x = Integer.parseInt(strArr[0]);
	    		int y = Integer.parseInt(strArr[1]);
	    		
	    		int res = x+y;

		    	bw.write(res+"");
		    	bw.newLine();
	    	}
	    	
	    	bf.close();
	    	bw.close();
	    	
		} catch(IOException e) {
			e.printStackTrace();
		}
	}

}
