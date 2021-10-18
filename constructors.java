public class constructors{
//instance variables
int age;
String name;
String address;

constructors(){
age =12;
name ="vivek";
address = "gandhipuram";
System.out.println(name+""+age+""+address);
}
public static void main(String args[]){
constructors p = new constructors();
}
}