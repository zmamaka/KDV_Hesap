import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);

        float KDV, KDVTutar;

        System.out.print("Fiyatı giriniz => ");
        int x = scr.nextInt();

        KDV = (x > 1000) ? 0.08f : 0.18f;

        KDVTutar = x * KDV;

        System.out.println("KDV siz fiyat = " + x);
        System.out.println("KDV'li fiyat = " + (x + KDVTutar));
        System.out.println("KDV tutarı = " + KDVTutar);

    }
}
