/* MULTI LEVEL INHERITANCE SYNTAX
    AND METHOD OVER RIDING ILLUSTRATION */
    
class A{
    public void method1(){
        System.out.println("inside class A using method1");
    }
}

class B extends A{
    public void method2(){
        System.out.println("inside B using method2");
    }
}

class C extends B{
    public void method2(){
        System.out.println("inside class c using method 2 & overides class B.");
        /*here method2 is same name for class B and C. Hence class C will Override class B */
        
    }
}

public class Main {
public static void main (String[] args) {
    C obj = new C();
    obj.method1();
    obj.method2();// overiding class B and printing class C 
    
}
}
