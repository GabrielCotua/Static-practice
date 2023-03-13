import java.util.*;

class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
    int c = AbsoluteValue(4, 7);

    System.out.println(c);

    stringPractice("hola");

    
  }
  
  public static int AbsoluteValue(int a, int b){
  return Math.abs(a - b);
  }

  public static void stringPractice(String str1){
    System.out.println("Cual es la mejor palara?");
    Scanner w = new Scanner(System.in);
   
    str1 = w.nextLine();
    System.out.println(str1 + " es la mejor palabra");
  }
  
}