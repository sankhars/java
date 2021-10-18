class finallyword{
public static void main(String args[]){
//
try{
int d =25/0;
System.out.println(d);
}
catch(ArithmeticException e){
System.out.println(e);
//System.exit(0);
}
//always execute when exception is not caught
finally{
System.out.println("its exceuted when arithmeticexception occured");
}
}
}