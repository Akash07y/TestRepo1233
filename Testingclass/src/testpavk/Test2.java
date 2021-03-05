package testpavk;

public class Test2  <D>  {
	
	public <V> void test(V x ) 
	{
		System.out.println(x);
		
	}
	
	public static void main(String[] args) {
		
		int a = 20;
		String d = "Class";
		float f = 67.87f;
		
		Test2<Integer> o = new Test2<Integer>();
		
		
		o.test(a);
		
		o.test(d);
		
		o.test(f);
		
	}


}
	
//   < >