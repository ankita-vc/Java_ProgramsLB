// Accept string from user and return the largest word with length

import java.util.*;

class Program376
{
    public static void main(String Arg[])
    {
        Scanner sobj= new Scanner(System.in);

        System.out.println("enter string:");
        String str= sobj.nextLine();  // Inbuilt function

        str= str.trim(); 
        str= str.replaceAll("\\s+", " "); 

        String arr[]= str.split(" ");  // string ch array

        int iPos= 0;
        int iMax= 0;
        for(int iCnt= 0; iCnt < arr.length; iCnt++)
        {
            if(arr[iCnt].length() > iMax)
            {
                iMax= arr[iCnt].length();
                iPos= iCnt;
            }
        }
        System.out.println("Largest word is "+arr[iPos]+ " with length: "+iMax);
    }
}
