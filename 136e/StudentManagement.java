import java.text.DecimalFormat;

public class StudentManagement {
	public static void main(String args[]){
		int c = 0;
		int n = Integer.parseInt(args[c++]);
		int m = Integer.parseInt(args[c++]);
		String[] names = new String[n];
		float[] grades = new float[n];
		float totalGrades = 0;
	
		for (int i = 0; i < n; i++){
			names[i] = args[c++];
			for (int j = 0; j < m; j++)
				grades[i] += Float.parseFloat(args[c++]);
			grades[i] /= m;
			totalGrades += grades[i];
		}
		
		DecimalFormat df = new DecimalFormat("0.00");
		System.out.println(df.format(totalGrades / n));
		for (int i = 0; i < n; i++)
			System.out.println(names[i] + " " + df.format(grades[i]));
	}
}
