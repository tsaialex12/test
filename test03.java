package test;

interface IArea {
	void area();
}

class Circle implements IArea {
	private double r;

//建構子
	public Circle(double r) {
		this.r = r;
	}

	public void area() {
		System.out.append("圓形面積:" + 31416 * r * r);
	}
}

class Rectangle implements IArea {
	private double width;// 寬
	private double height;// 高
//建構子

public Rectangle(double a,double b) {
width=a;
height=b;

	public void area() {
		System.out.print("長方形面積:" + height * width * height);
	}

}

class Triangle implements IArea {
	private double height; // 高
	private double bottom;// 三角形底長

//建構子
public Triangle(double a,double b) {
height=a;
bottom=b;

	public void area() {
	System.out.print("三角形面積:"+(bottom*height)/2);
	}
}

public class test03 {

	public static void main(String[] args) {
// TODO Auto-generated method stub
		IArea a;
		Circle c = new Circle(6.0);
		Rectangle r = new Rectangle(10.0, 15.0);
		Triangle t = new Triangle(20.0, 15.0);
		for (int i = 1; i <= 3; i++) {
			if (i == 1)
				a = c; // 圓形
			else if (i == 2)
				a = r; // 長方形
			else
				a = t;// 三角形
			a.area();
		}
	}

}
