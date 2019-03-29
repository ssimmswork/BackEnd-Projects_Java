import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import project4.Temp;

public class tempDriver {
	public static void main(String[] args) {

		double temp[] = new double[12];

		String filePath = "C:\\folder\\temp.dat";

		try {

			readFile(filePath, temp);

		}

		catch (Exception exception) {
			System.err.println("An Error Has occured: " + exception.getMessage());
			System.exit(-1);

		}

	
	Temp obj = new Temp(temp);
	
	System.out.println(obj.toString());

	}

	public static void readFile(String filePath, double[] temp) throws Exception

	{

		
		
		try {

			Scanner file = new Scanner(new File(filePath));

			int i = 0;
					
			while (file.hasNext() && i < temp.length) {

				
					temp[i] = Double.parseDouble(file.next());

					i++;
					
			}
		}

		catch (FileNotFoundException exception) {
			System.err.println("File Not Found");
			System.exit(-1);

		}

		

	}

}
