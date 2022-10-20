import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       //Java ile gidilen mesafeye göre (KM) taksimetre ücreti hesaplama amaçlanmıştır.
       /*
       Kurallar;
       1- Km başına ödenecek ücret 2.20 TL
       2- Minimum ödenecek tutar 20 TL'dir. Altında gelen her tutar 20 TL olarak sabitlenip ücretlendirme olacaktır
       3- Taksimetre açılış ücreti 10 TL'dir.
        */
        int km;
        double perKm = 2.20, total, StartPrice = 10;

        Scanner input = new Scanner(System.in);
        System.out.print("Gideceğiniz KM mesafesini giriniz : ");
        km = input.nextInt();

        total = (km * perKm);
        total += StartPrice;

        total = (total<20) ? 20  : total;
        System.out.print("Ödenecek tutar : " + total);


    }
}