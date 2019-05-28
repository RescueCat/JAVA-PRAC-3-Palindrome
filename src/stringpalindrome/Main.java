/******************************************************************************
Palindrome by Jonathan Houston (05.28.2019)
Purpose:
    This program 's intent is decipher whether the string entered by the user is
    a palindrome. The program will execute until the user enters '0' (zero).
Command Parameters:
    None
Results:
    Print to standard out whether the string is a palindrome. 
Returns:
    none
Notes:
    none
    **************************************************************************/
package stringpalindrome;

import java.util.Scanner;

public class Main {
    
    /************************ main **************************************
    public static void main(String[] args)
    Purpose:
            To retrieve input from user and help guide user through the program.
    Parameters:
            @param args: not used
    Notes:
            This does not have any return values
    Return Values:
            none
    **********************************************************************/
    public static void main(String[] args) {
        //Initalize variables
        Scanner scan = new Scanner(System.in);
        String pal = "";
        String backwards = "";
        
        System.out.println("This program will check to see if your string is a "
                + "palindrome, please specifiy your string. Enter 0 to exit.");
        
        //Ask user for strings until 0 is entered 
        while(! pal.equals("0"))
        {
            backwards = "";
            pal = scan.nextLine();
            for(int i = pal.length()-1; i >= 0 ; i--)
            {
                backwards += pal.charAt(i);
            }
            if(pal.equalsIgnoreCase(backwards))
                System.out.println(pal + " is a palindrome!");
            else
                System.out.println(pal + " is not a palindrome!");
        }        
    }
    
}
