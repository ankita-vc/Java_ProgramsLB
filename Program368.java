// Logic of removing whitespaces

import java.util.*;

class Program368
{
    public static void main(String Arg[])
    {
        Scanner sobj= new Scanner(System.in);

        System.out.println("enter string:");

        String str= sobj.nextLine();  // Inbuilt function

        str= str.replaceAll("\\s+", "");

        System.out.println("updated string is: "+str);
    }
}
