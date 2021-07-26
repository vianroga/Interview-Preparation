package hackerrank.practice;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * 
 */

/**
 * @author Lenovo
 *
 */
public class SalesbyMatch {
	

	  public static int sockMerchant(int n, List<Integer> ar) {
		    // Write your code here
		 
		  HashSet<Integer> hash = new HashSet<Integer>();
		    int count = 0;
		    for (int i = 0; i <ar.size(); i++) {
		      int element = ar.get(i);
		      if (hash.contains(element)) {
		        count++;
		        System.out.println("hash if: "+ hash+" i: "+i);
		        System.out.println("element if : "+element+" i: "+i);
		        System.out.println("contador "+ count);
		        
		        hash.remove(element);
		        
		       // System.out.println("element post : "+element+" i: "+i);
		       
		      } else {
		    	  
		    	
		        hash.add(element);
		        
		        System.out.println("hash else: " +hash+" i: "+i);
		        System.out.println("elements else: " + element+" i: "+i);
		      }
		    }
		   
		    return count;
	       
	  }

		    
	

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {	
		// TODO Auto-generated method stub
		
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
       // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
        SalesbyMatch Result = new SalesbyMatch();
        
        int n = 9;

        String[] arTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> ar = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int arItem = Integer.parseInt(arTemp[i]);
            ar.add(arItem);
        }

        int result = Result.sockMerchant(n, ar);

        System.out.println(result);

        bufferedReader.close();
     
	}

}
