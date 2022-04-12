
// 2. move zeros to end in linear TC and single pass.
class PushZeroen{

    public static void pushZerosToEnd(int arr[], int n)
    {
        int count = 0;  

        for (int i = 0; i < n; i++)
            if (arr[i] != 0)
                arr[count++] = arr[i]; 
                                       
 
        while (count < n)
            arr[count++] = 0;
    }
 
    public static void main (String[] args)
    {
        int arr[] = {1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9};
        int n = arr.length;
        pushZerosToEnd(arr, n);
        System.out.println("Array after pushing zeros to the back: ");
        for (int i=0; i<n; i++)
            System.out.print(arr[i]+" ");
    }
}
// 3. Sort 0s 1s 2s in linear TC
class sortzero{
    public static void sort012(int a[], int arr_size)
    {
        int lo = 0;
        int hi = arr_size - 1;
        int mid = 0, temp = 0;
        while (mid <= hi) {
            switch (a[mid]) {
            case 0: {
                temp = a[lo];
                a[lo] = a[mid];
                a[mid] = temp;
                lo++;
                mid++;
                break;
            }
            case 1:
                mid++;
                break;
            case 2: {
                temp = a[mid];
                a[mid] = a[hi];
                a[hi] = temp;
                hi--;
                break;
            }
            }
        }
    }

    static void printArray(int arr[], int arr_size)
    {
        int i;
        for (i = 0; i < arr_size; i++)
            System.out.print(arr[i] + " ");
        System.out.println("");
    }
 
    
    public static void main(String[] args)
    {
        int arr[] = { 0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1 };
        int arr_size = arr.length;
        sort012(arr, arr_size);
        System.out.println("Array after seggregation ");
        printArray(arr, arr_size);
    }
}
//4. Find if a given String is Palindrome or not in 2 pointer approach"
class palindrom{
    public static int longestPalindrome(final String str) {
		int length = str.length();
		int [][] L = new int[length][length];

		for (int i = 0; i < length; i ++) {
			for (int j = 0; j < length; j++) {
			
				L[i][j] = (i == j) ? 1 : -1;
			}
		}

		int subStrLength = 2;
	
		while (subStrLength <= length) {
		
			for (int i = 0; i < length - subStrLength + 1; i++) {
				int j = i + subStrLength - 1; 
				if ((subStrLength == 2 || L[i+1][j-1] != -1) && 
					
						str.charAt(i) == str.charAt(j)) {
					
					L[i][j] = L[i+1][j-1] + 2;
				}
				else {
					L[i][j] = -1;
				}
			}
			
			subStrLength++;
		}
		return max(L);
	}
}