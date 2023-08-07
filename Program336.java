// Accept number and count the number of digits.

import java.util.*; 

class Digits
{
    public int CountDigit(int iValue)
    {
        int iDigit= 0;
        int iCount= 0;

        while(iValue != 0)
        {
            iDigit= iValue % 10;
            iCount++;
            iValue= iValue /10;
        }
        return iCount;
    }
}

class Program336
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