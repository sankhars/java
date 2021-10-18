import java.util.Scanner;
public class penultimateword{
public static void main(String args[]){
Scanner input = new Scanner(System.in);
String value = input.nextLine();
String[] words = value.split("[ ]");
System.out.println("the penultimateword is"+words[words.length-2]);

}
}