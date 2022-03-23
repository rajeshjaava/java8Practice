
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=12345;
		//output : 54321
		int output=0;
		int rem;
		int result;
		while(a>0) {
			rem=a%10;
			a=a/10;
		//	System.out.print(rem);
			output=10*rem+output;
		}
		System.out.println(output);
	}

}

/*
output=0
output =5*10+0=50









output: 1

5*10-50
4->50+4;
->54*10+3
3->540+3
2
1
10*5 ->50
50*4
*/