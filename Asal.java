package Donguler;

public class Asal {
    public static void main(String[] args) {
        int i, sayi;
        System.out.print("Asal Sayılar : ");

        for (i = 2; i <= 100; i++) {
            int toplam = 0;
            for (sayi = 2; sayi <= i; sayi++) {
                if (i % sayi == 0) {
                    toplam++;
                }
            }
            if (toplam == 2) {
                System.out.print(i + ",");
            }
        }
    }
}
