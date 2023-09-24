package task;

public class task3 {

	public static void main(String[] args) {
		int a=62, b=7;
		int d,q;
		if(b!=0)
		{
			d=a%10;
			q=a/10;
			
			d=d*10;
			a=d+q;
			
			a=a+1;
			b=b-1;
		}
       System.out.println(a);
	}

}
