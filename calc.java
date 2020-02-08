
import calculation.*;
import java.util.*;
public class calc
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter first number");
int n1=sc.nextInt();
System.out.println("enter second number");
int n2=sc.nextInt();
int a,b;
System.out.println("In Calculator to perform operations between two number are");
System.out.println("1 : + ");
System.out.println("2 : - ");
System.out.println("3 : * ");
System.out.println("4 : / ");
System.out.println("Select any option");
int op=sc.nextInt();
calculation obj=new calculation(a,b);
switch(op)
{
case 1: obj.add();
        break; 
case 2: obj.sub();
        break; 
case 3: obj.mul();
        break;
case 4: obj.div();
        break; 
default:System.out.println("enter valid opertion");
}
}
}



calc.java
Displaying calc.java.