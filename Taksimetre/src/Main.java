import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        int km;
        float price=10f;
        System.out.print("Kaç km yol gideceksiniz : ");
        km= scanner.nextInt();
        price=km*2.20f;
        if (price < 20) {
            System.out.print("Ödeyeceğiniz Tutar 20 Tl'dir.");
        }
        else
        {
            System.out.print(price+" Tl ödemeniz gerekiyor.");
        }
    }
}
