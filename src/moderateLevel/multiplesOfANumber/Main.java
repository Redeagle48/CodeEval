package moderateLevel.multiplesOfANumber;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {
	public static void main (String[] args) throws IOException {
		File file = new File(args[0]);
		BufferedReader in = new BufferedReader(new FileReader(file));
		String line;
		while ((line = in.readLine()) != null) {
			String[] lineArray = line.split("\\s");
			if (lineArray.length > 0) {
				//Process line of input Here
				ProcessLine(lineArray);
			}
		}
	}

	public static void ProcessLine(String[] line) {
		String[] elements = line[0].split(",");
		int A = Integer.parseInt(elements[0]);
		int N = Integer.parseInt(elements[1]);

		boolean known = false;
		//TO COMPLETE
		int i = A;
		while(!known) {
			if(i % N == 0) {
				System.out.println(i);
				known = true;
			}
			i++;
		}
	}
}
