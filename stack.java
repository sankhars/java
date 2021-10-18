public class stack{
public static void main(String args[]){
fact(10);
}
public static int fact(int n){
  // wrong base case (it may cause
    // stack overflow).
    if (n == 100) 
        return 1;

    else
        return n*fact(n-1);
}
}