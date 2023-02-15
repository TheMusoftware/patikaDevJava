import java.util.Locale;
import java.util.Scanner;

/**
 * @author MuSoftware
 * @apiNote Barış Manço - Unutamadım 2/15/23
 */
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("The month you were born: ");
        String month = scan.nextLine();
        System.out.printf("Which day of %s's it:  ",month);
        int day = scan.nextInt();
        String sign;
        switch (month.toLowerCase().trim()){
            case "march":
                if(day>=21) sign ="Aries\t(Ram)";
                else sign = "Pisces\t(Fish)";
                break;
            case "april":
                if(day<=20) sign = "Aries\t(Ram)";
                else sign = "Taurus\t(Bull)";
                break;
            case "may":
                if(20<=day) sign = "Taurus\t(Bull)";
                else sign = "Gemini\t(Twins)";
                break;
            case "june":
                if(21>=day) sign = "Gemini\t(Twins)";
                else sign = sign = "Cancer\t(Crab)";
                break;
            case "july":
                if(22>=day) sign = "Cancer\t(Crab)";
                else sign = " Leo\t(Lion)";
                break;
            case "august":
                if(23>=day) sign =" Leo\t(Lion)";
                else  sign = "Virgo\t(Virgin)";
                break;
            case "september" :
                if(22>=day) sign = "Virgo\t(Virgin)";
                else sign = "Libra\t(Balance)";
                break;
            case "october" :
                if(24>=day) sign = "Libra\t(Balance)";
                else sign = "Scorpius\t(Scorpion)";
                break;
            case "november" :
                if(21>=day) sign ="Scorpius\t(Scorpion)";
                else sign = "Sagittarius\t(Archer)";
                break;
            case "december" :
                if(21>=day) sign = "Sagittarius\t(Archer)";
                else sign = "Capricornus\t(Goat)";
                break;
            case "january" :
                if(19>=day) sign ="Capricornus\t(Goat)";
                else sign = "Aquarius\t(Water Bearer)";
                break;
            case "february" :
                if(18>=day) sign = "Aquarius\t(Water Bearer)";
                else sign = "Pisces\t(Fish)";
            default:
                sign = "undefined";
                break;
        }
        System.out.printf("Your zodiac sign is : %s ",sign);
    }
}