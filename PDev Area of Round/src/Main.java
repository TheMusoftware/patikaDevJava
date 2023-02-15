import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Radius of the round: ");
        double radius = scan.nextDouble();
        System.out.print("Angle: ");
        double angle = scan.nextDouble();
        System.out.println("Area of this round "+Math.PI*Math.pow(radius,2)*angle/360);
    }
}