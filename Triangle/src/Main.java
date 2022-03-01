import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        int a,b;
        a=takeValues();
        b=takeValues();
        double c=Math.sqrt((a*a)+(b*b));
        System.out.println("Hipotenus: "+c);
        double u=(a+b+c)/2;
        System.out.println("Çevresi : " + 2*u);
        double alanKare=u*(u-a)*(u-b)*(u-c);


        System.out.print("Alan : "+Math.sqrt(alanKare));



    }

    public static int takeValues()
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Kenar uzunluğunu girin : ");

        return input.nextInt();
    }

}

