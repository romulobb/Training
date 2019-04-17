

/*
Run-length encoding is a fast and simple method of encoding strings. The basic idea is to represent repeated successive characters as a single count and character.
 For example, the string "AAAABBBCCDAA" would be encoded as "4A3B2C1D2A". Implement run-length encoding and decoding. You can assume the string to be encoded have 
 no digits and consists solely of alphabetic characters. You can assume the string to be decoded is valid.
*/
import java.util.*;

public final class Ej3 {

	
	public static String encoding(String S) {
			char previousChar=S.charAt(0);
			String rta="";int occur=1;
			
			for(int index=1;index < S.length();index++)
			{
				if (S.charAt(index)==previousChar) {
					occur++;
				}
				else {rta=rta+occur+previousChar;
					 occur=1;}
				previousChar=S.charAt(index);
			}
			rta=rta+occur+previousChar;
		 
		return rta;
	}
	public static String decoding(String S) {
		char Char;
		String rta="";int occur=0;
		for(int index=0;index < S.length();index++)
		{	Char=S.charAt(index+1);
			occur=Character.getNumericValue(S.charAt(index));
			for(int repeat=1;repeat <= occur;repeat++)
				{rta=rta+Char;}
			index++;
		}
		return rta;
		
	}
	public static void main(String[] args) {
		// System.out.println(" Encoding String  ABCD : "+encoding("ABCD"));
		 
		 System.out.println(" Decoding String  1A1B1C1D : "+decoding("1A1B1C1D"));
	 }
}
