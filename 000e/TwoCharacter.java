
	public class TwoCharacter {
		static String findLongestTwo(String s){
			char c1 = s.charAt(0);
			char c2 = s.charAt(0);
			int sumPrevious = 1;
			int currentLength = 1;
			String longest = "";
			
			for (int i = 1; i < s.length(); i++){
				if (s.charAt(i) == s.charAt(i-1))
					sumPrevious++;
				if ((c1 != s.charAt(i) && c2 != s.charAt(i))) {
					if (currentLength > longest.length())
						longest = s.substring(i-currentLength, i);				
					c1 = s.charAt(i-1);
					c2 = s.charAt(i);
					currentLength = sumPrevious;
					sumPrevious = 1;
				}
				currentLength++;
			}
			if (currentLength > longest.length())
				longest = s.substring(s.length()-currentLength, s.length());
			return longest;
		}
		
		public static void main(String args[]){	
			System.out.println(findLongestTwo(args[0]));
		}
	}
