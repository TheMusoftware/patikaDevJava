import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double average=0;
        System.out.print("Grade of Turkish Language: ");
        average+=scan.nextInt();
        System.out.print("Grade of Math : ");
        average+=scan.nextInt();
        System.out.print("Grade of Physics: ");
        average+=scan.nextInt();
        System.out.print("Grade of Chemistry: ");
        average+=scan.nextInt();
        System.out.print("Grade of History: ");
        average+=scan.nextInt();
        System.out.print("Grade of Music: ");
        average+=scan.nextInt();
        String result=(average/5)>60 ? "You have completed this term successfully." :"You have failed this term.";
        System.out.println("Average: "+(average/5)+"\n"+result);



    }
}