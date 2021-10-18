public class methodoverload{
//method overload must have methdo of samename
//but parameters must be differnt
public int square(int number){
int square = number * number;
System.out.println(square);
}
public float square(float number){
float square = number * number;
System.out.println(number);
}
static double square(double num){
return num;
}
public static void main(String args[]){
methodoverload m = new methodoverload();
m.square(5);
m.square(2.5);
}

}