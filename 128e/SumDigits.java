
public class SumDigits {	
	public static void main(String args[]){	
		String number = args[0];
		System.out.println(number);		
		while (number.length() > 1){
			char[] t = number.toCharArray();
			int s = 0;
			for (char c : t){
				s += Character.getNumericValue(c);
			}
			number = String.valueOf(s);
			System.out.println(number);
		}
	}
}
