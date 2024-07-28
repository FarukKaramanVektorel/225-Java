import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Bir sayı giriniz");
		int max = scn.nextInt();//5

		for (int i = 1; i <= max; i++) {
			for (int k = max - i; k >= 0; k--) {//3
				System.out.print(" ");
			}
			for (int j = 0; j < i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
