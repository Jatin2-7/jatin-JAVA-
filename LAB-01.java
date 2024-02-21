/* Develop a Java program that prints all real solutions to the quadratic equation ax2+bx+c 
= 0. Read in a, b, c and use the quadratic formula. If the discriminate b2-4ac is negative, 
display a message stating that there are no real solutions. */

import java.util.Scanner;
import java.lang.Math;
class quadratic
{public static void main(String XX[])
{
int a,b,c;
System.out.println("enter the values of a,b,c respectively\n"); Scanner s1= new Scanner(System.in);
a = s1.nextInt();
b = s1.nextInt();
c = s1.nextInt();
double d b*b 4*a*c;
System.out.println("a = " + a + b = " + b + c = " + c);
if(a==0) {System.out.println("not a quadratic equation");}
else if( d>0)
{
System.out.println("the equation has two real and different solutions");
double r1=(-b + Math.sqrt(d))/(2*a);
double r2=(-b Math.sqrt(d))/(2*a);
System.out.println("r1 = " + r1);
System.out.println("r2 = 11 + r2);
}
else if(d==0)
{
System.out.println("the equation has real and equal solutions");
double r1= -b/(2*a);
double r2= -b/(2*a);
System.out.println("r1 = + r1);
System.out.println("r2 = + r2);
}
else if(d<0)
{
System.out.println("the equation has unreal solutions");
}
}
}
