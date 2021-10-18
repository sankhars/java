import java.util.Scanner;

public class compare{
public static void main(String args[]){
Scanner input = new Scanner(System.in);
int a = input.nextInt();
int b = input.nextInt();
if(a==b){
System.out.printf("\n%d==%d",a,b);
}
if(a!=b){
System.out.printf("\n%d!=%d",a,b);
}
if(a<b){
System.out.printf("\n%d<%d",a,b);
}
if(a<=b){
System.out.printf("\n%d<=%d",a,b);
}
}
}