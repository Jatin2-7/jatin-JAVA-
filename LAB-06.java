/*Q6. Create a package CIE which has two classes- Student and
Internals. The class Student has members like usn, name, sem.
The class internals has an array that stores the internal marks
scored in five courses of the current semester of the student.
Create another package SEE which has the class External which
is a derived class of Student. This class has an array that stores
the SEE marks scored in five courses of the current semester of
the student. Import the two packages in a file that declares the
final marks of n students in all five courses.*/

package CIE;
import java.util.Scanner;
public class student
{
public String USN,name;
public int semester;
Scanner S1 = new Scanner(System.in);
public void set()
{
System.out.println("USN of the student is : ");
USN = S1.next();
System.out.println("name of the student is : ");
name = S1.next();
System.out.println("semester of the student is : ");
semester = S1.nextInt();
}
public void get()
{
System.out.println("USN of the student is : "+USN+"name of the student is
: "+name+"semester of the student is : "+semester);
}
}
package CIE;
import java.util.Scanner;
public class internal extends student
{
Scanner S1 = new Scanner(System.in);
public int internal_marks[]= new int[5];
public void setcie()
{
System.out.println("1.Java 2.maths 3.DS 4.COA 5.DBMS ");
for(int i=0;i<5;i++)
{
System.out.print("\n"+(i+1)+".");
internal_marks[i]= S1.nextInt();
}
}
public void getcie()
{
System.out.println("1.Java 2.maths 3.DS 4.COA 5.DBMS ");
for(int i=0;i<5;i++)
{
System.out.println((i+1)+"."+internal_marks[i]);
}
  }
}
package SEE;
import CIE.student;
import java.util.Scanner;
public class external extends CIE.student
{
Scanner s1 = new Scanner(System.in);
public int see_marks[]=new int[5];
public void setsee()
{
System.out.println("1.Java 2.maths 3.DS 4.COA 5.DBMS ");
for(int i=0;i<5;i++)
{
System.out.print("\n"+(i+1)+".");
see_marks[i]= s1.nextInt();
}
}
public void getsee()
{
System.out.println(" 1.Java 2.maths 3.DS 4.COA 5.DBMS ");
for(int i=0;i<5;i++)
{
System.out.println(i+"."+see_marks[i]);
}
}
}
import java.util.Scanner;
import CIE.student;
import CIE.internal;
import SEE.external;
public class fmarks
{
public static void main(String XX[] )
{
int n;
System.out.println("enter number of students : ");
Scanner S1=new Scanner(System.in);
n=S1.nextInt();
CIE.student S[]=new student[n];
CIE.internal I[]= new internal[n];
SEE.external E[]= new external[n];
  for(int i=0;i<n;i++)
{
S[i] = new student();
I[i]= new internal();
E[i]=new external();
System.out.println("Enter details of student : ");
S[i].set();
System.out.println("Enter internal marks of student (out of 50) : ");
I[i].setcie();
System.out.println("Enter see marks of student (out of 100) : ");
E[i].setsee();
}
for(int i=0;i<n;i++)
{
System.out.println("details of student are : ");
S[i].get();
System.out.println("internal marks of student are : ");
I[i].getcie();
System.out.println("see marks of student are : ");
E[i].getsee();
}
//final marks calculation
for (int i = 0; i < n; i++) {
System.out.println("Marks of student " + S[i].name + ":");
for (int j = 0; j < 5; j++) {
int subjectTotalMarks = I[i].internal_marks[j] +
((E[i].see_marks[j])/2);
System.out.println("Subject " + (j + 1) + " marks: " +
subjectTotalMarks);
}
System.out.println();
}
}
}
