import java.io.Console;

public class readpassword{
public static void main(){
Console cons;
if((cons = System.console())!=null){
char[] password = null;
try{
password = cons.readPassword("input");
System.out.println("the password is "+ new String(password));
}
catch(Exception e){
throw new RuntimeException("Can't get password No console");
}

}



}
}