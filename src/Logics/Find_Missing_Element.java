package Logics;

import java.util.List;
import java.util.ArrayList;

public class Find_Missing_Element
{

	public static void main(String[] args) 
	{
		List<Integer>list = new ArrayList<Integer>();
		
		list.add(1);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(8);
		list.add(15);
		
		System.out.println(list);
		
		
		for(int i=list.get(0);i<=list.get(list.size()-1);i++)
		{
			if(!list.contains(i))
			{
				System.out.println(i);
			}
		}
	}

}
