import java.util.HashMap;
public class Main {
  public static void main(String[] args) {
HashMap<String,String> capital = new HashMap<String,String>();
capital.put("email","");
capital.put("alternateemail","swathi");
capital.put("gender","male");
if(capital.get("email").isEmpty()){
   System.out.println("email contains null");
   System.out.println(capital.get("alternateemail"));
}
else{
     System.out.println(capital);
}


}
}

