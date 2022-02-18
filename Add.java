import java.util.Scanner;

public class MyAdd {
    public int performAddition(int num1, int num2) {
        return num1 + num2;
      
    }
//  main method
public static void main(String[] args){
    // create object of main class
    Main main - new Main();
    int num1, num2, result;
    
    //take input from user
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the first number: ");
    num1 = sc.nextInt();
    System.out.println("Enter the second number: ");
    num2 = sc.nextInt();
    sc.close();
    
    // call performAddition method and store result in result variable
    result = main.performAddition(num1, num2);
    
    //display the result
    System.out.println("the sum of " + num1 + "+" + num2 + "is" + result);
    
    
}
}
