import java.util.Random;   
public class RandomNumberjava8  
{   
public static void main(String[] args)   
{   
randomInts(5);  
}
public static void randomInts(int num){
Random random = new Random();
random.ints(num).forEach(System.out::println);
}
}
