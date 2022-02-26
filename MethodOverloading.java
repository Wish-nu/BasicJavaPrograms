
/* METHOD OVERLOADING EXAMPLE
    SAME METHOD NAME USED */
    


class Car {
    static String cars( String car1, String car2){
        return car1+car2;
    }
    static String cars( String car1, String car2, String car3){
        return car1+car2+car3;
    }       // same method name called cars 
}
    
    //main method
class OverloadingEx{
    public static void main(String[] args) {
         System.out.println(Car.cars("BMW, ","AUDI "));
         // car1 gets BMW & car2 gets AUDI
         System.out.println(Car.cars("BMW, ","AUDI, ","PORSCHE"));
         /* car1 get BMW & car2 gets AUDI & car3 gets PORSHCE which uses same method name - cars  */
         
    }
}
