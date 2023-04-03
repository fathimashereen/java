import java.util.Scanner;
class Employee{
String name,department;
int salary,g_salary,medical,travel,pf;
Scanner sc=new Scanner(System.in);
Employee(){
System.out.println("Enter your name:");
name=sc.next();
System.out.println("Enter your department:");
department=sc.next();
System.out.println("Enter gross salary:");
g_salary=sc.nextInt();
System.out.println("Enter medical deduction amount:");
medical=sc.nextInt();
System.out.println("Enter travel deduction amount:");
travel=sc.nextInt();
System.out.println("Enter provident fund:");
pf=sc.nextInt();
}
void calc(){
salary=g_salary-medical-travel-pf;
}
void display(){
System.out.println("Name:"+name);
System.out.println("Department:"+department);
System.out.println("Salary:"+salary);
System.out.println();
}
}
class emp_main{
public static void main(String args[]){
Employee arr[]=new Employee[5];
for(int i=0;i<5;i++){
arr[i]=new Employee();
arr[i].calc();
}

for(int i=0;i<5;i++){
arr[i].display();
}
}
}
