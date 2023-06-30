//Authenticate the user name and password.
import java.util.Scanner;
class InvalidUser extends Exception{
    InvalidUser(String m){
        super(m);
    }
}
class User{
    public static void main(String args[]){
        String Username="fathimashereen";
        String Password="fs@123";
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Username:");
        String u=sc.next();
        System.out.println("Enter Password:");
        String pw=sc.next();
        try{
            if((u.equals(Username))&&(pw.equals(Password))){
                System.out.println("Login Successfull");
            }
            else{
                throw new InvalidUser("Invalid Credentials");
            }
        }
        catch(Exception e){
            System.out.println("Exception---"+e);
        }

        
    }
}