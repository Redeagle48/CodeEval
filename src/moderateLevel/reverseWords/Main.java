package moderateLevel.reverseWords;

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
    	String toPrint = "";
    	for (int i = line.length-1; i >= 0 ; i--) {
			toPrint += line[i] + " ";
		}
    	toPrint = toPrint.substring(0, toPrint.length()-1);
    	System.out.println(toPrint);
    }
}
