import java.util.Scanner;

public class ManavApp {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Şen kardeşler manavına hoş geldiniz...");
		String[] fruits = { "Karpuz", "Kavun", "Kiraz", "Şeftali", "Kayısı" };
		double[] price = { 12.99, 14.99, 25.99, 20.15, 40.99 };
		double[] buying = new double[fruits.length];
		for (int i = 0; i < buying.length; i++) {
			System.out.println(fruits[i] + " meyvesinin fiyatı: " + price[i] 
					+ "\nNe kadar almak istiyorsun?");
			buying[i] = in.nextDouble();
		}
		System.out.println("Hesaplama adımına geçiyorum");
		double totalPrice=0;
		for (int i = 0; i < buying.length; i++) {
			if(buying[i]>0) {
				System.out.println(fruits[i] + " meyvesinin fiyatı: " + price[i] 
						+ "\nAlınan miktar: "+buying[i]+" KG\nÖdemeniz gerekn miktar: "
						+(buying[i]*price[i])+" TL");
				totalPrice+=buying[i]*price[i];
			}
		}
		System.out.println("Toplam ödemeniz gerekn miktar: "+totalPrice+" TL");
	}

}
