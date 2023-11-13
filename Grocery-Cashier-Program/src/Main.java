import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Armut Kaç Kg: ");
        double Armut = input.nextDouble();

        System.out.printf("Elma Kaç Kg: ");
        double Elma = input.nextDouble();

        System.out.printf("Domates Kaç Kg: ");
        double Domates = input.nextDouble();

        System.out.printf("Muz Kaç Kg: ");
        double Muz = input.nextDouble();

        System.out.printf("Patlıcan Kaç Kg: ");
        double Patlıcan = input.nextDouble();


        double A = 2.14;
        double E = 3.67;
        double D = 1.11;
        double M = 0.95;
        double P = 5.00;

        double Total = (Armut*A)+(Elma*E)+(Domates*D)+(Muz*M)+(Patlıcan*P);
        System.out.printf("Toplam Tutar:"+Total);


    }
}