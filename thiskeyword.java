public class thiskeyword{
int invar;
thiskeyword(int invar){
this.keyword = invar;
System.out.println("this reference the current variable"+this);
}
public static void main(String args[]){
thiskeyword obj = new thiskeyword(5);
System.out.println("dilbar",+obj);
}
}