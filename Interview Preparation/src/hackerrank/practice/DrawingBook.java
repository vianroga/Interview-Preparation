/**
 * 
 */
package hackerrank.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;




/**
 * @author Lenovo
 *
 */
public class DrawingBook {

	/**
	 * @param args
	 * @return 
	 */
	
	
	public static int pageCount(int n, int p) {
		// Write your code here
		
	/*	
	  -Solucion 1, con menos lineas de codigo
	 	int der;
		int izq;
		
		der=n/2;
		izq=(p/2)-(n/2);
		
		System.out.println(der+" "+izq);
		
		*/
		
		int pagina=1;
		int aux=0;
		int aux2=0;
		
	for (int i = 1; i <=n; i++) {
		
		if (pagina<p) {
			aux++;
			pagina+=2;
		}
	}
		if (n%2==0) {
			pagina=n;
		}else {
		    pagina=n-1;
		}
	
	for (int i = 1; i <=n; i++) {
			if(pagina>p) {
				aux2++;
				pagina-=2;
			}
	}	
		
	/*
	System.out.println(Math.min(aux, aux2));
	System.out.println(aux+"derecha");
	System.out.println(aux2+"izquierda");
	*/
	
		return Math.min(aux, aux2);

			    }
	
	public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
       

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        int p = Integer.parseInt(bufferedReader.readLine().trim());

        int result= pageCount(n, p);
       
        System.out.println(result);

        bufferedReader.close();
  
    }

}
