import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int max = 0, min = 0;
		int[] num = new int[N];
		
		for(int i = 0; i < N; i++) {
			num[i] = scanner.nextInt();
		}
		
		max = num[0];
		min = num[0];
		
		for(int j = 1; j < N; j++) {
			if(num[j] > max)
				max = num[j];
			else if(num[j] < min)
				min = num[j];
		}
		
		System.out.printf("%d %d", min, max);
	}
}