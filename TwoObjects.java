// object and class example: initialization through reference two objects

class Car{
    String regNo;
    String name;
}

public class Sedan{
    public static void main(String args[]) {
      Car x1 = new Car();
      Car z1 = new Car();
      x1.regNo = "KA-01-SM-1902";
      x1.name = "BMX X1";
      z1.regNo ="DL-01-MT-2291";
      z1.name = "Audi";
      System.out.println(x1.regNo + " " +x1.name);
      System.out.println(z1.regNo + " " +z1.name);
    }
}
