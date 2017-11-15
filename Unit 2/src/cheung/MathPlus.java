package cheung;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * java.mathplus
 * This program is for various math problems. 
 * October 30, 2017
 * @author Naomi Cheung
 */
public class MathPlus {

	public static void main(String[] args) {
		//array for integers
		int []I= {12, 4, 5, 2, 7};
		//array for doubles
		double []D= {12.0, 4.0, 5.0, 2.0, 7.0};
		//array for longs
		long [] L= {1200, 400, 500, 200, 700}; 
		//array for mode
		double [] M= {1, 5, 3, 4, 7, 2, 4, 4, 3};

		//addition prints in integer, double, then long
		System.out.println(add(4,12));
		System.out.println(add(4.0, 12.0));
		System.out.println(add(100,200));
		//subtraction prints in integer, double, then long
		System.out.println(subtract(4,12));
		System.out.println(subtract(4.1, 12.1));
		System.out.println(subtract(100, 200));
		//multiply prints in integer, double, then long
		System.out.println(multiply(4,12));
		System.out.println(multiply(4.0, 12.0));
		System.out.println(multiply(100, 200));
		//division prints in integer, double, then long
		System.out.println(divide(4,12));
		System.out.println(divide(4.0, 12.0));
		System.out.println(divide(100, 200));
		//sums of an array prints in integer, double and long
		System.out.println(sum(I));
		System.out.println(sum(D));
		System.out.println(sum(L));
		//factorial print
		System.out.println(factorial(6));
		//number of factors print
		System.out.println(numberOfFactors(20));
		//hypotenuse print
		System.out.println(hypotenuse(3.0,4.0)); 
		//Minimum array value prints in integer, double and long
		System.out.println(min(I));
		System.out.println(min(D));
		System.out.println(min(L)); 
		//maximum array value prints in integer, double and long
		System.out.println(max(I));
		System.out.println(max(D));
		System.out.println(max(L));
		//factors print 
		int [] F= factors(20);
		for (int i=0; i<F.length; i++) {
			System.out.print(F[i] + ", ");
		}
		System.out.println();
		//array list print
		ArrayList<Integer> l=arrayList(20);
		for (int i=0; i<l.size(); i++) {
			System.out.print(l.get(i)+ ", ");
		}
		System.out.println(); 
		//mean, median, and mode prints
		System.out.println(mean(D));
		System.out.println(median(D));
		System.out.println(mode(M));
		//permutation and combination prints
		System.out.println(permut(10, 3));
		System.out.println(comb(10,3));
		//quadratic print
		try {
			 double [] roots=quadratic(2, 3, 1);
			for (int i=0; i<roots.length; i++) {
				System.out.println(roots[i]);
			}
		}
		catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		

	}
	//additions
	public static double add(double num1, double num2) {
		return (num1+num2);
	}
	public static int add (int num1, int num2){
		return (num1+num2);
	}
	public static long add (long num1, long num2) {
		return (num1+num2);
	}
	public static ArrayList<Integer> arrayList (int num1){
		int size=numberOfFactors(num1);
		ArrayList<Integer> list = new ArrayList<Integer>(); 
		for (int i=1; i<size; i++) {
			if (num1%i==0) {
				list.add(i);
			}
		}
		return list;
	}
	//divisions
	public static double divide(double num1, double num2) {
		return (num2/num1);
	}
	public static int divide(int num1, int num2) {
		return (num2/num1);
	}
	public static long divide(long num1, long num2) {
		return (num2/num1);
	}
	//factorial
	public static int factorial(int num1) {
		int total=1;
		for(int i=1; i<=num1; i++) {
			total=total*i;			
		}
		return total;

	}
	//factors
	public static int [] factors (int num1) {
		int size=numberOfFactors(num1);
		int place=0;
		int [] answer=new int [size];
		for (int i=1; i<size; i++) {
			if (num1%i ==0) {  
				answer [place]=i;
				place ++;
			}
		}
		return answer;
	}
	//hypotenuse 
	public static double hypotenuse (double a, double b) {
		double c=0;
		c=Math.sqrt(a*a+b*b);
		return c;
	}
	//maximum value
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
	//mean
	public static double mean (double [] D) {
		double average=0; 
		for (int i=0; i<D.length; i++) {
			average=average+D[i];
		}
		average=average/D.length;
		return average;
	}
	//median
	public static double median (double [] D) {
		double number=0;
		double [] copy= Arrays.copyOf(D, D.length);
		Arrays.sort(copy);
		if (copy.length%2==0) {//even 
			number=((copy[(copy.length/2)])+(copy[(copy.length/2-1)]))/2;
		}
		else {
			number=copy[copy.length/2];
		}

		return  number;


	}
	//minimum values
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
	//mode
	public static double mode (double [] M) {
		double counter =0.0;
		double counter2=0.0;
		double place=0; //number in the array
		for (int i=0; i<M.length; i++) {
			for (int j=1; j<M.length; j++) {
				if (M[i]==M[j]) {
						counter++;
				}
				if (counter>counter2) {
					counter2=counter;
					place=M[i];
				}
			}
			counter=0;
			
		}
		

		return place;

	}
	//multiplications
	public static double multiply(double num1, double num2) {
		return (num1*num2);
	}
	public static int multiply(int num1, int num2) {
		return(num1*num2);
	}
	public static long multiply(long num1, long num2) {
		return num1*num2;
	}
	//number of factors
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
	//subtractions
	public static double subtract (double num1, double num2) {
		return (num2-num1);
	}
	public static int subtract(int num1, int num2) {
		return(num2-num1);
	}
	public static long subtract (long num1, long num2) {
		return (num2-num1);
	}
	//sums
	public static double sum(double [] D) {
		double total=0;
		for (int i=0; i<D.length; i++) {
			total=D[i]+total;
		}
		return total;
	}
	public static int sum(int [] I) {
		int total=0;
		for (int i=0; i<I.length; i++) {
			total=I[i]+total;
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
	//quadratic
	public static double [] quadratic (double a, double b, double c) throws ArithmeticException{
		double discriminant= b*b-4*a*c;		
		if (discriminant<0) {
			throw new ArithmeticException("Discriminat is negative");
		} 
		else if (discriminant==0) {
			double [] roots=new double[1];
			roots[0]= -b /(2*a);
			return roots;
		}
		else { // discriminant>0
			double [] roots=new double[2];
			//adding discriminant  
			roots[0]=((-b - (Math.sqrt(discriminant)))/(2*a)); 
			//subtracting discriminant
			roots [1]=((-b + (Math.sqrt(discriminant)))/ (2*a));
			return roots;
		}

	}
	//permutation
	public static double permut (int n, int r) {
		int  equation = (factorial (n))/(factorial (n-r));
		return equation;
	}
	//combination
	public static double comb (int n, int r) {
		int equation =(factorial(n))/((factorial(n-r))*(factorial(r)));
		return equation;
	}


}
