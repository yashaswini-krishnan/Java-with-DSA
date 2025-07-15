
/*three important concepts before starting
 * 1) Methods/functions
 * small block of code that executes a specific task
 * can be called anywhere in the class
 * often ends with paranthesis ()
 * ex: main(), print(), loginUser()
 * 
 * 2)Class:
 * Blueprint used for creating object 
 * contain attributes(variables): string username; and methods(functions):register(){..}
 * all the java code is written inside the class
 * 
 * 3)Packages:
 * Think of them as folders that organize Java classes
 * ex: java.io.* contains pre-written code for I/O operations
 */

/* Keywords:
 * public: Makes the method or class accessible from anywhere
 * static: Belongs to the class, not instances (can run without creating an object)
 * void: method returns nothing
 * main(): The entry point method Java looks for during execution
 * String[]:Array of strings to accept input from the command line
 * args: Variable that stores the command line input values
 */

package basics; //package name(acts like a folder)

public class Helloworld {
		public static void main(String[] args) {
			//syntax: rules for writing the code in java
			//statement: A single instruction (ends with ;)
			System.out.println("Hello java"); //output line
		}

	}


