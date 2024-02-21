/*Q4.Develop a Java program to create an abstract class named
Shape that contains two integers and an empty method named
printArea( ). Provide three classes named Rectangle, Triangle
and Circle such that each one of the classes extends the class
Shape. Each one of the classes contain only the method
printArea( ) that prints the area of the given shape.
*/

abstract class shape{
int a,b;
abstract void printarea();
}
class rectangle extends shape{
rectangle(int x,int y){
a=x;b=y;
}
void printarea(){
System.out.println("area of rectangle is : "(a*b));
}
}
class triangle extends shape{
triangle(int x,int y){
a=x;b=y;
}
void printarea(){
System.out.println("area of triangle is : "(0.5*a*b));
}
}
class circle extends shape{
circle(int x){
a=x;
}
void printarea(){
System.out.println("area of circle is : "(3.14*a*a));
}
}
class shapedemo{
public static void main(String xx[]){
rectangle r=new rectangle(5,4);
triangle t=new triangle(5,4);
circle c=new circle(7);
r.printarea();
t.printarea();
c.printarea();
}
}
