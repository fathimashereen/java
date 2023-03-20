import java.util.Scanner;
class Conversion{
    float f,c;
    void ToCelsius(Scanner sc){
        System.out.println("Enter the temperature in fahrenheit:");                     
        float fahrenheit=sc.nextFloat();
        c=(fahrenheit-32)*5/9;
        System.out.println(fahrenheit +" fahrenheit is "+c+" celsius");
    }
    void ToFahrenheit(Scanner sc){
        System.out.println("Enter the temperature in fahrenheit:"); 
        float celsius=sc.nextFloat();
        f=(celsius*9/5)+32;
        System.out.println(celsius +" celsius is "+f+" fahrenheit");
    }
}
class Temperature{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        Conversion a=new Conversion();
        while(true){
            System.out.println("1.fahrenheit to cesius");
            System.out.println("2.celsius to fahrenheit");
            System.out.println("3.Exit");
            int choice=sc.nextInt();
            if(choice==1)
            a.ToCelsius(sc);
            else if(choice==2)
            a.ToFahrenheit(sc);
            else if(choice==3){
                System.out.println("Exit point.");
                System.exit(0);
            }
            else{
                System.out.println("wrong choice.");
            }

        }
    }
}
