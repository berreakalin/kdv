import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner inp=new Scanner(System.in);

        int mat,fiz,kim,tur,tar,muz, top;
        System.out.print("Matematik: " );
        mat=inp.nextInt();

        System.out.print("Fizik: " );
        fiz=inp.nextInt();

        System.out.print("Kimya: " );
        kim=inp.nextInt();

        System.out.print("Türkçe: " );
        tur=inp.nextInt();

        System.out.print("Tarih: " );
        tar=inp.nextInt();

        System.out.print("Müzik: " );
        muz=inp.nextInt();

        top=(mat+fiz+kim+tur+tar+muz)/6;
        System.out.println("Ortalama: " + top);

        String durum= top<60 ? "Kaldı" : "Geçti";

        System.out.println("Geçme Durumunuz:"+durum);


    }
}