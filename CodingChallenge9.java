/* CODING CHALLENGE 9
Write a program in Java to implement classes and objects

Create a class
Copy and paste the below code in class.
Create a main method in the class.
Create an object “obj” for the class in the main method.
Execute the copyMe() method using the object created.
*/


public class Main {
    void copyMe(){
        System.out.println("Inside copyMe method");
    }
    


 public static void main(String[] args){
    Main obj = new Main();
    obj.copyMe();
}
}
