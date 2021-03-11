import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int H = scanner.nextInt();
		int M = scanner.nextInt();
    
		if(M >= 45) {
			M -= 45;
			System.out.printf("%d %d", H, M);
		} else {
			M += 15;
			if(H == 0) {
				H = 23;
				System.out.printf("%d %d", H, M);
			} else {
				H--;
				System.out.printf("%d %d", H, M);
			}
		}
	}
}
