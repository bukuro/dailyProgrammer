public class NDivisibleDigits {
	public static void main(String args[]){	
		int n = Integer.parseInt(args[0]);
		int m = Integer.parseInt(args[1]);
		int largest = (int)Math.pow(10, n) - 1;
		
		System.out.println(largest - (largest % m));
	}
}