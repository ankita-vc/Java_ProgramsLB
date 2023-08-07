/* 
Accept string from user and display the individual characters  (Option 2)
  1. Convert string into character array
  2. Apply charAt() to count the individual charcters
*/

import java.util.*;

class Program352
{
    public static void main(String Arg[])
    {
        Scanner sobj= new Scanner(System.in);

        System.out.println("enter your name:");
        String name= sobj.nextLine();

        System.out.println("Name is: "+ name);

        System.out.println("Length of string is: "+ name.length());  // This is lenght menthod

        // String convert into character array
        char str[]= name.toCharArray();

        for(int iCnt= 0; iCnt < name.length(); iCnt++)
        {
            System.out.println(name.charAt(iCnt));    // charAt method() to count the individual characters
        }

        sobj.close();
    }
} 