//Gaby Offril
//APCS Perid 3
//August 29, 2019
//Call the code from the Calculate class (aka client or runner code)
public class DoMath {

	public static void main(String[] args) {
		System.out.println(Calculate.square(5));
		System.out.println(Calculate.cube(3));
		System.out.println(Calculate.average(2, 2));
		System.out.println(Calculate.average(1, 2, 3));
		System.out.println(Calculate.toRadians(15));
		System.out.println(Calculate.toDegrees(12));
		System.out.println(Calculate.discriminant(2, 4, 3));
		System.out.println(Calculate.absValue(5));
		System.out.println(Calculate.toMixedNum(9, 2));
		System.out.println(Calculate.foil(2, 3, 6, -7, "x"));
	}
}
