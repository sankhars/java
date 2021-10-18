public class ObjectComparison
{  
public static void main(String[] args)   
{  
String a = "HELLO";
String t =  new String("HELLO");
//equals method for content comparison
System.out.println("Objects with string and new string method hence it returns " + t.equals(a)); 
//== operator is used for address comparison
System.out.println(t==a); 
}  
}  