public class UnitTest {

	public static void main(String args[]){
		int n = Integer.parseInt(args[0]);
		for (int i = 0; i < n; i++){
			int t = Integer.parseInt(args[i*3+1]);
			String a = args[i*3+2];
			String b = args[i*3+3];
			if (((t==0) && new StringBuffer(a).reverse().toString().equals(b)) || ((t==1) && a.toUpperCase().equals(b)))
				System.out.println("Good test data");
			else
				System.out.println("Mismatch! Bad test data");
		}
	}
}
