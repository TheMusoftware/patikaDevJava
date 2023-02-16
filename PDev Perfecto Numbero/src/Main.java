import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a num that you want check: ");
        int isPerfect = scan.nextInt();
        int total = 0;
        for (int i = 1; i <isPerfect ; i++) {
            if (isPerfect%i==0) total+=i;
        }
        if(total==isPerfect) System.out.printf("%s is a perfect number",isPerfect);
        else System.out.printf("%s is not a perfect number",isPerfect);
    }
}