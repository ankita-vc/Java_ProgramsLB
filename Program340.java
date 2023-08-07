// Accept number and return its generic root

import java.util.*; 

class Digits
{
    int GenericRoot(int iNo)
    {
        int iSum= 0;
        int iDigit= 0;

        while (iNo >= 10)   // jr iNo 10 pekshya jast asel tr jevda number pathvla toch return hoto
        {
            while(iNo != 0)
            {
                iDigit= iNo % 10;
                iSum= iSum+ iDigit;
                iNo= iNo/10;
            }
            

            if(iSum >= 10)
            {
                iNo= iSum;
                iSum= 0;
            }
            else
            {
                iNo = iSum;
                break;
            }
        }
        return iNo;
    }
}

class Program340
{
    public static void main(String Arg[])
    {
        Scanner sobj= new Scanner(System.in);

        System.out.println("enter first number:");
        int iValue= sobj.nextInt();

        Digits dobj= new Digits();
        int iRet= dobj.GenericRoot(iValue);

       System.out.println("Addition of Digits is: "+iRet);

        sobj.close();
    }
}

/*
  iNo= 987898

  isum= 9+ 8+ 7+ 8+ 9+ 8
  isum= 49;

  iNo= 49;
  iSum= 4+ 9;
  isum= 13;

  iNo= 13;
  iSum= 1+3;
  iSum= 4;

*/