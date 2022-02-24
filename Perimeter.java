class Perimeter
{
	int length;
	int breadth;

// default constructor below

	perimeter()
	{
		length = 0;
		breadth = 0;
	}
// parameterised constructor
	perimeter(int l, int b)
	{
		length = l;
		breadth = b;
	}

	void cal_perimeter()
	{
		int peri;
		peri = 2*(length+breadth);
		System.out.println(“The perimeter of the rectangle is” + peri);
	}
}

public class ConstExample {
	public static void main(String[] args){
	perimeter p1 = new perimeter(); 
	// invokes default constructor
	perimeter p2 = new perimeter(25,100);
	// invokes parameterised constructor
	p1.cal_perimeter;
	p2.cal_perimeter;
	}
}
