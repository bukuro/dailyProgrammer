import java.util.Map;
import java.util.HashMap;
import java.util.Random;

public class FootTrafficGenerator {
	
	public static void main(String args[]){	
		int e = Integer.parseInt(args[0]);
		int v = Integer.parseInt(args[1]);
		int r = Integer.parseInt(args[2]);
		int i = Integer.parseInt(args[3]);
		int o = Integer.parseInt(args[4]);
		Random rand = new Random();
		Map<Integer, int[]> m = new HashMap<Integer, int[]>();
		
		while (e > 0){
			int user = rand.nextInt(v + 1);
			int[] d = m.get(user);
			if (d == null){
				d = new int[2];
				d[0] = rand.nextInt(r + 1);
				d[1] = i + rand.nextInt(o - i + 1);
				System.out.println (user + " " + d[0] + " I " + d[1]);
				m.put(user, d);
				e--;
			}
			else{
				d[1] = d[1] + rand.nextInt(o - d[1] + 1);
				System.out.println (user + " " + d[0] + " O " + d[1]);
				m.remove(user);
			}
		}
		
		for (Map.Entry<Integer, int[]> u : m.entrySet()){
			u.getValue()[1] = u.getValue()[1] + rand.nextInt(o - u.getValue()[1] + 1);
			System.out.println (u.getKey() + " " + u.getValue()[0] + " O " + u.getValue()[1]);
		}
	}
}
