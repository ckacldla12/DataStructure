import java.util.Scanner;

// ����Լ� 
public class FactRecursive {
	public static void main(String[] args) {
		int input;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("���� �Է� : ");
		input = scanner.nextInt();
		
		System.out.println(fact(input));
	}
	//���丮��
	public static int fact(int n) {
		if (n <= 1)
			return n;
		else 
			return fact(n-1) * n;
	}
}