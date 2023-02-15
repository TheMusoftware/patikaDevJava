import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double average=0;
        double placeHolder=0;
        System.out.print("Grade of Turkish Language: ");
        placeHolder=scan.nextInt();
        if(placeHolder>55)average+=placeHolder;
        placeHolder=0;
        System.out.print("Grade of Math : ");
        placeHolder=scan.nextInt();
        if(placeHolder>55)average+=placeHolder;
        placeHolder=0;
        System.out.print("Grade of Physics: ");
        placeHolder = scan.nextInt();
        if(placeHolder>55)average+=placeHolder;
        placeHolder=0;
        System.out.print("Grade of Chemistry: ");
        placeHolder=scan.nextInt();
        if(placeHolder>55)average+=placeHolder;
        placeHolder=0;
        System.out.print("Grade of Music: ");
        placeHolder=scan.nextInt();
        if(placeHolder>55)average+=placeHolder;
        placeHolder=0;
        String result=(average/5)>60 ? "You have completed this term successfully." :"You have failed this term.";
        System.out.println("Average: "+(average/5)+"\n"+result);



    }
}