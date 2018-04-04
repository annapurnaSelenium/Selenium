package practies;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {

	public static void main(String[] args)
	{
		
List<String>  s=new ArrayList<>();
//adding
s.add("Selenium");
s.add("QTP");
s.add("ETL");
s.add("vasu");
s.add("Qedge");
System.out.println(s.size());
for (int i = 0; i <s.size(); i++)
{
	System.out.println(s.get(i));
}
	}

}
