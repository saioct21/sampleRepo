package proxy;

public class RealImage implements Image{
//from vignesh in proxy file
	String filename;
	public RealImage(String filename)
	{
		this.filename= filename;
		loadfromdisk(filename);
	}
	private void loadfromdisk(String name) {
		System.out.println("The file "+name+" is loaded from disk");
		
	}
	@Override
	public void display() {
		System.out.println("The file "+filename+" is displayed");
	}
}
