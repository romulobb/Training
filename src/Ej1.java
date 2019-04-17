
import java.util.ArrayList;

public class Ej1 {

		final static int ARRAY_LIST_LENTGH =4;
		public static boolean exercice(ArrayList<Integer> arr, int k) {
	        System.out.println("List: " + arr); 
	        boolean rta=false;
	        
	        for(int i=0;i<ARRAY_LIST_LENTGH;i++) {
	        	for(int j=i;j<ARRAY_LIST_LENTGH;j++) {
	        		if (j!=i){
	        			int sum=arr.get(i)+arr.get(j);
	        			//System.out.println("i "+i+ "j "+j + " sum" + sum);
	        			if (sum==k) {
	        				rta=true;
	        			}
	        		}
	        	}
	        }
	        
	        return rta;
		}
	} 
	
	

