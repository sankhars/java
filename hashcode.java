class hashcode {
public static void main(String args[]){
String a ="ayya";
String b = "ayya";
String c = "arya";
String d = new String("arya");
//content comparison
if(a.equals(b)){
System.out.println("comparing two hascodes"+a.hashCode()+"&"+b.hashCode());
}
//address comparison
if(a==b){
System.out.println("equals method in new string"+c.equals(d));
System.out.println("= operator in comparison"+c==d);
System.out.println("comparing ayya and arya"+c.hashCode()+"&"+d.hashCode());
}
}
}