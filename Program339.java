// Accept number and return sum of digits  (Approach 2)

import java.util.*; 

class Digits
{
    public int SumDigits(int iValue)
    {
        int iSum= 0;

        if(iValue < 0)
        {
            iValue= -iValue;
        }

        while(iValue != 0)
        {
            iSum= iSum + (iValue % 10);  // <----------
            iValue= iValue /10;
        }
        return iSum;
    }
}

class Program339
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