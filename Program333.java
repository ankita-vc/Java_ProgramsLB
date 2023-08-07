// Accept number and return multiplication of even factors

import java.util.*; 

class Numbers
{
    public int DisplayEvenFactorial(int iValue)
    {
        int iMult= 1;

        for(int iCnt= 2; iCnt <= iValue; iCnt= iCnt+2)  // <------  Complexity N/2        iCnt travel by skipping one number
        {
            if(iValue % iCnt == 0)
            {
                iMult= iMult * iCnt;
            }
        }
        return iMult;
    }
}

class Program333
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