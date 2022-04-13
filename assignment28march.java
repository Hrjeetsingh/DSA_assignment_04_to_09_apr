/*"1. WAP for searching a number using binary search. Return the index of the num if exists else return 
2. Find the cube root of a number using binary search
3. Find the intersection elements of two sorted arrays
A[] = { 3,6,8}   B[] ={1,2,3,5,6,90,789}
Output = 3,6"*/
  
  //"1. WAP for searching a number using binary search. Return the index of the num if exists else return 
class BinarySearch {
	int binarySearch(int arr[], int l, int r, int x)
	{
		if (r >= l) {
			int mid = l + (r - l) / 2;
			if (arr[mid] == x)
				return mid;
			if (arr[mid] > x)
				return binarySearch(arr, l, mid - 1, x);
			return binarySearch(arr, mid + 1, r, x);
		}
		return -1;
	}
	public static void main(String args[])
	{
		BinarySearch ob = new BinarySearch();
		int arr[] = { 2, 3, 4, 10, 40 };
		int n = arr.length;
		int x = 10;
		int result = ob.binarySearch(arr, 0, n - 1, x);
		if (result == -1)
			System.out.println("Element not present");
		else
			System.out.println("Element found at index "+ result);
	}
}

// Find the cube root of a number using binary search
class cuberoot{
	
	static double diff(double n,double mid)
	{
		if (n > (mid*mid*mid))
			return (n-(mid*mid*mid));
		else
			return ((mid*mid*mid) - n);
	}
	static double cubicRoot(double n){
		double start = 0, end = n;
		double e = 0.0000001;

		while (true)
		{
			double mid = (start + end)/2;
			double error = diff(n, mid);
			if (error <= e)
				return mid;

			if ((mid*mid*mid) > n)
				end = mid;

			else
				start = mid;
		}
	}
	
	
	public static void main (String[] args)
	{
		double n = 3;
		System.out.println("Cube root of "+n+" is "+cubicRoot(n));
	}
}
// Find the intersection elements of two sorted arrays.
public class Example {
   public static void main(String args[]) {
      int arr1[] =  { 3,6,8} ;
      int arr2[] = {1,2,3,5,6,90,789};
      int m = arr1.length;
      int n = arr2.length;
      int i = 0, j = 0;
      System.out.print("Array 1: ");
      for(int k = 0; k < m; k++) {
         System.out.print(arr1[k] + " "); 
      }
      System.out.print("\n");
      System.out.print("Array 2: ");
      for(int k = 0; k < n; k++) {
         System.out.print(arr2[k] + " ");
      }
      System.out.print("\n");
      System.out.print("Intersection of two arrays is: ");
      while (i < m && j < n) {
         if (arr1[i] < arr2[j])
            i++;
         else if (arr2[j] < arr1[i])
            j++;
         else {
            System.out.print(arr2[j++]+" ");
            i++; 
         }
      }
   }
}

  
  
