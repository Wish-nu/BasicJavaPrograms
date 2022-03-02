
//ABSTRACT CLASS EXAMPLE


abstract class Bank{
    abstract int getRateOfInterest();
    //define this abstract method outside class
}
    
class Sbi extends Bank{
    int getRateOfInterest(){ // defining abstract method here
    
        return 10; // returns ROI
    }
}
class Bob extends Bank{
    int getRateOfInterest(){ // defining abstract method here
    
        return 12; // returns ROI
    }
}

//main function
class TestBank{
    public static void main(String[] args){
        Bank b = new Sbi();
        // cant invoke bank directly as its abstract
        int interest = b.getRateOfInterest();
        // invoke the constructor getrateofinterest
        System.out.println("\n Rate of Interest is " + interest + "%");
        // ROI of sbi gets printed as it over ride bob and method invoked sbi
    }
}
