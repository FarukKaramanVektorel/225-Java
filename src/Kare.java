import java.util.Scanner;

public class Kare {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);		
		System.out.println("Bir sayı giriniz");
		int max=scn.nextInt();
		for (int i = 1; i <= max; i++) {
			for (int j = 1; j <= max; j++) {
				if(i==1||i==max) {
					System.out.print("-");
				}else if(j==1||j==max){
					System.out.print("|");
				}else {
					System.out.print(" ");
				}				
			}
			System.out.println();
		}
	}
}
