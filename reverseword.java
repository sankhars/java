public class reverseword{
public static void main(String args[]){
String front = "i have 4 wheeler";
char[] letters = front.toCharArray();
for(int i = letters.length-1;i>=0;i--){
System.out.print(letters[i]);
}
}
}