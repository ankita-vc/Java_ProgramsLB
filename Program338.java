// Accept number and return sum of digits 

import java.util.*; 

class Digits
{
    public int SumDigits(int iValue)
    {
        int iDigit= 0;
        int iSum= 0;

        while(iValue != 0)
        {
            iDigit= iValue % 10;
            iSum= iSum+iDigit;
            iValue= iValue /10;
        }
        return iSum;
    }
}

class Program337
{
    public static void main(String Arg[])
    {
        Scanner sobj= new Scanner(System.in);

        System.out.println("enter first number:");
        int iNo= sobj.nextInt();

        Digits dobj= new Digits();
        int iRet= dobj.SumDigits(iNo);

       System.out.println("Addition of Digits is: "+iRet);

        sobj.close();
    }
}