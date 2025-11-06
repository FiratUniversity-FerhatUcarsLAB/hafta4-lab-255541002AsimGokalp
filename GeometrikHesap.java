package geometrikHesap.java;

import java.util.Scanner;

public class GeometrikHesap {
    public static void main(String[] args) {
/*
		* Ad Soyad: Asım Gökalp
		* Ogrenci No: 255541002
		* Tarih: 28.10.2025
		* Aciklama: Öğrenci Bilgi Sistemi
		*/
        Scanner input = new Scanner(System.in);
        final double PI = 3.14159;

        System.out.println("=== GEOMETRIK HESAPLAYICI ===");
        System.out.print("Dairenin yaricapini girin (cm): ");

        double r = input.nextDouble();

        double daireAlani = PI * r * r;
        double daireCevresi = 2 * PI * r;
        double daireCap = 2 * r;
        double kureHacmi = (4.0 / 3.0) * PI * r * r * r;
        double kureYuzeyAlani = 4 * PI * r * r;

        System.out.println("SONUCLAR:");
        System.out.println("----------");
        System.out.printf("%-18s: %8.2f cm^2%n", "Daire Alani", daireAlani);
        System.out.printf("%-18s: %8.2f cm%n", "Daire Cevresi", daireCevresi);
        System.out.printf("%-18s: %8.2f cm%n", "Daire Capi", daireCap);
        System.out.printf("%-18s: %8.2f cm^3%n", "Kure Hacmi", kureHacmi);
        System.out.printf("%-18s: %8.2f cm^2%n", "Kure Yuzey Alani", kureYuzeyAlani);

        input.close();
    }
}

