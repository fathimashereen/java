//Average of N positive integers, raising a user defined exception for each negative
//input.
import java.util.Scanner;
class NumberIsNegative extends Exception{
    NumberIsNegative(String m){
        super(m);
    }
}

class Sum{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        float sum=0;
        try{
            System.out.println("How many numbers are you going to enter:");
            int n=sc.nextInt();
            if(n<=0){
                throw new NumberIsNegative("N must be positive!");
            }
            else{
                System.out.println("Enter "+n+" numbers:");
                for(int i=0;i<n;i++){
                    int a=sc.nextInt();
                    if(a<0){
                        throw new NumberIsNegative("You have entered a negative number!");
                    }
                        sum=sum+a;
                    }

                }
                float avg=sum/n;
                System.out.println("Average of "+n+" Numbers is:"+avg);
        }
        catch(Exception e){
            System.out.println("Exception----"+e);
        }
    }
}