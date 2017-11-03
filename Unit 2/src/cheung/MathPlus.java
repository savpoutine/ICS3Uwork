package cheung;
/**
 * This program is for add, subtract, multiply, and divide with ints, doubles, and longs. 
 * @author 344789508
 *
 */
public class MathPlus {

	public static void main(String[] args) {

		int []I= {12, 4, 5, 2, 7};//for int
		double []D= {12.0, 4.0, 5.0, 2.0, 7.0};//for double
		long [] L= {1200, 400, 500, 200, 700}; //for long



		System.out.println(add(4,12));//int
		System.out.println(add(4.0, 12.0));//double
		System.out.println(add(100,200));//long
		System.out.println(subtract(4,12));//int
		System.out.println(subtract(4.1, 12.1));//double
		System.out.println(subtract(100, 200));//long
		System.out.println(multiply(4,12));//int
		System.out.println(multiply(4.0, 12.0));//double
		System.out.println(multiply(100, 200));//long
		System.out.println(divide(4,12));//int
		System.out.println(divide(4.0, 12.0));//double
		System.out.println(divide(100, 200));//long
		System.out.println(sum(I));//sum array
		System.out.println(sum(D));//sum array double
		System.out.println(sum(L));//sum array long
		System.out.println(factorial(6));//factorial int
		System.out.println(numberOfFactors(20));//number of factors
		System.out.println(hypotenuse(3.0,4.0));//hypotenuse 
		System.out.println(min(I));//int min array value
		System.out.println(min(D));//double min array value
		System.out.println(min(L)); // long min array value
		System.out.println(max(I));//int max array value
		System.out.println(max(D));//double max array value
		System.out.println(max(L));//long max array value

	}

	//additions
	public static int add (int num1, int num2){
		return (num1+num2);
	}
	public static double add(double num1, double num2) {
		return (num1+num2);
	}
	public static long add (long num1, long num2) {
		return (num1+num2);
	}
	//subtractions
	public static int subtract(int num1, int num2) {
		return(num2-num1);
	}
	public static double subtract (double num1, double num2) {
		return (num2-num1);
	}
	public static long subtract (long num1, long num2) {
		return (num2-num1);
	}
	//multiplications
	public static int multiply(int num1, int num2) {
		return(num1*num2);
	}
	public static double multiply(double num1, double num2) {
		return (num1*num2);
	}
	public static long multiply(long num1, long num2) {
		return num1*num2;
	}
	//divisions
	public static int divide(int num1, int num2) {
		return (num2/num1);
	}
	public static double divide(double num1, double num2) {
		return (num2/num1);
	}
	public static long divide(long num1, long num2) {
		return (num2/num1);
	}
	public static int sum(int [] I) {
		int total=0;
		for (int i=0; i<I.length; i++) {
			total=I[i]+total;
		}
		return total;
	}
	public static double sum(double [] D) {
		double total=0;
		for (int i=0; i<D.length; i++) {
			total=D[i]+total;
		}
		return total;
	}
	public static long sum(long [] L) {
		long total=0;
		for (int i=0; i<L.length; i++) {
			total=L[i]+total;
		}
		return total;
	}
	public static int factorial(int num1) {
		int total=1;
		for(int i=1; i<=num1; i++) {
			total=total*i;			
		}
		return total;

	}
	public static int numberOfFactors (int num1) {
		int total=0;
		int c=0;
		for (int i=1; i<num1; i++) {
			total=num1%i;
			if (total==0) {
				c++;
			}
		}
		return c;
	}
	public static double hypotenuse (double a, double b) {
		double c=0;
		c=Math.sqrt(a*a+b*b);
		return c;
	}
	public static int min(int [] I) {
		int minValue=I[0];		
		int answer=0;
		for (int i=1; i<I.length; i++) {
			if (minValue>I[i]) {
				minValue=I[i];
				answer=i;
			}
		}
		return answer;
	}
	public static double min (double [] D) {
		double minValue=D[0];
		double answer=0.0;
		for (int i=1; i<D.length; i++) {
			if (minValue>D[i]) {
				minValue=D[i];
				answer=i;
			}
		}
		return answer;
	}
	public static long min(long[] L) {
		long minValue=L[0];
		long answer=0;
		for (int i=1; i<L.length; i++) {
			if (minValue>L[i]) {
				minValue=L[i];
				answer=i;
			}
		}
		return answer;
	}
	public static int max(int [] I) {
		int maxValue=I[0];
		int answer=0;
		for (int i=1; i<I.length; i++) {
			if (maxValue<I[i]) {
				maxValue=I[i];
				answer=i;
			}
		}
		return answer;
	}
	public static double max (double [] D) {
		double maxValue=D[0];
		double answer=0.0;
		for (int i=1; i<D.length; i++) {
			if (maxValue<D[i]) {
				maxValue=D[i];
				answer=i;
			}
		}
		return answer;
	}
		public static long max (long [] L) {
			long maxValue=L[0];
			long answer=0;
			for (int i=1; i<L.length; i++) {
				if (maxValue<L[i]) {
					maxValue=L[i];
					answer=i;
				}
			}
			return answer;
		}

	}