import java.util.*;
public class SelectionSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n,i,j,s,t;
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
		s=i;
		for(j=i+1;j<n;j++)
		{
		if(a[j]<a[s])
		s=j;
		}
		t=a[i];
		a[i]=a[s];
		a[s]=t;
		}
		System.out.println("the sorted array is:");
		for(i=0;i<n;i++)
		{
		System.out.println(a[i]);
		}

		

	}

}
