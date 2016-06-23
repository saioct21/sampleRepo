package flyweight;
import java.util.HashMap;

public class FlyweightShape {

	public static final HashMap<String,Shape> circlehash = new HashMap<String,Shape>();

	public static Shape getCircle(String color)
	{
		Circle circle;
		circle = (Circle)circlehash.get(color);
		if (circle==null)
		{
			circle = new Circle(color);
			circlehash.put(color, circle);
			System.out.println("Circle of color "+color+" created");
		}
		return circle;
	}
}
