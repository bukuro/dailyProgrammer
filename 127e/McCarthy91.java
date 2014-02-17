public class McCarthy91 {
		
	static int r=0;
		
	static int c91 (int n){
		String expression;
		if (n > 100){
			r-=1;				
			expression=(n-10)+"";
		}
		else{
			r+=1;
			expression=(n+11)+"";
		}
		
		for (int i=0;i<=r;i++)
			expression = String.format("M(%s)", expression);
		System.out.print(expression);
			
		if (n > 100){
			System.out.println(" since "+n+" is greater than 100");
			return n-10;
		}
		else{
			System.out.println(" since "+n+" is equal to or less than 100");
			return c91(c91(n+11));
		}
	}
		
	public static void main(String args[]){	
		System.out.println("M("+args[0]+")");
		System.out.println(c91(Integer.parseInt(args[0])));
	}
}