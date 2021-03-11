import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		String str = scanner.next();    // nextLine() 메소드가 아닌 next() 메소드 사용
		int sum = 0;
		
		for(int i = 0; i < N; i++) 
			sum += str.charAt(i) - '0';   // charAt(i): 문자열 중에서 i번째 위치에 있는 문자 반환
    
		System.out.println(sum);
	}
}
