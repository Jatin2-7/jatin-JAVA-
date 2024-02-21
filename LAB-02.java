/*Q2.Develop a Java program to create a class Student with
members usn, name, and array credits and an array marks.
Include methods to accept and display details and a method to
calculate SGPA of a student*/

import java.util.Scanner;
class student{
String USN name;
Scanner S1= new Scanner(System.in);
int size = S1.nextInt();
float credits[] = new float[size];
float marks[] = new float[size];
void accept(){
USN= S1.next();
name= S1.next();
System.out.println("Marks in the following subjects are 1. Maths 2.physics
3.C progm 4.web 5.kannada 6.IDT 7.civil 8.english");
for(int i=0;i<size; i++){
System.out.print((i+1)+" = ");
marks[i]= S1.nextInt();
}
System.out.println("respective credits of subjects are 1. Maths 2.physics
3.C progm 4.web 5.kannada 6.IDT 7.civil 8.english");
for(int i=0;i<size; i++){
System.out.print((i+1)+" = ");
credits[i]= S1.nextInt();
}
}
void display(){
System.out.println("USN: "+USN+" name: "+name);
System.out.println("Marks and credits in the following subjects are
1. Maths 2.physics 3.C progm 4.web 5. kannada 6.IDT 7.civil 8.english");
for(int i=0;i<size; i++){
System.out.print((i+1)+".marks = "+marks[i]+" credits="+credits[i]+"
");
}
}
int gpa(int i){
if(marks[i]>=90) return 10;
else if(marks[i]>=80 && marks[i]<=89) return 9;
else if(marks[i]>=70 && marks[i]<=79) return 8;
else if(marks[i]>=60 && marks[i]<=69) return 7;
  else if(marks[i]>=50 && marks[i]<=59) return 6;
else if(marks[i]>=40 && marks[i]<=49) return 5;
else if(marks[i]>=80 && marks[i]<=89) return 4;
else return 0;
}
float sgpa(){
float SGPA sum=0;
for(int i=0;i<size; i++){
sum=sum+gpa(i)*credits[i];
}
//total credits=20
SGPA = sum/20;
return SGPA;
}
}
class call{
public static void main (String[] args) {
student S1 = new student();
S1.accept();
S1.display();
float Ans;
Ans = S1.sgpa();
System.out.println("SGPA of the student is: "+Ans);
}
}
