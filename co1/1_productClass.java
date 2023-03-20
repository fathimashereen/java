import java.util.Scanner;
class Product{
int pcode,price;
String pname;
void Read(){

Scanner sc=new Scanner(System.in);
System.out.println("Enter the code:");
pcode=sc.nextInt();
System.out.println("Enter name:");
pname=sc.next();
System.out.println("Enter price:");
price=sc.nextInt();
}
}

class Main1{
public static void main(String args[]){
Product a=new Product();
Product b=new Product();
Product c=new Product();
a.Read();
b.Read();
c.Read();
if((a.price<b.price) &&(a.price<c.price)){

System.out.println("product with pcode:"+a.pcode+",product name:"+a.pname+" has the lowest price:"+a.price);

}
else if((b.price<a.price)&&(b.price<c.price))
System.out.println("product with pcode:"+b.pcode+",product name:"+b.pname+" has the lowest price:"+b.price);
else
System.out.println("product with pcode:"+c.pcode+",product name:"+c.pname+" has the lowest price:"+c.price);
}
}
