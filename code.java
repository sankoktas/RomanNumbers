/** This converts a positive integer into Roman Number system.
* @author (Fikri Şan Köktaş)
* @version (17 December 2020)*/
import java.util.Scanner;
public class KFS_RomanNumbers_Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int input = in.nextInt(); String num = "";
        if (input < 1 || 3999 < input)
        {
            System.out.println( "Not any Roman Number corresponds to this integer" );
        }
        while (input >= 1000) 
        {
            num += "M"; input = input - 1000;        
        }
        while (input >= 900) 
        {
            num += "CM"; input = input - 900;
        }
        while (input >= 500) 
        {
            num += "D"; input = input - 500;
        }
        while (input >= 400) 
        {
            num += "CD"; input = input - 400;
        }
        while (input >= 100) 
        {
            num += "C"; input = input - 100;
        }
        while (input >= 90) 
        {
            num += "XC"; input = input - 90;
        }
        while (input >= 50) {
            num += "L"; input = input - 50;
        }
        while (input >= 40) {
            num += "XL"; input = input - 40;
        }
        while (input >= 10) 
        {
            num += "X"; input = input - 10;
        }
        while (input >= 9) 
        {
            num += "IX"; input = input - 9;
        }
        while (input >= 5) 
        {
            num += "V"; input = input - 5;
        }
        while (input >= 4) 
        {
            num += "IV"; input = input - 4;
        }
        while (input >= 1) 
        {
            num += "I"; input = input - 1;
        }    
        System.out.println(num);
    }
}
