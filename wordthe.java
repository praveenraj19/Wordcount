package wordthe;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class wordthe {
	public static void main(String[] args) throws IOException {

		BufferedReader br = null;
		
		br = new BufferedReader(new FileReader("C:/Users/User/Downloads/pg2600.txt"));

			String str;
			
			int s = 0;
			

			while ((str = br.readLine()) != null)
			{
				String[] word = str.split(" ");
				
				int arraylength = word.length;
				
				for(int n = 0; n < arraylength; n++){
					
					if(word[n].equals("the")){
						s++;
					}
				}
				
			}
			br.close();
			System.out.println("Number of occurance of 'THE' = " + s);
			
		} 

    
	}

