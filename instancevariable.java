public class instancevariable{
String division;//default instance
public int age;//public sinstance
static String staticField;
public boolean covidresult;
public static void main(String args[]){
// inside class but outside method
// instance can contain the keywords of states like private public protected
instancevariable obj = new instancevariable();
//instance variable only accessed with the object of the class only
System.out.println(obj.age);
System.out.println(obj.staticField);
System.out.println(obj.covidresult);
}
public void method(){
String localvariable ="Initial value";
System.out.println(localvariable);
}

}
