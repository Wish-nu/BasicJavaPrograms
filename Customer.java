//getting compilation error
///Customer.java:5: error: class WorldBank is public, should be declared in a file named WorldBank.java
// anyone could please correct the error
public class WorldBank{

public class Customer{
    String fullName;
    int age;
} 
public class WorldBank{
    public static void main(String args[]) {
      Customer c1 = new Customer();
      c1.fullName = "Richard Branson";
      c1.age = 71;

      System.out.println("The customer name in World Bank is: " + c1.fullName);
      System.out.println("The age of the customer is: " + c1.age);
    }
}
