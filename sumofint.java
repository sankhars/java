import java.util.Scanner;

public class sumofint{
public static void main(String args[]){
Scanner input = new Scanner(System.in);
int a = input.nextInt();
int b = a/10;
int c = a%10;
int d = b+c;
System.out.printf("The sum of digits is %d ",d);
}
}