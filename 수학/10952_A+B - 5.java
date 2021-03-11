import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int A = 0, B = 0;
		
		for(;;) {
			A = scanner.nextInt();
			B = scanner.nextInt();
			
			if(A == 0 && B == 0)
				break;
			
			System.out.println(A+B);
		}
	}
}
