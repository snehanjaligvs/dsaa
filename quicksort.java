public class quicksort{
public static void qsort1(int arr[],int small, int big)
{
    if(small>=big) {
		return;
	}

    int i = small;
    int j = big;
    int pivot = arr[i];
    while(i<=j) {
    	while(arr[i]<pivot) {
    		i++;
    	}
    	while(arr[j]>pivot){
    		j--;
    	}
    	if(i<=j) {
    		swap(arr, i, j);
    		i++;
    		j--;
    	}
    }
    qsort1(arr, small, j);
    qsort1(arr, i, big);
}
  public static void swap(int arr[],int i, int j)
	{
	int temp = arr[i];
	arr[i] = arr[j];
	arr[j] = temp;
	}
	public static void main(String args[])
	{
	int arr[] = {3, 1, 7, 2, 10, 5};
	System.out.println("elements before sorting");
	for (int i = 0; i < arr.length;i++)
	{
	System.out.println(arr[i]);
	}
	 
	qsort1(arr,0,arr.length-1);
	System.out.println("elements after sorting using quick sort");
	for (int i = 0;i < arr.length;i++)
	{
	System.out.println(arr[i]);
	}
	}
	}