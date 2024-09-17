package com.anonymous.demo;

public class Demo {
	public static void main(String[] args)
	{
		Trial obj = new Trial()
				{
					public void show()
					{
						System.out.print("this is anonymous");
					}
				};
				obj.show();
	}
}
