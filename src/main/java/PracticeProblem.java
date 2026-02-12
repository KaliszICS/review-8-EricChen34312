public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static String pluralize(String str){
		//return each plural suffix for each suffix, otherwise s
		if(str.toLowerCase().endsWith("ey")){
			return "eys";
		} else if (str.toLowerCase().endsWith("y")){
			return "ies";
		} else if (str.toLowerCase().endsWith("ife")){
			return "ives";
		} else {
			return "s";
		}
	}

	public static int min(int a, int b, int c){
		//return a if a > b & a > c, b if b > c & b > a and return c otherwise
		if (a < b && a < c){
			return a;
		} else if (b < c && b < c){
			return b;
		} else {
			return c;
		}
	}

	public static boolean isLeapYear(int year){
		// disgusting if ladder, follow the 3 steps and return leap year or not
		if (year%4 == 0){
			if (year%100 == 0){
				if (year%400 == 0){
					return true;
				} else {return false;}
			} else {return true;}
		} else {return false;}
	}
}