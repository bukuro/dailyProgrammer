import java.util.Random;

public class RollDice {
	
	public static void main(String args[]){	
		String []data = args[0].split("d");
		int nRolls = Integer.parseInt(data[0]);
		int faces = Integer.parseInt(data[1]);
		Random r = new Random();
		for (int i = 0; i < nRolls; i++){
			System.out.print((r.nextInt(faces)+1) + " ");
		}
	}
}
