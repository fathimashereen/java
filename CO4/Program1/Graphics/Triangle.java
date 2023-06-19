package Graphics;
import java.util.Scanner;
interface tri{
     public void Area(int b,int h);
}
public class Triangle{
     public void Area(int b,int h){
          double area=(0.5*b*h);
          System.out.println("Area of Triangle is:"+area);
     }
}
