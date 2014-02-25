package easyLevel.sumOfIntegersFromFile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {

	static int result = 0;


	public static void main (String[] args) throws IOException {
		File file = new File(args[0]);
		BufferedReader in = new BufferedReader(new FileReader(file));
		String line;
		while ((line = in.readLine()) != null) {
			String[] lineArray = line.split("\\s");
			if (lineArray.length > 0) {
				//Process line of input Here
				for (String string : lineArray) {
					ProcessLine(Integer.parseInt(string));
				}
			}
		}
		System.out.println(result);
	}

	public static void ProcessLine(int number) {
		result += number;
	}
}
