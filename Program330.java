// Accept number and return its factorial  (Approach 3: Object creation)

import java.util.*; 

class Numbers
{
    public int DisplayFactorial(int iValue)
    {
        int iMult= 1;

        for(int iCnt= 1; iCnt <= iValue; iCnt++)
        {
            iMult= iMult * iCnt;
        }

        return iMult;
    }
}

class Program330
{
    public static void main(String Arg[])
    {
        Scanner sobj= new Scanner(System.in);

        System.out.println("enter first number:");
        int iNo= sobj.nextInt();

        Numbers nobj= new Numbers();
        int iRet= nobj.DisplayFactorial(iNo);

        System.out.println("Factorail is: "+iRet);

        sobj.close();
    } 
}