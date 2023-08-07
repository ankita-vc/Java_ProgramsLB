// Accept number and return its factorial  (Approach 1)

import java.util.*; 

class Program328
{
    public static void main(String Arg[])
    {
        Scanner sobj= new Scanner(System.in);

        System.out.println("enter first number:");
        int iNo= sobj.nextInt();

        int iMult= 1;

        for(int iCnt= 1; iCnt <= iNo; iCnt++)
        {
            iMult= iMult * iCnt;
        }

        System.out.println("Factorail is: "+iMult);

        sobj.close();
    }
}