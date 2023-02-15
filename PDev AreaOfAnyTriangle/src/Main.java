import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter first side length: ");
        float fSide=scan.nextFloat();
        System.out.print("Enter second side length: ");
        float sSide=scan.nextFloat();
        System.out.print("Enter third side length: ");
        float tSide= scan.nextFloat();
        boolean isAbleATriangle = fSide<(sSide+tSide)&&fSide>(Math.abs(sSide-tSide))? sSide<(fSide+tSide) && sSide>(Math.abs(fSide-tSide)) ?
                tSide<(fSide+sSide)&& tSide>(Math.abs(fSide-sSide)) :false : false;
        float u=(fSide+sSide+tSide)/2;
        double area = Math.sqrt(u*(u-fSide)*(u-sSide)*(u-tSide));
        System.out.println(isAbleATriangle? "Area of the triangle: "+area : "This is not able to be a triangle." );
    }

}