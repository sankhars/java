public class JavaExample{   
public static void main(String args[]){  
JavaExample obj=new JavaExample();  
	obj=null;  
System.gc();
		
 }  
 protected void finalize() throws Throwable
   {
        System.out.println("Garbage collection is performed by JVM");
   }
}