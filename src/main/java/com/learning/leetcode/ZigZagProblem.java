package com.learning.leetcode;

public class ZigZagProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String convert=convert("PAYPALISHIRING",3);
		System.out.println(convert);

	}
	
	  public static String convert(String s, int numRows) {
	        String s1=new String();
	        System.out.println("length is "+s.length());
	        for(int i=0;i<numRows;numRows--){
	            s1=s1+s.charAt(i);
	            int rem=s.length()/numRows;
	            int count=i;int d=rem;
	            while(d>0){
	                count=rem+count;
	                if(count<s.length()) {
	                s1=s1+s.charAt(count);
	                }
	                d--;
	            }
	            i++;
	        }
	        return s1;
	    }
	

}
