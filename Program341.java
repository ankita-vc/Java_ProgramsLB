// Accept number and check amstrong number

import java.util.*; 

class Digits
{
    boolean CheckAmstrong(int iNo)
    {
        int iTemp= iNo;
        int iSum= 0;
        int iDigit= 0;
        int iCnt= 0;
        int iCount= 0;
        int iPower= 1;

        //Count number of digits
        while(iTemp != 0)
        {
            iDigit= iTemp % 10;
            iCount++;
            iTemp = iTemp/10;
        }

        // Logic to split the number and calculate power of digits
        iTemp= iNo;

        while(iNo != 0)
        { 
            iDigit= iNo % 10;
            // Logic to calculate power
            for(iCnt= 1; iCnt <= iCount; iCnt++)
            {
                iPower = iPower * iDigit;
            }
            iSum= iSum+iPower;
            iPower= 1;
            iNo= iNo/10;
        }

        if(iSum == iTemp)
        {
            return true;
        }
        else
        {
             return false;
        }
    }
}

class Program341
{
    public static void main(String Arg[])
    {
        Scanner sobj= new Scanner(System.in);

        System.out.println("enter first number:");
        int iValue= sobj.nextInt();

        Digits dobj= new Digits();
        boolean bRet= dobj.CheckAmstrong(iValue);

       if(bRet == true)
       {
            System.out.println("Number is Amstrong");
       }
       else
       {
            System.out.println("Number is not Amstrong");
       }

        sobj.close();
    }
}

/*
 
Input= 371
3^3 + 7^3 + 1^3
27 + 343 + 1
371

Input= 5467


*/
