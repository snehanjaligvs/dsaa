import java.util.*;
public class BubbleSort {

	public static void main(String[] args) {
		
		int n,i,j,t;
		Scanner sc = new Scanner(System.in);
		System.out.println("read n ");
		n = sc.nextInt();
		int a[] = new int[n];
		System.out.println("enter the array elements ");
		for(i=0;i<n;i++)
		{
		  a[i] = sc.nextInt();
		}
		for(i=0;i<n-1;i++)
		{
		for(j=0;j<n-i-1;j++)
		{
		if(a[j]>a[j+1])
		{
		   t=a[j];
		a[j]=a[j+1];
		a[j+1]=t;
		}
		}
		}
		System.out.println("the sorted array is: ");
		for(i=0;i<n;i++)
		{
		System.out.println(a[i]);
		}

	}

}



