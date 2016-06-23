package proxy;

public class Demo {

	public static void main(String[] args) {
		 String filename = "image.jpg";
		 ProxyImage proxy;
		 proxy = new ProxyImage(filename);
		 proxy.display();
		 proxy.display();

	}

}
