package easyLevel.fibonacciSeries;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

//Sample code to read in test cases:
public class Main {

	static ArrayList<Integer> fibonacci = new ArrayList<Integer>();

	public static void main (String[] args) throws IOException {

		File file = new File(args[0]);
		BufferedReader in = new BufferedReader(new FileReader(args[0]));
		String line;
		while ((line = in.readLine()) != null) {
			String[] lineArray = line.split("\\s");
			if (lineArray.length > 0) {
				//Process line of input Here
				//System.out.println("Processar linha com valor: " + line);
				ProcessLine(line);
			}
		}
	}

	public static void ProcessLine(String line) {
		int order = Integer.parseInt(line);
		int result = -1;
		if(fibonacci.size() > order) {
			result = fibonacci.get(order);
		} else {
			result = calculateFibonacci(order);
		}
		//System.out.println("Resultado: " + result);
		System.out.println(result);
	}

	public static int calculateFibonacci(int order){
		if(fibonacci.size() == 0){
			fibonacci.add(0);
			fibonacci.add(1);
		}
		while(fibonacci.size() <= order) {
			fibonacci.add(fibonacci.get(fibonacci.size()-2) + fibonacci.get(fibonacci.size()-1) ); 
		}
		return fibonacci.get(fibonacci.size()-1);
	}
}

