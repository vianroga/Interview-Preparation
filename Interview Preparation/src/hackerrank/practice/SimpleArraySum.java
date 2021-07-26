/**
 * 
 */
package hackerrank.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Lenovo
 *
 */
public class SimpleArraySum {
	
	
	public static int simpleArraySum(List<Integer> ar) {
	    // Write your code here
		int suma=0;
		for (int i = 0; i < ar.size(); i++) {
			suma+=ar.get(i);
		}
		
	return suma;
	    }

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
      //  BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int arCount = Integer.parseInt(bufferedReader.readLine().trim());

        String[] arTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> ar = new ArrayList<>();

        for (int i = 0; i < arCount; i++) {
            int arItem = Integer.parseInt(arTemp[i]);
            ar.add(arItem);
        }

        int result = simpleArraySum(ar);
        
        System.out.println(result);

   //    bufferedWriter.write(String.valueOf(result));
   //    bufferedWriter.newLine();

         bufferedReader.close();
    //    bufferedWriter.close();
    }

}
