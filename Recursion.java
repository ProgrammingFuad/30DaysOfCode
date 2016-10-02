
public class Recursion {

	
	public static int Summation(int x){
		//Base Case: We are at the end
		if(x<=0){
			return 0;
		}
		else{
			//Recursive case
			return x+ Summation(x-1);
		}
	}
	
	
	public static int Factorial(int n){
		if(n<=1){
			return 1;
		}
		else{
			return n* Factorial(n-1);
		}
	}
	
	public static int Exponentiation(int n, int p)
	{
		if(p<=0){
			return 1;
		}
		else{
			return n * Exponentiation(n, p-1); 
		}
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(Summation(3));
		
		System.out.println(Factorial(3));
		
		System.out.println(Exponentiation(5,3));
	}

}
