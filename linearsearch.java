public class linearsearch{
public static void main(String args[])
{
int[] a1={10,20,30,50,70,90};
int a = 50;
System.out.println("searching 50 in the array list"+linearsearch(a1,a));
}
public static int linearsearch(int[] arr,int a){
for(int i=0;i<arr.length;i++){
if((arr[i])==a){
System.out.println(arr[i]);
return i;
   }
  }
return -1;
 }
}