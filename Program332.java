// Accept number and return multiplication of even factors  (Approach 2)

import java.util.*; 

class Numbers
{
    public int DisplayEvenFactorial(int iValue)
    {
        int iMult= 1;

        for(int iCnt= 1; iCnt <= iValue; iCnt++)
        {
            if((iValue % iCnt == 0) && (iCnt % 2 == 0))
            {
                iMult= iMult * iCnt;
            }
        }
        return iMult;
    }
}

class Program332
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