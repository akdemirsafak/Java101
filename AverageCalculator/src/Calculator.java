import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int mat,fizik,kimya,turkce,tarih,muzik;

        mat=takeValue("Matematik");
        fizik=takeValue("Fizik");
        kimya=takeValue("Kimya");
        turkce=takeValue("Türkçe");
        tarih=takeValue("Tarih");
        muzik=takeValue("Müzik");
        float avg=average(mat,fizik,kimya,turkce,tarih,muzik);

        String result=avg>60?"Sınıfı Geçti":"Sınıfta Kaldı";
        System.out.println(result);
    }

    public static int takeValue(String lessonName)
    {
        Scanner input=new Scanner(System.in);
        System.out.print(lessonName+" notunu giriniz : ");
        return input.nextInt();
    }
    public static float average(int mat,int fizik,int kimya,int turkce,int tarih,int muzik)
    {
        float avg=0;
        avg+=(float)(mat+fizik+kimya+turkce+tarih+muzik)/6;
        return avg;
    }

}
