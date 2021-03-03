import java.util.Scanner;

// 정수 5개를 입력받아 배열에 저장 후 출력하기
public class basicList {
	public static void main(String[] args) {
		//키보드를 통해 값을 입력해서 출력하기
		Scanner scan=new Scanner(System.in);
		//배열
		int[] su = new int[5];
		
		for(int i=0; i<su.length; i++) {
			System.out.println("숫자 입력");
			su[i]=scan.nextInt();
		}
		//출력
		for(int k: su) {
			System.out.println(k);
		}
	}	
}
