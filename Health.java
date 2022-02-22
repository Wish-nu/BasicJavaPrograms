// Create two separate classes Health & HealthDriver inside  com.greatlearning.corejava; package 

// Declare variables age(int), weight(float) & bmi(float) inside class Health as protected.

// Display all the variable in class HealthDriver


class Health {
    protected int age=67;
    protected float weight=78f;
    protected float bmi=101f;
    }
class HealthDriver {
    public static void main(String[] args){
        Health health = new Health();
        System.out.println(health.age);
        System.out.println(health.weight);
        System.out.println(health.bmi);
    }

    
}
