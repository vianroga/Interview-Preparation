package hackerrank.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class JumpingOnTheClouds {

	 public static int jumpingOnClouds(List<Integer> c) {
		    // Write your code here
		 
		 int saltos = 0;
		 int i = 0;
		 while(i < c.size()-1){
		 if(i+2 < c.size() && c.get(i+2) == 1){ 
		 i++;
		 saltos++;
		 System.out.println("salto : "+saltos);
		 }
		 else{
		 i=i+2;
		 saltos++;
		 System.out.println("salto else : "+saltos);
		 }
		 }
	return saltos;
		    }
	
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		JumpingOnTheClouds Result = new JumpingOnTheClouds();
		
		 BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	    // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

	        int n =6;

	        String[] cTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

	        List<Integer> c = new ArrayList<>();

	        for (int i = 0; i < n; i++) {
	            int cItem = Integer.parseInt(cTemp[i]);
	            c.add(cItem);
	        }

	        int result = Result.jumpingOnClouds(c);
	        
	        System.out.println(result);

	       // bufferedWriter.write(String.valueOf(result));
	       // bufferedWriter.newLine();

	       // bufferedReader.close();
	       // bufferedWriter.close();
	    }

	}


