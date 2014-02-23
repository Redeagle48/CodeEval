package moderateLevel.mthToLastElement;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

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

	public static void ProcessLine(String[] line){
		ArrayList<String> lineArray = new ArrayList<String>();
		for (int i = 0; i < line.length-1; i++) {
			lineArray.add(line[i]);
		}

		//if(Integer.parseInt(line[line.length-1]) > lineArray.size()) {
		//	System.out.println(-1);
		//} else {
			int order = lineArray.size();
			order -= Integer.parseInt(line[line.length-1]);
			try {
			System.out.println(lineArray.get(order));
			} catch (IndexOutOfBoundsException iobe) {
				
			}
		//}
	}
}
