package calculation;
public class div
{
div(int a,int b)
{
try
{
if(b==0)
{
ArithmeticException e=new ArithmeticException();
throw e;
}
else
{
System.out.println("division of"+a+""+b+""+(a/b));
}
}
catch(ArithmeticException e)
{
System.out.println("Division is not possible as num2=0");
}
}
}
