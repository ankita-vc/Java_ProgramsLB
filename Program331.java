// Accept number and return multiplication of even factors 

import java.util.*; 

class Numbers
{
    public int DisplayEvenFactorial(int iValue)
    {
        int iMult= 1;

        for(int iCnt= 1; iCnt <= iValue; iCnt++)  // nested if else statement
        {
            if(iValue % iCnt == 0)  // check Factors
            {
                if(iCnt % 2 == 0)   // check even odd factors
                {
                    iMult= iMult * iCnt;
                }
            }
        }
        return iMult;
    }
}

class Program331
{
    public static void main(String Arg[])
    {
        Scanner sobj= new Scanner(System.in);

        System.out.println("enter first number:");
        int iNo= sobj.nextInt();

        Numbers nobj= new Numbers();
        int iRet= nobj.DisplayEvenFactorial(iNo);

       System.out.println("Factorail of even numbers is: "+iRet);

        sobj.close();
    }
}