import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Değişkenler Oluşturulur
        double kilo,boy;

        //Kullanıcıdan Girdi Alınır
        Scanner girdi= new Scanner(System.in);

        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz : ");
        boy=girdi.nextDouble();

        System.out.print("Lütfen kilonuzu giriniz : ");
        kilo=girdi.nextDouble();

        // Formülü Gir
        double kitleEndeksi=kilo/(boy*boy);
        //Sonuç Yazdırılır
        System.out.println(kitleEndeksi) ;

        String sismanMisin=(kitleEndeksi>30) ? "Şismansın Gardaş":"İyisin Gardaş";
        System.out.println(sismanMisin);

    }
}
