package javaEnumDemo;

public class EnumDemo {

	enum Month {
		JAN, FEB, MAR, APR, MAY, JUN, JULY, AUG, SEP, OCT, NOV, DEC;

		Month month;

		public Month getMonth() {
			return this.month;
		}

	}

	public static void main(String[] args) {

		Month m = Month.JAN;

//		System.out.println(m);//printing enum
//		System.out.println(m.name());//we can access enum using .name
//		System.out.println(m.ordinal());//wJAN can access enum index using .ordinal
//		
//		System.out.println(m.toString());

		switch (m) {

		case JAN:
			System.out.println("jan");
			break;
		case FEB:
			System.out.println("fen");
			break;
		default:
			System.out.println("Invalid input");

		}
	}

}
