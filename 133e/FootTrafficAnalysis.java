import java.util.Map;
import java.util.TreeMap;

public class FootTrafficAnalysis {

	public static void main(String args[]){	
		int n = Integer.parseInt(args[0]);
		Map<Integer, int[]> m = new TreeMap<Integer, int[]>();
		for (int i = 0; i < n; i++){
			int room = Integer.parseInt(args[i*4+2]);
			char direction = args[i*4+3].charAt(0);
			int time = Integer.parseInt(args[i*4+4]);
			int[] d = m.get(room);
			if (d == null)
				d = new int[2];
			if (direction == 'I')
				d[0] -= time;
			else
				d[0] += time;
			d[1]++;
			m.put(room, d);
		}
		
		for (Map.Entry<Integer, int[]> u : m.entrySet()){
			int  v = u.getValue()[1] / 2;
			System.out.println("Room " + u.getKey() + ", " + u.getValue()[0] / v + " minute average visit, " + v + " visitor(s) total");
		}
	}
}
