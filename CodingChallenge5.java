

public class ConstructorDemo{
    public ConstructorDemo(){
        System.out.println("I am default constructor");
    }
    public ConstructorDemo(int a, float f, String st, char c){
        System.out.println("\n I am parameterised constructor and I take various arguments as input");
        System.out.println("\n The sqaure of an integer is " + a*a);
        System.out.println("\n The square of a float is " + f*f);
        System.out.println("\n The string is " + st);
        System.out.println("\n The character value is = " + c);
        
    }

public void observations(){
    System.out.println("\n inside observations method");
}
public static void main(String[] args){
        //System.out.println("\n From object creation method 1")
        ConstructorDemo con = new ConstructorDemo();
        ConstructorDemo con1 = new ConstructorDemo(14,19.457f, "Sting",'a');
        System.out.println("\n From object creation method 2");
        ConstructorDemo con2, con3;
        con2 = new ConstructorDemo();
        con3 = new ConstructorDemo(19088, 2.578998f, "Hi Everyone",'f');
        con.observations();


        
        
    }

}


