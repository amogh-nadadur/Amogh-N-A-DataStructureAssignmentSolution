package assignment3;
import java.util.Stack;
public class Floors {
    public void Implementation(int arr[] , int p )
    {
    	 Stack<Integer> stack = new Stack<Integer>();
         int curr=1;
         int temp = p;
         for(int i=0;i<temp;i++) {
        	 if(arr[i] == p && p>0)
        	 {
        		 System.out.print(" Day " + curr + " :" + p);
        		while(stack.contains(--p))
        		 {
        			 System.out.print(" " + stack.pop());
        		 }
        		System.out.println();
        	 }
        	 
        	 else {
        		 stack.push(arr[i]);
        			
        		 System.out.println(" Day " + curr);
        	 }
        	curr++;
         }
    }
}