public class finallyblock {
void m1()
{ 
 int a = 20, b = 0;	
try 
{
  System.out.println("I am in try block");
  int c = a/b;
  System.out.println("Result: " +c);
}
catch(ArithmeticException ae)
{
  System.out.println("I am in catch block");
}
finally 
{
  System.out.println("I am in finally block");
  int x = 30/0; // Exception occurred in finally block.
  System.out.println("Result: " +x);
 }
}
 public static void main(String[] args) 
 {
 finallyblock obj = new finallyblock();
  obj.m1();
  }
}