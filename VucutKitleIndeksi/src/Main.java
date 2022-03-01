import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.print("Lütfen boyunuzu metre cinsinden giriniz : ");
        double boy= scan.nextDouble();

        System.out.print("Lütfen kilonuzu giriniz : ");
        double kg= scan.nextDouble();
        double vucutKitleİndeksi=kg/(boy*boy);
        System.out.print("Vücut kitle İndexisiniz : "+vucutKitleİndeksi);

    }
}
