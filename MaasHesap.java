package maasHesap.java;

import java.util.Scanner;

public class MaasHesap {
	

	
	    public static void main(String[] args) {
/*
		* Ad Soyad: Asım Gökalp
		* Ogrenci No: 255541002
		* Tarih: 06.11.2025
		* Aciklama: Öğrenci Bilgi Sistemi
		*/
	        Scanner input = new Scanner(System.in);

	        // Çalışan bilgileri
	        System.out.print("Calisan adini giriniz: ");
	        String ad = input.next();

	        System.out.print("Calisan soyadini giriniz: ");
	        String soyad = input.next();

	        System.out.print("Aylik brut maasi giriniz (TL): ");
	        double brutMaas = input.nextDouble();

	        System.out.print("Haftalik calisma saati: ");
	        int haftalikSaat = input.nextInt(); // İstatistik için istenmiş, hesapta direkt kullanılmıyor

	        System.out.print("Mesai saati sayisi: ");
	        int mesaiSaat = input.nextInt();

	        // Gelirler
	        double mesaiUcreti = (brutMaas / 160.0) * mesaiSaat * 1.5;
	        double toplamGelir = brutMaas + mesaiUcreti;

	        // Kesintiler
	        double sgk = toplamGelir * 0.14;
	        double gelirVergisi = toplamGelir * 0.15;
	        double damgaVergisi = toplamGelir * 0.00759;

	        double toplamKesinti = sgk + gelirVergisi + damgaVergisi;

	        // Net maaş
	        double netMaas = toplamGelir - toplamKesinti;

	        // İstatistikler
	        double kesintiOrani = (toplamKesinti / toplamGelir) * 100.0;
	        double saatlikNetKazanc = netMaas / 176.0; // 22*8
	        double gunlukNetKazanc = netMaas / 22.0;

	        // Çıktı
	        System.out.println("====================================");
	        System.out.println("MAAS BORDROSU");
	        System.out.println("====================================");
	        System.out.printf("Calisan: %s %s%n", ad, soyad);

	        System.out.println("GELIRLER:");
	        System.out.printf("%-28s: %10.2f TL%n", "Brut Maas", brutMaas);
	        System.out.printf("Mesai Ucreti (%d saat) : %10.2f TL%n", mesaiSaat, mesaiUcreti);
	        System.out.println("------------------------");
	        System.out.printf("%-28s: %10.2f TL%n", "TOPLAM GELIR", toplamGelir);

	        System.out.println("KESINTILER:");
	        System.out.printf("SGK Kesintisi (14.0%%)  : %10.2f TL%n", sgk);
	        System.out.printf("Gelir Vergisi (15.0%%)  : %10.2f TL%n", gelirVergisi);
	        System.out.printf("Damga Vergisi (0.8%%)   : %10.2f TL%n", damgaVergisi);
	        System.out.println("------------------------");
	        System.out.printf("%-28s: %10.2f TL%n", "TOPLAM KESINTI", toplamKesinti);

	        System.out.printf("%-28s: %10.2f TL%n", "NET MAAS", netMaas);

	        System.out.println();
	        System.out.printf("Kesinti Orani           : %6.2f%%%n", kesintiOrani);
	        System.out.printf("Saatlik Net Kazanc      : %6.2f TL/saat%n", saatlikNetKazanc);
	        System.out.printf("Gunluk Net Kazanc       : %6.2f TL/gun%n", gunlukNetKazanc);

	        input.close();
	    }
	}



