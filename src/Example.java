import java.util.Scanner;

public class Example {

	public static void main(String[] args) {
		// 1 den klavyeden girilen rakama kadar olan sayılardan
		// kullanıcının girdiği rakama  tam bölünenlerin karesi
		// ve kare kökükünü  hesaplayan program yazınız.
		// kullanıcı çıkmak isteyene kadar program devam etsin
		Scanner scn=new Scanner(System.in);
		System.out.println("Hesaplama aracına hoş geldiniz...");
		while(true) {
			System.out.println("Yapmak İstediğini İşlemi Seçiniz!!!\n1- Hesaplama\n0- Çıkış ");
			int islem=scn.nextInt();
			if(islem==1) {
				while (true) {
					int maxDeger=0,bolen=0;
					System.out.println("Maximum değeri giriniz...");
					maxDeger=scn.nextInt();
					System.out.println("Bölen sayıyı giriniz...");
					bolen=scn.nextInt();
					if(bolen<maxDeger) {
						for (int i = 1; i <=maxDeger; i++) {
							if(i%bolen==0) {
								System.out.println("Sayı: "+i+" Karesi: "
							+Math.pow(i, 2)+" Kakekökü:"+Math.sqrt(i));
							}							
						}
						System.out.println();
						break;
					}else {
						System.err.println("Bölen sayı Max sayıdan büyük olamaz!!!");
						continue;
					}
				}			
				
			}else {
				break;
			}
		}		
		System.out.println("Hesaplama aracından çıkış yapılıyor...");
		scn.close();
		

	}

}
