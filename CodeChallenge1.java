//Upon creating the object of Customer, the empty constructor will call parameterized constructor and print’s hi, later hello gets printed on the console.
 
1.  class Customer {
2.     Customer(){
3.     this(1);
4.     System.out.print(" hello");
5.   } 
6.     Customer(int x){
7.          System.out.print("hi");
8.      }
9.   }
10. class Main {
11.       public static void main(String args[]) {
12.       Customer customer = new Customer();
13.          }
14     }


/*in the above program, there are two constructors of Class Customer, one is unparameterized and the other has
one parameter of type int.
In the above code, we are creating a customer object using the Customer() constructor.
Inside the non-parameterized constructor, there is a line of code this(1), which will call parameterized constructor inside parameterized constructor there is a print statement hi which will get printed.
Note: this keyword refers to the current object in a method or constructor.
After hi, is printed the code flow will come back to the un parameterized constructor and it will print hello.

Code flow

Line 12 --> Line 2 --> Line 3 --> Line 6 -- >Line 7 --> Line 4
*/
