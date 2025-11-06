package ogrenciBilgisistemi;

import java.util.Scanner;

public class ogrencibilgi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		* Ad Soyad: Asım Gökalp
		* Ogrenci No: 255541002
		* Tarih: 06.11.2025
		* Aciklama: Öğrenci Bilgi Sistemi
		*/
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Adınızı giriniz: ");
		
	    String Ad = input.nextLine();
		
		System.out.println("soyadınızı girniz: ");
		
		String soyad = input.nextLine();
		
		System.out.println("Öğrenci numaranız: ");
		int numara = input.nextInt();
		
	
	    System.out.println("yaşınızı giriniz: ");
	    int yas = input.nextInt();
	    
	    System.out.println("Gpa giriniz: ");
	    double GPA = input.nextDouble();
		System.out.println(" Ogrenci Bilgi Sistemi ");
        System.out.printf(" Ad Soyad: %s%n ", Ad + soyad);
		System.out.printf(" Ogrenci No: %d%n ", numara);
		System.out.printf(" Yas: %d%n ", yas);
		System.out.printf(" GPA: %.2f%n ", GPA);
		
		String sonuc = GPA >= 3.00 ? "Başarılı" : "Başarısız";
		System.out.printf("Durum: %s%n", sonuc);

	}
	
	
	

}

