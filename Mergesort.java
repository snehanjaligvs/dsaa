public class Mergesort {
	public static void merge(int arr[], int i, int j, int mid) {
		int result[] = new int[j-i+1];
		int k = i;
		int l = mid+1;
		int x=0;
		while(k<=mid && l<=j) {
			if(arr[k]<arr[l]) {
				result[x] = arr[k];
				x++;
				k++;
			}
			else {
				result[x] = arr[l];
				x++;
				l++;
			}
		}
		while(k<=mid) {
			result[x] = arr[k];
			x++;
			k++;
			}
		while(l<=j) {
			result[x] = arr[l];
			x++;
			l++;
			
		}
		
		for(int a=0,b= i; a<result.length;a++, b++) {
			arr[b] = result[a];
		}
	}
	public static void divide(int arr[], int i, int j) {
		if(i>=j) {
			return ;
		}
		int mid = i+(j-i)/2;
		divide(arr, i, mid);
		divide(arr, mid+1, j);
		merge(arr, i, j, mid);
			
		
			}
   public static void main(String[] args) {
		int arr[] = {20, 1, 5, 3, 9};
		int n = arr.length;
		divide(arr, 0, n-1);
		System.out.println("the sorted array is :");
		for(int a=0; a<n;a++) {
			System.out.println(arr[a]);
		}

	}

}
