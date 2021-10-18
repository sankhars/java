import java.util.Scanner;
public class circleareaperimeter{
public static void main(String args[]){

Scanner input =  new Scanner(System.in);
double r = input.nextDouble();
System.out.println("Area is ="+Math.PI*r*r);
System.out.println("perimeter is ="+2*Math.PI*r);

}
}