import Graphics.*;
import java.util.Scanner;
class Main{
     public static void main(String args[]){
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter Length and Breadth of Rectangle:");
          int l=sc.nextInt();
          int b= sc.nextInt();
          Graphics.Rectangle r1=new Graphics.Rectangle();
          r1.Area(l,b);
          System.out.println("Enter Side of Square:");
          int s=sc.nextInt();
          Graphics.Square s1=new Graphics.Square();
          s1.Area(s);
          System.out.println("Enter Base and Height of Triangle:");
          int tb=sc.nextInt();
          int th=sc.nextInt();
          Graphics.Triangle T1=new Graphics.Triangle();
          T1.Area(tb,th);
          System.out.println("Enter Radius of the Circle");
          double r=sc.nextDouble();
          Graphics.Circle C1=new Graphics.Circle();
          C1.Area(r);
     }
}
