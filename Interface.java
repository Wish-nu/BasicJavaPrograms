

// WITH INTERFACE YOU CAN INHERIT MULTIPLE INTERFACES WHICH WOULD NOT BE POSSIBLE WITH MULTIPLE INHERITANCE CLASSES
interface Printable{
    void print();
}
interface Showable{
    void show();
}

class A implements Printable, Showable{
    public void print(){
        System.out.println("\n Welcome to IITR!");
    }
    public void show(){
        System.out.println("\n Lets learn Java!");
    }
public static void main(String[] args){
    A obj = new A();
    
    obj.print();
    //OVER RIDES INTERFACE PRINTABLE AND GOES TO CLASS A
    obj.show();
    // OVER RIDES INTERFACE SHOWABLE AND GOES TO CLASS A
}
}
