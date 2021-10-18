import java.util.Scanner;

public class reversestring{
public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a string: ");
        char[] letters =  scanner.nextLine().toCharArray();
        for(int i = letters.length-1;i>=0;i--){

	  System.out.print(letters[i]);

         }
        


}
}
