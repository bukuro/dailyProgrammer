
public class GreatestCommonDivisor {
		
	public static void main(String args[]){	
		long a = Long.parseLong(args[0]);
		long b = Long.parseLong(args[1]);
		
		while (a != b){
			if (a > b)
				a -= b;
			else
				b -= a;
		}
		
		System.out.println(a);
	}
}
