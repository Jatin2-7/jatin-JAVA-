/*Q7.Write a program that demonstrates handling of exceptions
in inheritance tree. Create a base class called “Father” and
derived class called “Son” which extends the base class. In
Father class, implement a constructor which takes the age and
throws the exception WrongAge( ) when the input age=father’s
age.*/

class wrongageexception extends Exception{
wrongageexception(String message){
super(message);
}
public String toString(){
return "wrong age enetered";
}
}
class father{
int age;
father(int age) throws wrongageexception{
if(age<0){
throw new wrongageexception("age cannot be negative");
}
this.age=age;
}
}
class son extends father{
int sonage;
son(int fatherage, int sonage) throws wrongageexception{
super(fatherage);
if(sonage >= fatherage){
throw new wrongageexception("son age cannot be greater than father
age");
}
this.sonage=sonage;
}
}
class exceptiondemo{
public static void main(String xx[])
{
try{
father f=new father(40);
son s=new son(f.age,25);
System.out.println("father age :"+f.age);
System.out.println("son age :"+s.sonage);
}
catch(wrongageexception e){
System.out.println("exception:"+e.toString());
System.out.println("exception:"+e.getMessage());
}
}
