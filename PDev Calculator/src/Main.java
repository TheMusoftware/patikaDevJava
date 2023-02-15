import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Select your operation\n1-Addition \n2-Subtraction \n3-Multiply \n4-Division \nSelection: ");
        int selection = scan.nextInt();
        double firstValue,secondValue;
        switch (selection){
            case 1:
                //Add
                System.out.print("First value: ");
                firstValue=scan.nextDouble();
                System.out.print("Second value: ");
                secondValue=scan.nextDouble();
                System.out.println("Result of the addition "+(firstValue+secondValue));
                break;
            case 2:
                //Subtraction
                System.out.print("First value: ");
                firstValue=scan.nextDouble();
                System.out.print("Second value: ");
                secondValue=scan.nextDouble();
                System.out.println("Result of the subtraction (difference) "+Math.abs(firstValue-secondValue));
                break;
            case 3:
                //Multiply
                System.out.print("First value: ");
                firstValue=scan.nextDouble();
                System.out.print("Second value: ");
                secondValue=scan.nextDouble();
                System.out.println("Result of the multiply "+(firstValue*secondValue));
                break;

            case 4:
                //Division
                System.out.print("First value: ");
                firstValue=scan.nextDouble();
                System.out.print("Second value: ");
                secondValue=scan.nextDouble();
                System.out.println("Result of the addition "+(firstValue/secondValue));
                break;
            default:
                System.out.println("There is no operation that you have selected");
                break;
        }



    }
}