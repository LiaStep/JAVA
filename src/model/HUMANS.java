package model;

public class HUMANS {
   public String Name;
   public String lastname;
   public int year;

   public void sayhello() {
      System.out.println("Hello");

   }

   public void printFullname() {
      System.out.println(Name + " " + lastname);
   }

   public void printtoN(int N) {
      for (int i = 1; i < N; i++) {
         System.out.println(i + " ");
         ;
      }
      System.out.println();

   }
   public void  sum(int x, int y){
      System.out.println( x+y);
   }
}
