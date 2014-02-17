import java.util.Random;
import java.util.Scanner;

public class ArithmeticEquations {
	public static void main(String args[]){	
		Scanner scan = new Scanner(System.in);
		int min = scan.nextInt();
		int max = scan.nextInt();
		int numbers[] = new int[4];
		char operators[] = new char[3];
		Random r = new Random();
		
		while (true){
			for (int i = 0; i < 4; i++)
				numbers[i] = min + r.nextInt(max - min + 1);
	
			String equation = numbers[0] + "";
			for (int j = 0; j < 3; j++){
				int k = r.nextInt(3);
				if (k != 2){
					operators[j] = (k == 1) ? '+' : '-';
					equation += " " + operators[j] + " " + numbers[j + 1];
				}
				else{
					operators[j] = '*';
					equation += " " + operators[j] + " " + numbers[j + 1];
					numbers[j+1] *= numbers[j];
					numbers[j] = 0;
					if (j != 0){
						operators[j] = operators[j - 1];
						operators[j - 1] = '+';
					}
				}
			}
			
			int result = numbers[0];
			for (int i = 1; i < 4; i++)
				result += operators[i - 1] == '-' ? -numbers[i] : numbers[i];

			boolean correct = false;
			while (!correct){
				System.out.println(equation);
				scan = new Scanner(System.in);
				String input = scan.next();
				if (input.equalsIgnoreCase("q"))
					System.exit(0);
				correct = input.equalsIgnoreCase(result + "");
				if (correct)
					System.out.println("Correct!");
				else
					System.out.println("Incorrect!");
			}
		}
	}
}