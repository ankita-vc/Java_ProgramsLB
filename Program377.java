// Accept string from user and reverse the string with inbuilt function

import java.util.*;

class Program377
{
    public static void main(String Arg[])
    {
        Scanner sobj= new Scanner(System.in);

        System.out.println("enter string:");
        String str= sobj.nextLine();  // Inbuilt function

        StringBuffer sbobj= new StringBuffer(str);   // conversion of string to StringBuffer

        sbobj= sbobj.reverse();

        System.out.println(sbobj);
    }
}

// google: Reverse string in java 

// String class do not have reverse method
// String class is immutable so it cannot change the data, so we have to convert string into string buffer