import java.util.Scanner;

public class rectareaperimeter{
public static void main(String args[]){
Scanner input = new Scanner(System.in);
System.out.println("Enter the length of the rectangle");
int l = input.nextInt();
System.out.println("Enter the width of the rectangle");
int w = input.nextInt();
int perimeter = 2*(l+w);
System.out.println("area of the rectangle"+(l*w));
System.out.println("perimeter of the rectangle"+perimeter);
}
}