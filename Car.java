// object and class example: main outside the class using car example

class Car{
    int regNo;
    String name;
}

public class Sedan{
    public static void main(String args[]) {
      Car x1 = new Car();
      System.out.println(x1.regNo);
      System.out.println(x1.name);
    }
}
