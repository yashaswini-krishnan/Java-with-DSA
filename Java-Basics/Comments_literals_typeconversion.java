package basics;

public class Comments_literals_typeconversion {
	public static void main(String[] args) {
		
		/*Comments help human understand the code 
		 * types:
		 * 1) single line: "//" comment in just one line
		 * 2) multiple line: "/*....." comments written in multiple lines 
		 */
		
		//literals: values assigned to variables are called literals
		int a =10; //numerical literal
		char ch ='c'; //character literal
		boolean bool =true; //boolean literal
		System.out.println(a);
		System.out.println(ch);
		System.out.println(bool);
		
		/*type conversions: converting one datatype(ex:byte) to another(ex:int)
		 * types of type conversion:
		 * 1) implicit: converts automatically
		 * condition: the value that is been assigned should have a lesser byte value
		 * note: byte,bool -> (byte=1) ;  short,char -> (byte=2) 
		 *       int,float -> (byte=4) ;  double,long -> (byte=8)
		 *  ex: values of byte can be assigned to the int but not the other way
		 *  
		 * 2)explicit: convert manually, ignoring highest and lowest byte values
		 * But we have to check the range
		 * ex: byte can store upto 128 if i try to store 1000 int value, wrong o/p will be produced
		 */
		
		//Example for implicit
		//1. byte to int
		int n; //(Byte=4)
		byte b=4; //(byte=1)
		n=b;
		System.out.println(n);
		//2. char to int
		int m; //byte=4
		char c='a'; //byte=2
		m=c;
		System.out.println(m); //output: ascii value of a
		//2. char to long
		long l; //byte=8
		char k='y'; //byte=2
		l=k;
		System.out.println(l); //output: ascii value of y
		//2. char to float
		float f; //byte=4
		char g='y'; //byte=2
		f=g;
		System.out.println(f); //output: ascii value of y
				
		//Example for explicit
		//int to byte
		int h=12; 
		byte r; //range: -127 to 128
		r=(byte)h;
		System.out.println(r);
		
		//int to char
		int n1=21; 
		char s;
		s= (char)n1;
		System.out.println(s); 
		//shows a weird symbol as output because there is no char under ascii 21
		
		//int to char
		int n2=65; 
		char j;
		j= (char)n2;
		System.out.println(j); 
		//prints character which has acsii 65
		
		
		
		//wrong output case
		int d=1200; 
		byte i; //range: -127 to 128 but d=1200 exceeding the range
		i=(byte)d;
		System.out.println(i);//output= -80, which is not equal to d
		
		
	}

}
