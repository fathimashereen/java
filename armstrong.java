import java.util.Scanner;
class Armstrong{
   
   void check(){
      Scanner input=new Scanner(System.in);
      System.out.println("Enter a number:");
      int n=input.nextInt();
      int temp=n,rem,num=0;
      while(temp>0){
         rem=temp%10;
         num=num+(rem*rem*rem);
         temp=temp/10;
      }
      if(num==n){
         System.out.println("the number is armstrong");
      }
      else
      System.out.println("number is not armstrong"); 
      input.close();  
   }
}

class Main {
    public static void main(String args[]){
        Armstrong a=new Armstrong();
        a.check();
        
    }
    
}
