import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter upper bound: ");
        int upperBound=scan.nextInt();
        int placeHolder=2;
        while(placeHolder!=upperBound){
            int counter = 0;
            for (int i = 2; i <placeHolder ; i++) {
                if(placeHolder%i==0)counter++;
            }
            if(counter==0) System.out.print(placeHolder+" ");
            placeHolder++;
        }

    }
}