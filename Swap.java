// CIT-222-007/2019 Charles Murigu Gitonga
 // program to swap the digits of a two digit number
import java.util.Scanner;

public class Swap {
    public static void main(String[] args)
    {
       int num, temp;
       int digits=0, rem,remTemp, rev=0, r, revTemp, digitsTemp;
       Scanner scan = new Scanner(System.in);
       
       System.out.print("Enter the Number to swap: ");
       num = scan.nextInt();
       
       temp = num;
       while(temp>0)
       {
          digits++;
          temp = temp/10;
       }
       if(digits<2)
       {
          System.out.println("\nThe numbers can not be Interchanged.");
       }
       else if(digits==2)
       {
          temp = num;
          while(temp>0)
          {
             rem = temp%10;
             rev = (rev*10) + rem;
             temp = temp/10;
          }
          System.out.println("\nNumber interchange successful!");
          System.out.println("\nThe New Number is; = " +rev);
       }
       else
       {
          temp = num;
          while(temp>0)
          {
             rem = temp%10;
             rev = (rev*10) + rem;
             temp = temp/10;
          }
          r = rev;
          rev = 0;
          temp = num;
          digitsTemp = digits;
          while(temp>0)
          {
             remTemp = r%10;
             if(digitsTemp==digits || digitsTemp==1)
             {
                rem = temp%10;
                rev = (rev*10) + rem;
             }
             else
             {
                rev = (rev*10) + remTemp;
             }
             r = r/10;
             temp = temp/10;
             digitsTemp--;
          }
          System.out.println("\nFirst and Last Digit Interchanged Successfully!");
          System.out.println("\nThe new number  is  " +rev);
       }
    } 
}
