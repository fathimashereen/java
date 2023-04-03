
import java.util.Scanner;
class Employee{
String name,department;
int salary,g_salary,medical,travel,pf,id;
Scanner sc=new Scanner(System.in);
Employee(){
System.out.println("Enter your name:");
name=sc.next();
System.out.println("Enter your id:");
id=sc.nextInt();
System.out.println("Enter your department:");
department=sc.next();
System.out.println("Enter gross salary:");
g_salary=sc.nextInt();
System.out.println("Enter medical amount:");
medical=sc.nextInt();
System.out.println("Enter travel  amount:");
travel=sc.nextInt();
System.out.println("Enter provident fund:");
pf=sc.nextInt();
}
void calc(){
salary=g_salary+medical+travel-pf;
}
void display(){
System.out.println("Name:"+name);
System.out.println("id:"+id);
System.out.println("Department:"+department);
System.out.println("Salary:"+salary);
System.out.println();
}
}
class emp_main{
public static void main(String args[]){
Employee arr[]=new Employee[2];
for(int i=0;i<2;i++){
arr[i]=new Employee();
arr[i].calc();
}

for(int i=0;i<2;i++){
arr[i].display();
}
}
}
