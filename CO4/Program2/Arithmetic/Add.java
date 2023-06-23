package Arithmetic;
interface A{
     public void Result(int a,int b);
     }
public class Add implements A{
     public void Result(int a,int b){
          int c=a+b;
          System.out.println("Sum is:"+c);
     }
}