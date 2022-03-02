
// PARTIAL ABSTRACTION EXAMPLE


abstract class Bikes{
    Bikes(){
        System.out.println("\n Bikes is created");
    }
    abstract void run(); //define this method outside class Bikes
    void startEngine(){     //regular method & partial abstraction
        System.out.println("\n Press Engine start button!!");
    }   // this method can be defined here
}
class Ktm extends Bikes{
    void run(){ // defining abstract method here
        System.out.println("\n Running smoothly!!");
    }
}
//main function
class Test1{
    public static void main(String[] args){
        Bikes obj = new Ktm();
        // cant invoke bikes directly as its abstract
        obj.run();  //goes to class ktm
        obj.startEngine(); //goes to method startEngine under Bikes class
    }
}
