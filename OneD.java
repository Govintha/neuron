import java.util.Arrays;
import java.util.Scanner;

public class OneD {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the number");
		 int n=sc.nextInt();
		 
		 int a[]=new int[n];
		 int b[]= {1,2,3}; //explicit data given 
		 
		// int a[]=new int[4]; explicit size of array given	
		// int a[]=new int[] {1,2,3,4}; explicit data given 
		 
		 //Get data from user;
		 System.out.println(a.length);
		 for(int i=0;i<a.length;i++) {
			 a[i]=sc.nextInt();
		 }
		
		  //Retrieve Data 
		 
		 for(int i=0;i<a.length;i++) {
			 System.out.print(a[i]+" ");
		 }
		 
		 //By using for-each 
		 
		 System.out.println("\n"+"For eachLoop");
		 
		 for(int f:a) {
			 System.out.print(f+" ");
		 }
		 
		 //By using toString
		 System.out.println("\n"+"By using toString");
		 System.out.println(Arrays.toString(a));
		 
		 System.out.println("\n"+"Compare two Array");
        System.out.println(Arrays.equals(a, b));
	}

}
