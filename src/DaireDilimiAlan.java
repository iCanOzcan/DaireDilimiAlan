import java.util.Scanner;

public class DaireDilimiAlan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double pi = 3.14, r, alfa, area;
        System.out.print("yaricapi giriniz:");
        r = input.nextDouble();
        System.out.print("dereceyi giriniz:");
        alfa = input.nextDouble();
        area = (pi * (r * r) * alfa) / 360;
        System.out.println("Daire diliminin alani :" + area);
    }
}
