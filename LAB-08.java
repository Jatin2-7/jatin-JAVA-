/*Q8.Write a program to create a two threads one thread displays
“BMS college of Engineering” once every ten seconds and
another displays “CSE” once every two seconds.
*/

class BMSthread implements Runnable{
public void run(){
while(true){
try{
System.out.println("BMS College of engineering");
Thread.sleep(10000);
}
catch(InterruptedException ie){
System.out.println("Thread Interrupted");
}
}
}
}
class CSEthread implements Runnable{
public void run(){
while(true){
try{
System.out.println("CSE");
Thread.sleep(2000);
}
catch(InterruptedException ie){
System.out.println("Thread Interrupted");
}
}
}
}
class display{
public static void main(String xx[]){
thread bms=new thread(new BMSthread);
thread cse=new thread(new CSEthread);
bms.start();
cse.start();
}
}
class BMSthread implements Runnable{
public void run(){
while(true){
try{
System.out.println("BMS College of engineering");
Thread.sleep(10000);
}
catch(InterruptedException ie){
System.out.println("Thread Interrupted");
}
}
}
}
class CSEthread implements Runnable{
public void run(){
while(true){
try{
System.out.println("CSE");
Thread.sleep(2000);
}
catch(InterruptedException ie){
System.out.println("Thread Interrupted");
}
}
}
}
class display{
public static void main(String xx[]){
thread bms=new thread(new BMSthread);
thread cse=new thread(new CSEthread);
bms.start();
cse.start();
}
}
