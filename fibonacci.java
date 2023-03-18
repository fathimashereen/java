import java.util.Scanner;
class Fibonacci {
    void display(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the limit:");
        int n=sc.nextInt();
        int n1=0,n2=1,sum=0,count=1;
        System.out.println("Fibonacci series is:");
        while(count<=n){
            System.out.println(sum);
            n1=n2;
            n2=sum;
            sum=n1+n2;
            count=count+1;
        }


    }
    
}

class Main1{
    public static void main(String args[]){
        Fibonacci a=new Fibonacci();
        a.display();
    }
}
