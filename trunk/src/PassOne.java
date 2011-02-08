import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

//what the hell are we using if hashmap whats in it
//removing comments from the side, any ideas on how to do this?
//maybe split function take length if last one include ; get rid of it

//the reason for this is because some lines dont have a first word does it read it
//as a space

//
//for code break up whole thing check for comments take those out then do the pass
//
//18 to index of would be comment
//else 18 to end is just the code
//
//intermediate file save comments and lines they are at by location and make comments.txt
//
//break up operands by commas
//
//machine op, the operation field of length 5 fill with white space
//
//make classes for all the tabels
//
public class PassOne {
	public static String SymbolTable(String input) throws IOException {
		File inputFile = new File(input);
		boolean fileExists = inputFile.exists();
		BufferedWriter bufferedWriter = null;
		BufferedWriter bufferedWriterComments = null;
		if (fileExists == false) {
			return "The file does not exist. Try another one.";
		}

		String read = "";
		FileReader reader = new FileReader(input);
		BufferedReader file = new BufferedReader(reader);
		bufferedWriter = new BufferedWriter(new FileWriter("intermediate.txt"));
		bufferedWriterComments = new BufferedWriter(new FileWriter("intermediate.txt"));


		read = file.readLine();


		if (read.charAt(0) == ';') {
			bufferedWriterComments.write(read);
			bufferedWriterComments.newLine();
			read = file.readLine();
		}
		else
		{
			String orig = read.substring(9, 14);
			if (orig != ".ORIG")
			{
				return "The string does not contain the substring ";
			}
			else
			{
				int locationCounter = 0;
				String location = read.substring(18, 22);
				if(location == "    ")
				{
					locationCounter = 0000;
				}
				//if its 0 - 8000 fine else throw an error
				else
				{
					locationCounter = Utility.HexToDecimalValue(location);;
				}
				bufferedWriter.write(read);
				bufferedWriter.newLine();

				read = file.readLine();

				String end = read.substring(9, 14);

				while(end != ".END"){
					if (read.charAt(0) != ';') {

						String firstWord = read.substring(0, 6);
						if (firstWord != "      "){
							//add to Table  
							locationCounter++;
						}

						String operation = read.substring(9,14);
						//check to see if it exist in bens table
						if (opertaion.exist){
							if("machineop")
							{
								//add to machine op table
								locationCounter++;
							}
							else
							{
								//location depends on psuedo op
								locationCounter++;
							}
						}

						//if it equals space means blank and add to the 
						//location counter

						else if(does not exist)
						{
							return "error";
						}

					}
					String literal = "=";
					String inLineLiteral = "";
					int index3 = read.indexOf(literal);
					// read till , ; /n " "
					if(index3 != -1)
					{
						String space =" ";
						String semicolone = ";";
						String newline= "\n";
						int indexSpace = read.indexOf(space);
						int indexSemi = read.indexOf(semicolone);
						int indexNew = read.indexOf(newline);
						if(indexSpace != -1)
						{
						inLineLiteral = read.substring(index3 + 1, indexSpace);
						}
						else if(indexSemi != -1)
						{
						inLineLiteral = read.substring(index3 + 1, indexSemi);
						}
						else if(indexSemi != -1)
						{
						inLineLiteral = read.substring(index3 + 1, indexNew);
						}
						
						literalTable.add
					}

					String comment = ";";
					int index4 = read.indexOf(comment);
					if(index4 != -1)
					{
						String inLineComment = read.substring(index4);
						bufferedWriterComments.write(inLineComment);
						bufferedWriterComments.newLine();

						String restOfLine = read.substring(0,index4);
						bufferedWriter.write(restOfLine);
						bufferedWriter.newLine();
					}

					else
					{
						bufferedWriter.write(read);
						bufferedWriter.newLine();
						read = file.readLine(); 
					}
				}

			}
		}

		return null;

	}
}

