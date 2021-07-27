/**
 * Creado por: Victor Roman Garrido
 * Fecha:27/07/2021 5:22:08 p. m.
 */
package hackerrank.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Victor Roman Garrido
 *
 */
public class AVeryBigSum {
	
	public static long aVeryBigSum(List<Long> ar) {
	    // Write your code here
		long resultado = 0;
		for (int i = 0; i < ar.size(); i++) {
			resultado+= ar.get(i);
		}
		
		return resultado;
	    }

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
      // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int arCount = Integer.parseInt(bufferedReader.readLine().trim());

        String[] arTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Long> ar = new ArrayList<>();

        for (int i = 0; i < arCount; i++) {
            long arItem = Long.parseLong(arTemp[i]);
            ar.add(arItem);
        }

        long result = aVeryBigSum(ar);
        System.out.println(result);

       // bufferedWriter.write(String.valueOf(result));
       // bufferedWriter.newLine();

        bufferedReader.close();
       // bufferedWriter.close();

	}

}
