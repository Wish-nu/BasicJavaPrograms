/*Write a program in java to exploit constructor overloading. (cube and cuboid volume calculation)

i) Create a class ThreeDimensionShape with three variables  width, height, depth of type double;
ii) Create three constructors 
Doesn’t accepts any parameter
Accepts 1 parameter of type double(length)
Accepts 3 parameters of type double(width, height, depth)
iii) Create a method volume of return type double that returns a product of width, height, and depth.

iv) in case of No argument constructor make length=width=depth = 0;
v) in case of 1 argument constructor make length=width=depth = value passed;
*/


class ThreeDShape {
    double width;
    double height;
    double depth;

    // constructor with no parameters

    ThreeDShape() {
        width = height = depth =0;
    }

    //constructor with three parameters
    ThreeDShape(double w,double h, double d){
        width = w;
        height = h;
        depth = d;
    }

    //constructor with one parameter
    ThreeDShape(double length){

        width = height = depth = length;
    }

    //method for volume calculation
    double volume(){
        return width*height*depth;
    }


}
public class Main{
    public static void main(String[] args){
        ThreeDShape s1 = new ThreeDShape();
        ThreeDShape s2 = new ThreeDShape(3,5,8);
        ThreeDShape s3 = new ThreeDShape(7);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3); 
        
        double volume;
        
        volume = s1.volume();   //when volume is 0
        System.out.println("volume of shape1 is " + volume);
        
        volume = s2.volume();   //when volume is 3,5,8
        System.out.println("volume of shape2 is " + volume);
        
        
        volume = s3.volume();   //when volume is 7
        System.out.println("volume of shape3 is " + volume);
        
    }
}
