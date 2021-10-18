public class interfaceprint {
public static void main (String[] args) {
interface Interface1 {
    static void print() {
        System.out.print("Hello");
    }
}

interface Interface2 {
    static void print() {
        System.out.print("World!");
    }
}
Interface1.print();
Interface2.print();
      }
              }