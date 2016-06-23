package flyweight;

public class Circle implements Shape{

	String color;
	int x,y,radius;
	public Circle(String color)
	{
		this.color=color;
	}
	public void setX(int x)
	{
		this.x = x;
	}
	public void setY(int y)
	{
		this.y = y;
	}
	public void setRadius(int radius)
	{
		this.radius = radius;
	}
	@Override
	public void draw() {
		System.out.println("Circle is printed with color : "+color+" radius : "+radius+" X : "+x+" Y : "+y);
	}

}
