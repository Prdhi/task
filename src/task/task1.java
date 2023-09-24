package task;

public class task1 {
public static void main(String[]args) {
	   int M=30;
	   int N=248;
	   int P=1;
	   while(N!=0) {
		   P=N%10;
		   M=M+N%P;
		   N=N/10;
	   }
	    System.out.println(M);
	   }
   }	   
	   

