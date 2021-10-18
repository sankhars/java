import java.util.ArrayList;
public class Test {
public static void main(String args[]){
int arr1[] = {1,2,3,4,5};
int arr2[] = new int[arr1.length];
for(int i = 0;i<=arr1.length-1;i++){
arr2[i] = arr1[i];

System.out.println(arr2[i]);
}
System.out.println("array2 values after copying");

}
}