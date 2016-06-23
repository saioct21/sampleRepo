package flyweight;

public class Demo {
	private static final String colors[] = {"red","green","blue","yellow","brown"};
	public static void main(String[] args) {
		FlyweightShape shape = new FlyweightShape();
		for(int i=1;i<=100;i++)
		{
			Circle circle = (Circle)shape.getCircle(colors[(int)(Math.random()*colors.length)]);
			circle.setRadius((int)(Math.random()*100));
			circle.setX((int)(Math.random()*100));
			circle.setY((int)(Math.random()*100));
			circle.draw();
		}
		

	}

}
