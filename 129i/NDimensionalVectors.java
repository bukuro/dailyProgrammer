import java.text.DecimalFormat;

public class NDimensionalVectors {
	
	static double length (double[] v){
		double r = 0;
		for (double u : v)
			r += Math.pow(u, 2);
		return Math.sqrt(r);
	}
	
	static double[] normalize (double[] v){
		double[] r = new double[v.length];
		double length = length(v);
		for (int i = 0; i < v.length; i++)
			r[i] = v[i] / length;
		return r;	
	}
	
	static double product (double[] v1, double[] v2){
		double r = 0;
		for (int i = 0; i < v1.length; i++)
			r += v1[i]*v2[i];
		return r;
	}

	public static void main(String args[]){
		int c = 0;
		int n = Integer.parseInt(args[c++]);
		double[] vecs[] = new double [n][];
		for (int i = 0; i < n; i++){
			int a = Integer.parseInt(args[c++]);
			double v[] = new double [a];
			for (int j = 0; j < a; j++)
				v[j] = Double.parseDouble(args[c++]);
			vecs[i] = v;
		}
		
		DecimalFormat f = new DecimalFormat("#.#####");
		int m = Integer.parseInt(args[c++]);
		for (int i = 0; i < m; i++){
			char s = args[c++].charAt(0);
			if (s == 'l')
				System.out.println(f.format(length(vecs[Integer.parseInt(args[c++])])));
			else if (s == 'n'){
				double[] r = normalize(vecs[Integer.parseInt(args[c++])]);
				for (double v : r)
					System.out.print(f.format(v) + " ");
				System.out.println();
			}
			else if (s == 'd'){
				double[] v1 = vecs[Integer.parseInt(args[c++])];
				double[] v2 = vecs[Integer.parseInt(args[c++])];
				System.out.println(f.format(product(v1, v2)));
			}
		}
	}
}