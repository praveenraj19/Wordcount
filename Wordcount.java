
import java.io.*;


public class Wordcount {

	public static void main(String[] args) {
		
		String line = "";
		char [] word;					
		int wordCounter = 0;
		int x = 0;

try {
	 //Open file and reads it
	 File file = new File("src/plain text.txt");
	 FileReader fileReader = new FileReader(file);
	 BufferedReader reader = new BufferedReader(fileReader);
	
	 // read the file one line at a time
	 while((line = reader. readLine()) != null) {
		 word = line.toCharArray();

		 // if the line length is zero then go to next line
		 while (word.length == 0) {
			 line = reader.readLine();
			 word = line.toCharArray();
		 }
		 // returns the the first character in the line
		 x = 0;
		
		 // clear blank spaces at the beginning of the line, that is while there is no characters on the line.
		 while(Character.isWhitespace(word[x])) {
			 x++;
			 if(x == (word.length)) break;
		 }

		 // Reads from the first character in the line
		 for(int i = x; i < word.length; i++)
		 {
			 // when a space is detected or the eol is reached the word counter is incremented
			
			 if(Character.isWhitespace(word[i]) || (i == (word.length - 1))) {

				 wordCounter++;
				
				 // clear this space and adjoining blank spaces
				 while(Character.isWhitespace(word[i])) {

					 // Ensure conditions where the line ends with spaces or tabs does not occur
					
					 if(i == (word.length -1)) break;

					 i++;

				 }
			 }
		 }
	 }
		 fileReader.close();

		 // format text for output
		 String results = "File contains " + wordCounter + " words.";

		 byte buf[] = results.getBytes();
		 
		 // write the text to the results file
		 OutputStream os = new FileOutputStream("result.txt");
		 os.write(buf);
		 os.close();
	}
		catch(FileNotFoundException e){
		System.out.println ("The file does not exist.");
		}
		catch(Exception e) {
			System.out.println (e.toString());
		}
		finally{
		}
	}
}


