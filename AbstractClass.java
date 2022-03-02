//ABSTRACT CLASS EXAMPLES

abstract class Bike{
    abstract void run();
}
class Enfield extends Bike{
    void run(){ // defining run outside abstract class
        System.out.println("Always strong");
    }
public static void main(String[] args){
    Bike obj1 = new Enfield();
    // because bike is an abstract class
    //we cant invoke directly
    obj1.run();
    // run invoked in class enfield
}
}
