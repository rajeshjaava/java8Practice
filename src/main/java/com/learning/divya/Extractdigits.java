package com.learning.divya;

public class Extractdigits {
	
	public void printintegers(String s) {
		s=s.replaceAll("[^\\d]", " ");
		s=s.trim();
		s=s.replaceAll(" +"," ");
		System.out.println("extracted digits are " +s);
		
		
		
	}
	public int findwhat(String s) {
		//char[] c=s.toCharArray();
		int a1=0; int d1=0;int sc=0; int sp=0;
		System.out.println(s.length());
		
		for(int i=0; i<=s.length(); i++)
			
		{
			if(s.isEmpty())
			{
				System.out.println("Empty string");
			}
			if(Character.isAlphabetic(s.charAt(i)))
			{
				a1=a1+1;
			}
			else if(Character.isDigit(s.charAt(i))) {
				
				d1=d1+1;
				
				
			}
			else if(Character.isSpaceChar(s.charAt(i)))
			{
				sp=sp+1;
				
			}
			else
			{
				sc=sc+1;
						
			}

			return a1;
			
			
		}
	

		
	}
	public static void main(String args[]) {
		String s = "#asr144dsfs4545 &&HHHh123b4 ";
		Extractdigits e = new Extractdigits();
		e.printintegers(s);
		e.findwhat(s);
		String r ;
		String r1 = new String(s);

		System.out.println("alphabet count is "+ a1);
		System.out.println("digit count is "+ d1);
		System.out.println("space count is "+ sp);
		System.out.println("special character count is"+ sc);
		
		
		System.out.println("value is" +r1);
		
	}

}
