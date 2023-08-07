// Accept string from user and display the string without whitespaces

import java.util.*;

class StringX
{
    public String RemoveWhiteSpace(String str)
    {
        char Arr[]= str.toCharArray();

        char Brr[]= new char[Arr.length];  // dynamic object creation which is same as Arr wrt size

        int i= 0;
        for(int iCnt= 0; iCnt < Arr.length; iCnt++)
        {
            if(Arr[iCnt] != ' ')
            {
                Brr[i]= Arr[iCnt];
                i++;
            }
        }

        return new String(Brr);
    }
}

class Program360
{
    public static void main(String Arg[])
    {
        Scanner sobj= new Scanner(System.in);

        System.out.println("enter your name:");
        String name= sobj.nextLine();

        StringX obj= new StringX();

        String sRet= obj.RemoveWhiteSpace(name);
        System.out.println("Updated string is: "+ sRet);
    }
} 