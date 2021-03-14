import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int M = 0;
		int N = scanner.nextInt();
		int[] score1 = new int[N];
		
		double sum = 0;
		double[] score2 = new double[N];
		
		for(int i = 0; i < score1.length; i++) {
			score1[i] = scanner.nextInt();
			if(score1[i] > M)
				M = score1[i];
		}
		
		for(int i = 0; i < score1.length; i++) {
			score2[i] = score1[i] / (double)M*100;
			sum += score2[i];
		}
		
		System.out.println(sum/N);
	}
}