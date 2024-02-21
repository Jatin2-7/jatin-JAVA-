/*Q3. Create a class Book which contains four members: name,
author, price, num_pages. Include a constructor to set the
values for the members. Include methods to set and get the
details of the objects. Include a toString( ) method that could
display the complete details of the book. Develop a Java
program to create n book objects.*/

import java.util.Scanner;
class Book{
String name, Author;
int price,num_pages;
Book(){};
Book( String name, String Author, int price, int num_pages){
this.name=name;
this.Author=Author;
this.price-price;
this.num_pages=num_pages;
}
void set(){
System.out.println("enter details of book:");
Scanner S1= new Scanner(System.in);
name = S1.next();
Author = S1.next();
price = S1.nextInt();
num_pages= S1.nextInt();
}
void get(){
System.out.println("name: "+name+" Author: "+Author+" price: "+price+"
num_pages: "+num_pages);
}
public String toString(){
return("name: "+name+" Author: "+Author+" price: "+price+" num_pages:
"+num_pages);
}
}
public static void main (String[] args) {
class bookdemo{
int n;
Scanner S= new Scanner(System.in);
System.out.print("print n: ");
n=S.nextInt();
  Book B[] = new Book[n];
B[0] = new Book("cant_hurt_me","David_googins",700,360);
B[0].get();
for(int i=1;i<n;i++){
B[i]= new Book();
B[i].set();
}
System.out.println(B[1].toString());
for(int i=2;i<n;i++){
B[i].get();
}
}
}
