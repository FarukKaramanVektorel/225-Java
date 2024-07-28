import java.util.Scanner;

public class Ucgen {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Bir sayı giriniz");
		int max = scn.nextInt();
		// dik üçgen
		System.err.println("--------dik üçgen-------");
		for (int i = 1; i <= max; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.err.println("--------ters dik üçgen-------");
		// ters dik üçgen
		for (int i = max; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		// eş kenar üçgen
		System.err.println("--------eş kenar üçgen-------");
		for (int i = 1; i <= max; i++) {// 5
			for (int k = max - i; k >= 0; k--) {// 0
				System.out.print(" ");
			}
			for (int j = 0; j < i; j++) {// 5
				System.out.print("* ");
			}
			System.out.println();
		}

		// ters eş kenar üçgen
		System.err.println("--------ters eş kenar üçgen-------");
		for (int i = max; i >= 1; i--) {
			for (int k = max - i; k >= 0; k--) {// 3
				System.out.print(" ");
			}
			for (int j = 0; j < i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
