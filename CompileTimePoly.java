//COMPILE TIME POLYMORPHISM EXAMPLE

	class Add{
		//method with two parameter
		static int performAdd(int a, int b){
		return a+b;
		}

	//method with same name but different parameter
		static double performAdd(float a, double b){
		return a+b;
		}
}
class Main{
public static void main(String[] args){
Add a = new Add();
System.out.println(a.performAdd(7,3));
System.out.println(a.performAdd(3.5f,6.8d));
}	
}
