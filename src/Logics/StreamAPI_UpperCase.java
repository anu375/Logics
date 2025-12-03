package Logics;

import java.util.List;
import java.util.ArrayList;

public class StreamAPI_UpperCase 
{

	public static void main(String[] args) 
	{
		String str = "Welcome To Class";
				
		List<String> list = new ArrayList<String>();
		list.add(str);
		
		list.stream()
		.map((i)->{return i.toUpperCase();})
		.forEach((i)->{System.out.println(i);});
	}

}
