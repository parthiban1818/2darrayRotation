import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayRotation {

	public static void main(String[] args) throws IOException{ 
		    int a[][] = {{1,1,1,1},
		    		     {2,2,2,2},
		    		     {3,3,3,3},
		    		     {4,4,4,4}};
		    //transpose
		    for(int i=0;i<a.length;i++) {
		    	for(int j=i;j<a[i].length;j++) {
		    		int temp=a[i][j];
		    		a[i][j]=a[j][i];
		    		a[j][i]=temp;
		    	}
		    }
		    //reverse the columns
	          for(int i=0;i<a.length;i++) {
	        	  int first=0,last=a.length-1;
	        	  while(first<last) {
	        		  int temp=a[i][first];
	        		  a[i][first]=a[i][last];
	        		  a[i][last]=temp;
	        		  first++;
	        		  last--;
	        	  }
	          }
		    //output
		     for(int i=0;i<a.length;i++) {
		    	 for(int j=0;j<a[0].length;j++) {
		    		 System.out.print(a[i][j]+" ");
		    	 }
		    	 System.out.println();
		     }
		} 
}
