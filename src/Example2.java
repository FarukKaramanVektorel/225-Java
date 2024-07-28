import java.util.Scanner;

public class Example2 {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String[] students=new String[4];
//		students[0]="Aliye";
//		students[1]="Ali";
//		students[2]="Alican";
//		students[3]="Fatma";
		
		//kullanıcıdan alınan veriler ile isimleri doldurunuz.
		for (int i = 0; i < students.length; i++) {
			System.out.println("Dizinin "+(i+1)+". elamanını giriniz.");
			students[i]=in.next();
			
		}
		for (int i = 0; i < students.length; i++) {
			System.out.println("Dizinin "+(i+1)+". elamanı: "+students[i]);
		}

	}

}
