// Accept string from user and change its voice  ***

import java.util.*;

class Program380
{
    public static void main(String Arg[])
    {
        Scanner sobj= new Scanner(System.in);

        System.out.println("enter string:");
        String str= sobj.nextLine();  // Inbuilt function
 
        str= str.replaceAll("\\s+", " "); 
        str= str.trim();

        String arr[]= str.split(" ");

        StringBuffer output= new StringBuffer();  // empty string buffer

        for(int iCnt= arr.length-1; iCnt >= 0; iCnt--)
        {
            System.out.println(arr[iCnt]);
        }
    }
}

