import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int T = scanner.nextInt();
		
		for(int i = 1; i <= T; i++) {
			int A = scanner.nextInt();
			int B = scanner.nextInt();
			System.out.printf("Case #%d: %d + %d = %d%n", i, A, B, A+B);
		}
	}
}