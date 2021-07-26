/**
 * 
 */
package hackerrank.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 * @author Lenovo
 *
 */
public class CompareTheTriplets {
	
	
	public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
	    // Write your code here
	
		List<Integer> resul = new ArrayList<>();
		int aux=0;
		int aux2=0;
		for (int i = 0; i < a.size(); i++) {
			if (a.get(i)>b.get(i)) {
				aux++;
		
			}
			if (a.get(i)<b.get(i)) {
				aux2++;
			}
			if (a.get(i)==b.get(i)) {
				
			}

		}
		
	//	Arrays.asList(aux, aux2);
	//	resul.add(0, aux);
	//	resul.add(1, aux2);
		
	return Arrays.asList(aux, aux2);
	    }
	

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    //  BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] aTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> a = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            int aItem = Integer.parseInt(aTemp[i]);
            a.add(aItem);
        }

        String[] bTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> b = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            int bItem = Integer.parseInt(bTemp[i]);
            b.add(bItem);
        }

        List<Integer> result = compareTriplets(a, b);

        for (int i = 0; i < result.size(); i++) {
       //     bufferedWriter.write(String.valueOf(result.get(i)));
        	System.out.print(result.get(i));

            if (i != result.size() - 1) {
      //         bufferedWriter.write(" ");
            	System.out.print(" ");
            }
        }

     // bufferedWriter.newLine();

        bufferedReader.close();
    //  bufferedWriter.close();
    }

}
