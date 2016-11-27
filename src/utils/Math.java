package utils;

public class Math {

	public static int factorial(int n){
		if (n==0) return 1;
		return n*factorial(n-1);
		
	}
	
	public static int factorialLoop(int n){
		int fl = 1;
		for (int a=n; a>0; a--){
			fl*=a;
			
		}
		return fl;
	}
}
