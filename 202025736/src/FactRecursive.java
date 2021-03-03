import java.util.Scanner;

// 재귀함수 
public class FactRecursive {
	public static void main(String[] args) {
		int input;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("정수 입력 : ");
		input = scanner.nextInt();
		
		System.out.println(fact(input));
	}
	//팩토리얼값
	public static int fact(int n) {
		if (n <= 1)
			return n;
		else 
			return fact(n-1) * n;
	}
}