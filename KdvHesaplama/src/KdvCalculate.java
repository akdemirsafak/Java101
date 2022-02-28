import java.util.Scanner;

public class KdvCalculate {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("Kdv'siz Tutarı giriniz : ");
        float price=input.nextFloat();

        if (price>1000)
        {
            price*=1.08;

        }
        else
        {

           price*=1.18;
        }

        System.out.println(price);

    }
}
