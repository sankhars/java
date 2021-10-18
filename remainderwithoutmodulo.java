import java.util.Scanner;


public class remainderwithoutmodulo{
public static void main(String args[]){
Scanner input = new Scanner(System.in);
int a = input.nextInt();
int b = input.nextInt();
int d = a/b;
int c = a -(d*b);
System.out.println(c);
}
}