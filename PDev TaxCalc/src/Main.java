import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter total amount: ");
        float amount = scan.nextFloat();
        float taxRatio=amount<1000 ? 0.18f : 0.08f;
        System.out.println("Price after tax: "+(amount+(amount*taxRatio)));
        System.out.println("Tax ratio "+taxRatio*100+"%");
        System.out.println("Received tax: "+(amount*taxRatio));
    }
}