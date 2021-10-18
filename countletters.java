import java.util.Scanner;
public class countletters {
    
 public static void main(String[] args) {
 String test  = " Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33";
 count(test);
}
public static void count(String test){
    char[] ch = test.toCharArray();
    int letter = 0;
    int numbers = 0;
    int spaces = 0;
    int others = 0; 
    for(int i = 0;i<test.length();i++){
    if(Character.isLetter(ch[i])){
    letter++;
    }
    else if(Character.isDigit(ch[i])){
     numbers++;
   }
    else if(Character.isSpaceChar(ch[i])){
     spaces++;
   }
    else{
     others++;
   }
}

System.out.println("The string is :  Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33");
System.out.println("letters:"+letter);
System.out.println("numbers :"+numbers);
System.out.println("spaces :"+spaces);
System.out.println("others :"+others);

}



}