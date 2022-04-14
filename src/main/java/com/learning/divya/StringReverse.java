package com.learning.divya;

public class StringReverse {
	
	public void stringreverse(String s1)
	{
		
		int strlength = s1.length();
		System.out.println(strlength);
		for(int i=strlength-1; i>=0;i--) 
		{
			System.out.print(s1.charAt(i));
			
		}


}
	public static void main(String args[])
	{
		String s= "divya is a good girl";
		StringReverse r = new StringReverse();
		r.stringreverse(s);
		
		/////StringBuffer/////////
		StringBuffer sb = new StringBuffer(s);
		StringBuffer s2 =sb.reverse();
		System.out.println(s2);
		
	}
}
