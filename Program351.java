// Accept string from user and display the individual characters  (Option 1)

import java.util.*;

class Program351
{
    public static void main(String Arg[])
    {
        Scanner sobj= new Scanner(System.in);

        System.out.println("enter your name:");
        String name= sobj.nextLine();

        System.out.println("Name is: "+ name);  // display accepted string

        System.out.println("Length of string is: "+ name.length());  // Length method

        for(int iCnt= 0; iCnt < name.length(); iCnt++)
        {
            System.out.println(name.charAt(iCnt));    // charAt method() used to display the individual characters
        }
    }
} 