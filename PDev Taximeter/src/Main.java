import java.util.Scanner;

public class Main {
    /**
     * @author Mustafa Kazı
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float cost=10;
        float perKmPrice=2.20f;
        System.out.print("Enter distance of the path: ");
        float distance= scan.nextFloat();
        cost+=perKmPrice*distance;
        System.out.println("Total cost is: "+(cost<20 ? 20 :cost));
    }
}