import java.util.Scanner;
class Student{
     String Name;
     int RNo;
     int Mark;
     Student(String Name,int RNo,int Mark){
          this.Name=Name;
          this.RNo=RNo;
          this.Mark=Mark;
     }
     class Sports{
          String SName;
          int A_Point;
          Sports(String SName,int A_Point){
               this.SName=SName;
               this.A_Point=A_Point;
          }
          void Display(){
               System.out.println("___________________________");
               System.out.println("Name:"+Name);
               System.out.println("Roll Number:"+RNo);
               System.out.println("Marks:"+Mark);
               System.out.println("Sports Name:"+SName);
               System.out.println("Activity Point:"+A_Point);
               System.out.println("__________________________");
          }
     }
}
class InnerMain1{
     public static void main(String args[]){
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter your Name:");
          String n=sc.nextLine();
          System.out.println("Enter Roll Number:");
          int r=sc.nextInt();
          System.out.println("Enter Marks:");
          int m=sc.nextInt();
          System.out.println("Enter Sports Name:");
          String sn=sc.next();
          System.out.println("Enter Activity Point:");
          int sm=sc.nextInt();
          Student s=new Student(n,r,m);
          Student.Sports s1=s.new Sports(sn,sm);
          s1.Display();
     }
}
