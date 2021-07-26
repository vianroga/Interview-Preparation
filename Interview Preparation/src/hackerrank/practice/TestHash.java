package hackerrank.practice;

import java.util.HashSet;

public class TestHash {	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<Integer> hashSet = new HashSet<Integer>();
		
		
		for (int i = 1; i <= 10; i++) {
			hashSet.add(i);
			
			}
		
			if (hashSet.size()!= 0) {
				System.out.println("tengo elementos");
				
			}
			else {
				
				System.out.println("No tengo elementos");
			}
			
		System.out.println(hashSet);
		
		

	}

}
