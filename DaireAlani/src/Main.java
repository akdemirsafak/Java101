import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Dairenin Yarıçapını giriniz.");
        double r= scanner.nextDouble();
        double pi=3.14;
        System.out.println("Dairenin Alanı :"+(pi*r*r)+"\nÇevresi : "+(2*pi*r));

        System.out.print("Dairenin merkez ölçüsünü giriniz : ");
        double a= scanner.nextDouble();
        double result=(pi*(r*r)*a)/360;
        System.out.println("Daire Diliminin alanı : "+result);
    }
}
