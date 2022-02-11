import java.lang.*;
import java.util.*;
public class FindFirstRepetitiveCharacter{
public static void main(String args[]){
String x="abaca";

List<Character> list=new ArrayList<Character>();
for(int i=0;i<x.length();i++){
if(list.contains(x.charAt(i))){

System.out.println("first repetitive  character "+x.charAt(i));
break;
}
list.add(x.charAt(i)); 
}
}
}
