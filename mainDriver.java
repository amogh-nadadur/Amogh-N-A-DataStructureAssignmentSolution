package assignment3;
import java.util.*;
public class Driver {

	public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter total no. of floors in building");
     int m = sc.nextInt();
     int arr[] = new int[m];
     int k=1;
     for(int i=0;i<m;i++)
     {
    	 System.out.println("enter floor size given on day :" + k);
    	 arr[i] = sc.nextInt();
    	 k++;
     }
     
     Floors obj = new Floors();
     System.out.println("The order of construction is as follows");
     
     obj.Implementation(arr , m);
    
     
	}

}