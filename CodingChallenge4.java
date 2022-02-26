//Write an algorithm to create a class ConstructorDemo with default and parameterized constructors. Introduce yourself in both default and parameterized constructors and execute them.

class ConstructorDemo{
    ConstructorDemo(){         // this is default constructor
        System.out.println("\n Hi! My name is Siri. I am from Apple metaverse. I can help you with anything!!");
    }
    ConstructorDemo(String name, String company){
        // the above is parameterised constructor
        System.out.println("\n Hi! My name is " + name + ". I am from the " + company + " metaverse. I can help you with anything!!");
        
    }
    
    public static void main(String [] args){
        ConstructorDemo intro = new ConstructorDemo();
        ConstructorDemo intro1 = new ConstructorDemo("Gladys", "Marvel");
        // parameters given above in brackets
    }
    
    
}
