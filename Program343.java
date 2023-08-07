// Accept N numbers from user and disply that numbers

import java.util.*;

class Program343
{
    public static void main(String Arg[])
    {
        Scanner sobj= new Scanner(System.in);

        System.out.println("Enetr number of elements:");
        int iSize = sobj.nextInt();

        // Memory allocation for array
        int Arr[]= new int[iSize];

        System.out.println("Enetr the elements:");
        int iCnt= 0;
        for(iCnt= 0; iCnt < iSize; iCnt++)
        {
            Arr[iCnt]= sobj.nextInt();
        }

        System.out.println("Elements of array are:");
        for(iCnt= 0; iCnt < iSize; iCnt++)
        {
            System.out.print(Arr[iCnt]+" \t");
        }

        sobj.close();
    }
}