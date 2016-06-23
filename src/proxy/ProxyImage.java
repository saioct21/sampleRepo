package proxy;

public class ProxyImage implements Image{

	RealImage real;
	String filename;
	public ProxyImage(String filename)
	{
		this.filename = filename;
	}
	@Override
	public void display() {
		if (real == null)
		{
			real = new RealImage(filename);
		}
		real.display();
	}

}
