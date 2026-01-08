public class sum {
int result ;
 static int counter = 0 ; /*A static variable is used to count how many objects of a class are created.
Each time the constructor is called, the static counter is incremented.
The current value of the counter is stored in an instance variable to uniquely identify each objec  */
 sum ( int i ,int  b){
  counter++ ; 
  result = 0; 
   int c = i + b ;
   result = counter + result; 
   System.out.print("\n" + "ansewer" + result + " = "+ c);
} 
public static void main(String args[]) {
  
sum obj = new sum(5, 10);
sum obj1 = new sum(20, 30);
sum obj2 = new sum(100, 200);
}
}