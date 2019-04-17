public class Solution2 {

	/**
	 * 
	 *  An integer N is given, representing the area of some rectangle.
	    The area of a rectangle whose sides are of length A and B is A * B, and the perimeter is 2 * (A + B).
		The goal is to find the minimal perimeter of any rectangle whose area equals N. The sides of this rectangle should 
		be only integers.
		For example, given integer N = 30, rectangles of area 30 are:

				(1, 30), with a perimeter of 62,
				(2, 15), with a perimeter of 34,
				(3, 10), with a perimeter of 26,
				(5, 6), with a perimeter of 22.
		Write a function:   class Solution { public int solution(int N); }
		that, given an integer N, returns the minimal perimeter of any rectangle whose area is exactly equal to N.
		For example, given an integer N = 30, the function should return 22, as explained above.
		Write an efficient algorithm for the following assumptions:
		N is an integer within the range [1..1,000,000,000].
	 * 
	 *  simple2 
		N = 48 test WRONG ANSWER 
		got 26 expected 28
		 simple3 
		N = 101 test WRONG ANSWER 
		got 40 expected 204
		small 
		N = 1,234 test WRONG ANSWER 
		got 140 expected 1238
	 */
	 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(" Solution N = 24 "+Cantidadfactores(24));  
	}
	public static int Solution(int N){
		int base=1;
		int altura=N;
		int minPerimetro=(base+altura)*2;
		
		
		int index =base+1;
		while (index < (N/2))
		{
			double divisionReal =(double)N/index;
			
			if (divisionReal == (N / index) ){
				
				base=index; altura=N/index;
				if (((base+altura)*2)<minPerimetro)
					{ minPerimetro= (base+altura)*2; }
			}
			
			index++;
		}
		return minPerimetro;
	}

	public static int Cantidadfactores(int N){
		
		int cantidadFactores;
		if (N>1) cantidadFactores=2;
		else cantidadFactores=1;
		
		int index =2;
		while (index <= (N/2))
			{ if ((N%index)==0){
				cantidadFactores=cantidadFactores+1; 
				System.out.println(" Solution N = 24 Cantidad Factores "+cantidadFactores+" index "+index );  	
			} 
			
			index++;
			}
		
		return cantidadFactores;
	}
	public static int[] solution(int[] A)
	{   int[] rta=null;
		
		return rta;
	}
	
}
