//Assignment 3.1

//Write a program in java to differentiate between instance variables and class variables. And also
//show the scope of each.
//Hint: - Class variables are those variables which are declared as static.


//Class Variables

package assignment_3_1;

public class Techno_functional_Analysts {
	//class variables are declared with the keyword static
	/*
	 * Static variables are created when the program starts and destroyed when the program stops.
	 * */
		//declaring a class variable
		private static double fees;
		
		//when variables are defined as final their values cannot be changed
		public static final String Subject1 = "Excel;";
		public static final String Subject2 = "SQL;";
		public static final String Subject3 = "Big Data;";
		public static final String Subject4 = "R;";
		public static final String Subject5 = "SAS;";
		public static final String Subject6 = "Python;";
		public static final String Subject7 = "Tableau;";
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			fees = 45000;
		      System.out.println("  Subject1 :::   " +  Subject1 + "\n  Subject2 :::   " +  Subject2 
		                          + "\n  Subject3 :::   " +  Subject3   +  "\n  Subject4 :::   "   +  Subject4
		                          + "\n  Subject5 :::   " +  Subject5 + "\n  Subject6 :::   " +  Subject6
		                          + "\n  Subject7 :::   " +  Subject7 +  "\n      Fees ::: "  + fees);
		
		
		
		}
		
}
