// object and class example: initialization through reference

class Car{
    String regNo;
    String name;
}

public class Sedan{
    public static void main(String args[]) {
      Car x1 = new Car();
      x1.regNo = "KA-01-SM-1902";
      x1.name = "BMX X1";
      System.out.println(x1.regNo + " " +x1.name);
    
    }
}
