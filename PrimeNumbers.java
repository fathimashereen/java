import java.util.Scanner;
class Prime{
    void display(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the limit:");
        int n=sc.nextInt();
        System.out.println("prime numbers are:");
        for(int i=2;i<=n;i++){
            int flag=0;
            for(int j=2;j<i;j++){
                if(i%j==0){
                    flag++;
                    break;
                }
            }
            if(flag==0){
                System.out.println(i);
            }
        }
        
    }
}
class Main3{
    public static void main(String args[]){
        Prime a=new Prime();
        a.display();
    }
}


