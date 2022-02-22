// Create two separate classes Customer & CustomerDriver inside  com.greatlearning.corejava; package 

// Create various variables in class Customer of different access modifiers such as (private, public, protected) and initialize them with some values

// Try accessing and printing them in CustomerDriver class.


class Customer {
    public byte age=45;
    public String firstName ="Edward";
    public String lastName ="Snowden";
    private long bankBalance= 500000000L;
    private String password = "Bringmetolife";
    }
    
class CustomerDriver {
    public static void main(String[] args){
        Customer cstm = new Customer();
        System.out.println(cstm.age);
        System.out.println(cstm.firstName);
        System.out.println(cstm.lastName);
        /*System.out.println(Customer.bankBalance);
        will give compilation error as bank balance is private */
         
    }
}
