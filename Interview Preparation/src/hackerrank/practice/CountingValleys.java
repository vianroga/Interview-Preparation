/**
 * 
 */
package hackerrank.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;



/**
 * @author Lenovo
 *
 */
public class CountingValleys {

	/**
	 * @param args
	 */
	
	public static int countingValleys(int steps, String path) {
	    // Write your code here
		
		char []myCharArray=null;
		int valle=0;
		int nivel=0;

		for (int i = 0; i < path.length(); i++) {
			 myCharArray = path.toCharArray();
			 
			 if (myCharArray[i]=='D') {
				 nivel--;
				 System.out.println(nivel +"D");
			}else {
				nivel++;
			System.out.println(nivel + "U");
			}
			        
			 if (myCharArray[i]=='U'&& nivel==0) {
				valle++;
				System.out.println(valle);
				
			}
		}
		
		
	return valle;
	    }
	

	 public static void main(String[] args) throws IOException {
	        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	       // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

	        int steps = Integer.parseInt(bufferedReader.readLine().trim());

	        String path = bufferedReader.readLine();

	        int result = countingValleys(steps, path);
	        
	        System.out.println(result);

	        //bufferedWriter.write(String.valueOf(result));
	        //bufferedWriter.newLine();

	        bufferedReader.close();
	        //bufferedWriter.close();
	    }

}
