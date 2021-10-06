import java.io.*;
import java.util.*;
import java.lang.*;

class Person
{
 String name;
 int gender;
 int age;
 String address;
 
 Person()
 {
   name=" ";
   gender=0;
   age=0;
   address=" ";
 }
 
 void get()
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the name of the person:");
  name=sc.next();
  System.out.println("Enter the gender of the person:");
  gender=sc.nextInt();
  System.out.println("Enter the age of the person:");
  age=sc.nextInt();
  System.out.println("Enter the address of the person:");
  address=sc.next();
 }
 
 void display()
 {
 System.out.println("---------------------------");
  System.out.println("name of the person:"+name);
  System.out.println("gender of the person:"+gender);
  System.out.println("age of the person:"+age);
  System.out.println("address of the person:"+address);
 }
}

class Employee extends Person
{
 String company_name;
 int empid;
 int salary;
 String Qualification;
 
 Employee()
 {
   empid=0;
   company_name=" ";
   Qualification=" ";
   salary=0;
 }
 
 void get()
 {
  
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the name of the company:");
  company_name=sc.next();
  System.out.println("Enter the ID of the employee:");
  empid=sc.nextInt();
  System.out.println("Enter the Qualification of the employee:");
  Qualification=sc.next();
  System.out.println("Enter the salary of the employee:");
  salary=sc.nextInt();
 }
 
 void display()
 {
  super.display();
  System.out.println("---------------------------");
  System.out.println("name of the company:"+company_name);
  System.out.println("ID of the employee:"+empid);
  System.out.println(" Qualification of the employee:"+Qualification);
  System.out.println("salary of the employee:"+salary);
 }
}
 
class Teacher extends Employee
{
 String subject;
 int teacherid;
 String dept;
 
 Teacher()
 {
   teacherid=0;
   subject=" ";
   dept=" ";
 }
 
 void get()
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the ID of the teacher:");
  teacherid=sc.nextInt();
  System.out.println("Enter the departement of the teacher:");
  dept=sc.next();
  System.out.println("Enter the subject of the teacher:");
  subject=sc.next();
 }
 
 void display()
 {
  super.display();
  System.out.println("---------------------------");
  System.out.println("ID of the teacher:"+teacherid);
  System.out.println(" departement of the teacher:"+dept);
  System.out.println("subject of the teacher:"+subject);
 }
}

class school
{
 public static void main(String [] args)
 {
  int i,n;
  System.out.println("---------------------------");
  System.out.println("DETAILS TEACHERS IN COLLEGE");
  System.out.println("---------------------------");
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the number of persons:");
  n=sc.nextInt();
  Teacher t[]= new Teacher[10];
  System.out.println("Enter the details:");
  for(i=1;i<=n;i++)
  {
   t[i] = new Teacher();
   t[i].get();
  }
  for(i=1;i<n;i++)
  {
   t[i].display();
  }
   System.out.println("---------------------------");
 }
}
 
