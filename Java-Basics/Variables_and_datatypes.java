package basics;

public class Variables_and_datatypes {
public static void main(String args[]) {
		
		//java is case sensitive
		//camelCase is a standard way of writing variable name
		
		//variable- Named memory container for storing data.
		//datatypes- type of the value stored
		
		//type of datatypes
		/*1)primitive
		 * raw value— not an object.
		 * int, char, boolean, float, byte, long, short
		 * String is a class & non primitive datatype
		 * ex: int a = 5; → int is a primitive
		 */
		/*2)non primitive/reference:
		 * Store **references to objects**
		 * Can have methods, can store null  
		 * Includes: Wrapper Classes, String, Arrays etc
		 * 
		 * Wrapper:
		 * Class that wraps primitive into an object (int → Integer)
		 * Useful when working with collections, nulls, and object methods
		 * Integer, Character, Boolean, Float, Byte, Long, Short
		 * ex: ArrayList<int> ❌ → must use ArrayList<Integer> ✅
		 */
	
		
		//note:
		/*1)byte = 8 bits 
		 * 1 byte of memory (used to measure data size) 
		 */
		/*2) Range: limit values that can be stored
		 * ex: assume range: int= 1to2
		 * but i assign int a=3; which is out of the range and pops up a error 
		 */
		
		//1 int range:(-2^(31) to 2^(31)-1), byte=4
		//variable declaration- datatype variablename(syntax)
		//int ticketPrice;
		
		//assigning the value
		//ticketPrice=800;
		
		//print
		//System.out.println(ticketPrice);
		
		//Initialization = declaration + assignment together (e.g., int x = 5;)
		int ticketPrice=800;
		System.out.println("ticket price is " + ticketPrice);
		
		//2 char- a,b,c, char cannot be in seq like abc
		//note: ''(single quote)- char 
		char a='y';
		System.out.println(a);
		
		//3 String- seq of char
		//note: ""(double)-more that one char i.e, string
		String b="abc";
		System.out.println(b);
		
		//4 Byte(-128 to 127)
		byte oneByte= -128;
		System.out.println(oneByte);
		
		//5 short(-32768 to 32767): shortest integer 
		short n= -32767;
		System.out.println(n);
		
		//6 long(-2^(63) to 2^(63)-1): longest integer
		long m= -76667564;
		System.out.println(m);
		
		//7 float(upto 7 decimal digits)
		//8 double(upto 15 decimal digits)
		//17.89f is a float
		//17.89 is a double
		float v= 17.89f;
		System.out.println(v);
		double w= 17.89;
		System.out.println(w);
		
		//9 Boolean
		boolean morning= true;
		System.out.println(morning);
		
		
		
		
	}

}
