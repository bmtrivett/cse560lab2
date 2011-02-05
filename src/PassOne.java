import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

//what the hell are we using if hashmap whats in it
//removing comments from the side, any ideas on how to do this?
//better way to check words at the beginning?

public class PassOne {
	public static String SymbolTable(String input) throws IOException {
		File inputFile = new File(input);
		boolean fileExists = inputFile.exists();
		  BufferedWriter bufferedWriter = null;

		if (fileExists == false) {
			return "The file does not exist. Try another one.";
		}

		String read = "";
		FileReader reader = new FileReader(input);
		BufferedReader file = new BufferedReader(reader);
		bufferedWriter = new BufferedWriter(new FileWriter("intermediate.txt"));

		
		read = file.readLine();



		//Are there javascirpt comments??????
		if (read.charAt(0) == ';') {
			read = file.readLine();
		}
		else
		{
			String orig = ".ORIG";
			int index1 = read.indexOf(orig);
			if (index1 == -1)
			{
				return "The string does not contain the substring ";
			}
			else
			{
				bufferedWriter.write(read);
				bufferedWriter.newLine();
				
				int locationCounter = 0;
				read = file.readLine();
				String end = ".END";
				int index2 = read.indexOf(end);
				while(index2 != -1){
					if (read.charAt(0) != ';') {
					
						int firstWord = read.indexOf(" ");
						if (read.substring(0,firstWord) == "Label"){
							//add to Table  
							locationCounter++;
						}
						else if (read.substring(0,firstWord) == "Machine" || read.substring(0,firstWord) == "Pseudo"){
							//add to Table 
							locationCounter++;
						}
						else
						{
							return "error";
						}

					}
					String literal = "=+";
					int index3 = read.indexOf(literal);
					if(index3 != -1)
					{
						//add to literal table 
					}

					bufferedWriter.write(read);
		            bufferedWriter.newLine();
		            read = file.readLine(); 
				}
				
			}
		}

		return null;

	}
}

