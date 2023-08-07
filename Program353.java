// Accept string from user and count the small characters  (Option 3)

import java.util.*;

class StringX
{
    public int CountSmall(String str)
    {
        char Arr[]= str.toCharArray();  
        int iCount= 0;
        
        for(int iCnt= 0; iCnt < Arr.length; iCnt++)
        {
            if((Arr[iCnt] >= 'a') && (Arr[iCnt] <= 'z'))
            {
                iCount++;
            }
        }
        return iCount;
    }
}

class Program353
{
    public static void main(String Arg[])
    {
        Scanner sobj= new Scanner(System.in);

        System.out.println("enter your name:");
        String name= sobj.nextLine();

        StringX obj= new StringX();
        int iRet= obj.CountSmall(name);
        System.out.println("number of small characters are: "+iRet);
    }
} 