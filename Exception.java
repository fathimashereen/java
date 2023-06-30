import java.util.InputMismatchException;
import java.util.Scanner;
class Except1{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        try{
           System.out.println("Enter two numbers:");
           int a=sc.nextInt();
           int b=sc.nextInt();
           int c=a/(a-b);
           System.out.println("c="+c);
        }
        catch(InputMismatchException e){
            System.out.println("You have entered a string!!!");
        }
        catch(Exception e){
            System.out.println("Exception found--------"+e);
        }
        
    }
}