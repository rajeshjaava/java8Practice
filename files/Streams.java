import java.util.*;
import java.lang.*;
public class Streams{
public static void main(String args[]){
System.out.println("streams test");
List<Integer> list=Arrays.asList(1,2,3,4,5,6);
System.out.println("count is "+list.stream().count());
System.out.println("count of list is "+list.stream().reduce(0,(subelement,total)->subelement+total));
System.out.println("values sum :"+list.stream().reduce(0,Integer::sum));
System.out.println("greater than threee   "+list.stream().filter(x->x>3).count());
}
}
