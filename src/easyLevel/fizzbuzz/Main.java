package easyLevel.fizzbuzz;

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
            ProcessLine(lineArray);
        }
    }
  }
    
    public static void ProcessLine(String[] lineElements) {
    	int A = Integer.parseInt(lineElements[0]);
    	int B = Integer.parseInt(lineElements[1]);
    	int N = Integer.parseInt(lineElements[2]);
    	
    	String toPrint = "";
    	
    	for (int i = 1; i < N+1 ; i++) {
    		if(i % A == 0) {
    			if (i % B == 0) {
    				toPrint += "FB" + " ";
    			} else {
    				toPrint += "F" + " ";
    			}
    		} else if (i % B == 0) {
    			toPrint += "B" + " ";
    		} else {
    			toPrint += i + " ";
    		}
    	}
    	toPrint = toPrint.substring(0, toPrint.length()-1);
    	System.out.println(toPrint);
    }
}
