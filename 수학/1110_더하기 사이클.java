import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int copy = N, count = 0;
		
		while(true) {
			N = (N%10)*10 + ((N/10 + N%10) % 10);
			count++;
			
			if(copy == N)
				break;
		}
		System.out.println(count);
	}
}
