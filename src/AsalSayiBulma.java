import java.util.Scanner;

public class AsalSayiBulma {
    static int asalsayi(int sayi) {
        if (sayi < 2) {
            System.out.println("Asal degildir");
        } else {
            for (int i = 2; i <= sayi; i++) {
                if (sayi == 2 || sayi % i != 0) {
                    System.out.println("Asal sayidir");
                    break;
                } else {
                    System.out.println("Asal degildir");
                    break;
                }
            }
        }
        return 1;
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Sayi giriniz : ");
        int sayi = input.nextInt();
        asalsayi(sayi);
    }
}
