// Accept number and return its factorial  (Approach 2; withour object creation)

import java.util.*; 

class Program329a
{
    public static int DisplayFactorial(int iValue)  // <---------
    {
        int iMult= 1;

        for(int iCnt= 1; iCnt <= iValue; iCnt++)
        {
            iMult= iMult * iCnt;
        }
        return iMult;
    }

    public static void main(String Arg[])
    {
        Scanner sobj= new Scanner(System.in);

        System.out.println("enter first number:");
        int iNo= sobj.nextInt();

        int iRet= DisplayFactorial(iNo);

        System.out.println("Factorial is: "+iRet);
        sobj.close();
    }
}