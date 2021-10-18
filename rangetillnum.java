import java.util.Scanner;
public class rangetillnum{
public static void main(String args[]){
Scanner input = new Scanner(System.in);

int a = input.nextInt();
int b = input.nextInt();

System.out.println("the commoninputsrange till 25 to 75"+commoninputs(a,b));
}
public static boolean commoninputs(int p,int q){
 if (p<25 || q>75)
    return false;
 int x = p % 10;
 int y = q % 10;
 p = p/10;
 q = q/10;
 return (p == q || p == y || x == q || x == y);


}



}