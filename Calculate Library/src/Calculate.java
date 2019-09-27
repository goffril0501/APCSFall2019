//Gaby Offril
//August 29, 2019
//Library of math functions


public class Calculate {    //awesome header

	
	//Part One oh yes
	
	
	public static int square(int number) {          //square the input
		int answer = number * number;
		return answer;
	}
	
	public static int cube(int number) {            //cube the input
		int answer = number * number * number;
		return answer;
	}
	
	public static double average(int number1, int number2) {    //average the two inputs
		double answer = (number1 + number2) / 2.0;
		return answer; 
	}
	
	public static double average (int number1, int number2, int number3) { //average the three inputs
		double answer = (number1 + number2 + number3) / 3.0;
		return answer;
	}
	public static double toDegrees (double number) {     //convert radians to degrees
		double answer = number * (180/3.14159);
		return answer;
	}
				
	public static double toRadians (double number) {    //convert degrees to radians
		double answer = (number) * (180/3.14159);
		return answer;
	}
	
	public static double discriminant (double number1, double number2, double number3) {   //returns the discriminant
	    double answer = (number1 * number2) - 4 * number1 * number3; 
	    return answer;
	}
	
	public static String toImproperFrac (int number1, int number2, int number3) {     //convert mixed number to an improper fraction
		int numerator = (number1 * number3) + number2;
		return numerator + "/" + number3;
				
	}
	
	public static String toMixedNum (int number1, int number2) {     //	convert improper fraction to a mixed number
		int whole = number1 / number2;
		int numerator = number1 % number2;
		return whole + "_" + numerator + "/" + number2;
	}
	
	public static String foil (int num1, int num2, int num3, int num4, String x) {    //convert binomial expressions to quadratic equations. this one took a while :|
		int quad1 = num1 * num3;
		int quad2 = (num2 * num3) + (num1 * num4);
		int quad3 = num2 * num4;
		return quad1 + x + "^2" + "+" + quad2 + x + "+" + quad3;
	}
	
	
		//Part 2, Heck yeah! :]
	

	
	public static boolean isDivisibleBy (int divided, int divisor) {
		boolean divisible = divided % divisor ==0;
		return divisible;	
	}

	public static double absValue (double number) {     //find absolute value of input number
		if (number < 0) {
			return 0 - number;
		}else{
			return number;	
		}
	}
	
	public static double max (double number1, double number2) {     //returns the largest value
		if (number1 > number2) {
			return number1;
		}else{ 
			return number2;	
		}
	}
	
	public static double max (double number1, double number2, double number3) {   //same as the above method, but accepts 3 values now. we are accepting of all :)
		if (number1 > number2 && number1 > number3) {
			return number1;
		}else if(number2 > number1 && number2 > number3) {
			return number2;
		}else{ 
			return number3;
		}
	}	
	
	public static int min (int number1, int number2) {    //returns the smallest value
		if (number1 < number2) {
			return number1;
		}else{ 
			return number2;
			
		}
	}
	
	public static double round2 (double number) {    //rounds number to 2 decimal places 
		double step1 = (number * 100) + 0.5;
		double step2 = (int) step1;
		return step2/100;
		}


   

		//Part 3 Bruvva :*

	
	
	

	public static double exponent (double number1, int number2) {   //raises a number to a positive integer power! 
		double answer = number1;
		int i = 1;
		while (i < number2) {
			answer = answer * number1;
			i++;
			
		}
		return answer;
	}	
	
	public static int factorial (int number) {     //returns the factorial of the number
		int answer  = 1;
		while (number > 0) {
			answer = number * answer;
			number--;
		}
		return answer;
	}
	
	public static boolean isPrime (int number) {     //determines if the int is prime
		int factor = 2;
		while (number % factor !=0) {
			factor++;
			
		}
		if (factor ==number) {
			return true;
		}else{	
			return false;
		}
		
	}
		
	public static int gcf (int number1, int number2) {      // finds the greatest common factor of 2 ints
		int less = min(number1, number2);
		double great = max(number1, number2);
		int answer = less;
		while (great%answer !=0) {
			answer--;
			
		}
		return answer;	
	}

}

