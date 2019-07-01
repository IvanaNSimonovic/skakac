package skakac;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ProblemSkakaca {
	
	public static void postaviFigure(char[][] belimatrix, char[][] crnimatrix) {
		try {
			BufferedReader b = new BufferedReader(new FileReader("beli.txt"));
			BufferedReader c = new BufferedReader(new FileReader("crni.txt"));
			for(int i=0;i<belimatrix.length;i++) {
				char[] belired=b.readLine().trim().toCharArray();
				char[] crnired=c.readLine().trim().toCharArray();
				for (int j = 0; j < belimatrix[i].length; j++) {
					belimatrix[i][j]=belired[j];
					crnimatrix[i][j]=crnired[j];
				}
			}
	    b.close();
		c.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
