import java.io.*;
import java.util.*;
import java.lang.*;

class Digit
{
 public void get()
 {
  int sum,num,r,n;
  System.out.println("-------------------");
  System.out.println("SUM OF GIVEN NUMBER");
  System.out.println("-------------------");
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the number:");
  num=sc.nextInt();
  sum=0;
  r=num/10;
  n=num%10;
  sum=sum+r+n;
  System.out.println("Sum of the number:"+sum);
  System.out.println("-------------------");
  }
 
  public static void main(String [] args)
  {
   Digit d=new Digit();
   d.get();
  }
 }
