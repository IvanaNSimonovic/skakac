package skakac;

import java.io.BufferedReader;
import java.io.FileReader;

public class UcitavanjeTable {
	
	try (BufferedReader r = new BufferedReader(
			new FileReader("C:\\Users\\Teona\\Favorites\\Documents\\minesweeper1.txt"))) {
		String[] nums = r.readLine().split(" ");

}
