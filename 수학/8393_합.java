import java.util.*;

public class Main {
	public static void main(String[] args) {
		int sum = 0, n = 0;
		Scanner scanner = new Scanner(System.in);
		n = scanner.nextInt();
		
		for(int i = 1; i <= n; i++)
			sum += i;
		System.out.println(sum);
	}
}
