package methods;

import practies.vasu;

public class Vasu
{
public void add()
{
	int a=60,b=50;
	int c=a+b;
	System.out.println(c);
	
}
	public static void main(String[] args) 
	{
		LibraryFile v=new LibraryFile();
		v.applaunch("http://opensource.demo.orangehrmlive.com");
		v.applogin("Admin","admin");
	}

}
