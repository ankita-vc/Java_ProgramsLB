// Accept string from user and reverse the data in place

import java.util.*;

class StringX
{
    public String ReverseString(String str)
    {
        char Arr[]= str.toCharArray();

        int iStart= 0;
        int iEnd= Arr.length-1; // for index because indexing starts from 0

        char cTemp= ' '; // empty charcter

        while(iStart < iEnd)   // Logic of swapping
        {
            cTemp= Arr[iStart];
            Arr[iStart]= Arr[iEnd];
            Arr[iEnd]= cTemp;

            iStart++;
            iEnd--;
        }
        return new String(Arr);
    }
}

class Program363
{
    public static void main(String Arg[])
    {
        Scanner sobj= new Scanner(System.in);

        System.out.println("enter your name:");
        String name= sobj.nextLine();

        StringX obj= new StringX();

        String sRet= obj.ReverseString(name);
        System.out.println("Updated string is: "+ sRet);
    }
} 