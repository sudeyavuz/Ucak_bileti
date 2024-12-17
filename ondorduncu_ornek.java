package JAVA101;
import java.util.Scanner;
public class ondorduncu_ornek {
    public static void main(String[] args) {
        int km, yas, sayi;
        double tutar, yastutar, yasindirim=0 ,indtutar ;
        Scanner input = new Scanner(System.in);

        System.out.println("Mesafey km türünden giriniz: ");
        km = input.nextInt();

        if (km < 0) {
            System.out.println("pozitif değer giriniz");
        }
        tutar = km * 0.10;
        System.out.println("Yaşınızı giriniz: ");
        yas = input.nextInt();
        if (yas < 0) {
            System.out.println("pozitif sayı giriniz");
        }
        System.out.println("yolculuk tipini giriniz: ");
        System.out.println("1-tek yön\n2-gidiş dönüş");
        sayi = input.nextInt();
        if (sayi!=1 && sayi!=2){
            System.out.println("geçerli bir sayı giriniz");
        }
        if (yas < 12) {
            yasindirim=0.5;
        } else if (yas < 24 && yas >= 12) {
            yasindirim=0.1;
        } else if (yas > 65) {
            yasindirim=0.3;
        }
        yastutar= tutar*yasindirim;
        indtutar = tutar- yastutar;
        if( sayi==2){
            indtutar*=0.8;
        }
        System.out.println("sonuç: "+indtutar);






    }
}
