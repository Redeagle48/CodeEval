package easyLevel.wordsToDigits;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

//Sample code to read in test cases:
public class Main {
	
	static HashMap<String,Integer> wordsToDigits = new HashMap<String,Integer>();
	
	public static void populateCorrespondence(){
		wordsToDigits.put("zero", 0);
		wordsToDigits.put("one", 1);
		wordsToDigits.put("two", 2);
		wordsToDigits.put("three", 3);
		wordsToDigits.put("four", 4);
		wordsToDigits.put("five", 5);
		wordsToDigits.put("six", 6);
		wordsToDigits.put("seven", 7);
		wordsToDigits.put("eight", 8);
		wordsToDigits.put("nine", 9);
	}
	
    public static void main (String[] args) throws IOException {

    populateCorrespondence();	
    	
    File file = new File(args[0]);
    BufferedReader in = new BufferedReader(new FileReader(file));
    String line;
    while ((line = in.readLine()) != null) {
        String[] lineArray = line.split("\\s");
        if (lineArray.length > 0) {
        	String[] lineElementsArray = lineArray[0].split(";");
        	processLineElements(lineElementsArray);
        }
    }
  }
    
    public static void processLineElements(String[] lineElements) {
    	String toPrint = "";
    	for (String element : lineElements) {
			toPrint += wordsToDigits.get(element);
		}
    	System.out.println(toPrint);
    }
}
