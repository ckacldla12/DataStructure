import java.util.Scanner;

// ���� 5���� �Է¹޾� �迭�� ���� �� ����ϱ�
public class basicList {
	public static void main(String[] args) {
		//Ű���带 ���� ���� �Է��ؼ� ����ϱ�
		Scanner scan=new Scanner(System.in);
		//�迭
		int[] su = new int[5];
		
		for(int i=0; i<su.length; i++) {
			System.out.println("���� �Է�");
			su[i]=scan.nextInt();
		}
		//���
		for(int k: su) {
			System.out.println(k);
		}
	}	
}
