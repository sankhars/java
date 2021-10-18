public class constructorwithparam{
String name;
int age;
constructorwithparam(String name,int age){
//constuctor code
System.out.println("twoargument constructor");
}
public static void main(String args[]){
//calling default constructor
constructorwithparam p = new constructorwithparam();
//calling parameter constructor
p = constructorwithparam("vivek",12);
}
}