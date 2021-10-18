import java.util.Scanner;

public class multiplication{
public static void main(String args[]){
Scanner input = new Scanner(System.in);
int a = input.nextInt();
for(int i=1;i<11;i++){
System.out.println(a+"X"+i+"="+a*i);
}
}
}