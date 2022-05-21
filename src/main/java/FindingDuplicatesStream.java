import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;


public class FindingDuplicatesStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//10,15,8,49,25,98,98,32,15
		// duplicate values in list 
		List<Integer> l=Arrays.asList(10,15,8,49,25,98,98,32,15);
		//l.stream().map(null);
		Set<Integer> results =l.stream().filter(x->Collections.frequency(l, x)>1).collect(Collectors.toSet());
		results.forEach(System.out::println);
		//l.stream().
	}

}
