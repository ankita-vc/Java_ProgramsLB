// Accept number and count number of digits

import java.util.*; 

class Digits
{
    public int CountDigit(int iValue)
    {
        int iCount= 0;

        while(iValue != 0)   // No change in Complexity  <---------
        {
            iCount++;
            iValue= iValue /10;
        }
        return iCount;
    }
}

class Program338
{
    public static void main(String Arg[])
    {
        Scanner sobj= new Scanner(System.in);

        System.out.println("enter first number:");
        int iNo= sobj.nextInt();

        Digits dobj= new Digits();
        int iRet= dobj.CountDigit(iNo);

       System.out.println("Number of Digits are: "+iRet);

        sobj.close();
    }
}




