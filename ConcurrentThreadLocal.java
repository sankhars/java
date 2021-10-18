import java.util.concurrent.ThreadLocalRandom;   
public class RandomNumberExample4  {
public static void main(String args[]){
int a = ThreadLocalRandom.current().nextInt();
System.out.println(a);
boolean b = ThreadLocalRandom.current().nextBoolean();
System.out.println(b);
}
}