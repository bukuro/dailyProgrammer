public class PerfectPowers {		
	static int calcPerfectPower (long x){
		if (x < 2){
			return (x==0)?-1:1;
		} 
		int p = 32;
		double y;
		do{ 
			p--; 
			y = Math.pow(x,1.0/p);
		}while ((y != (int)y) && (p > 1));
		return p;
	}
	
	public static void main(String args[]){	
		System.out.println(calcPerfectPower(Long.parseLong(args[0])));
	}
}