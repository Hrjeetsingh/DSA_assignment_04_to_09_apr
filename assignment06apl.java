
//  1. Merge two sorted Arrays without extra space. 
//  a[] = {1,3,5,7}
//  b[] = {2,4,6,8}
class merge{
    public static void main(String[] args) {
        int arr1[] = {1,3,5,7};
        int n1=arr1.length;
        int arr2[] = {2,4,6,8};
        int n2=arr2.length;
        int arr3[]=new int[n1+n2];
        mergeArrays(arr1,arr2,n1,n2,arr3);
    }
    public static void mergeArrays(int[] vec1, int[] vec2, int n1,
        int n2, int[] vec3) {
        int i = 0, j = 0, k = 0;
        while (i < n1 && j < n2) {
          if (vec1[i] < vec2[j])
            vec3[k++] = vec1[i++];
          else
            vec3[k++] = vec2[j++];
        }
        while (i < n1)
          vec3[k++] = vec1[i++];
        while (j < n2)
          vec3[k++] = vec2[j++];
    }
}


//2. Find the index of a row containing the maximum number of 1’s in a binary matrix

class Main
{
    public static int findRowIndex(int[][] mat)
    {
        // base case
        if (mat == null || mat.length == 0) {
            return 0;
        }
 
        int row = -1;
        int i = 0, j = mat[0].length - 1;
 
        while (i <= mat.length - 1 && j >= 0)
        {
            
            if (mat[i][j] == 1)
            {
                j--;
                row = i;  
            }
        
            else {
                i++;
            }
        }
        return row + 1;
    }
 
    public static void main(String[] args)
    {
        int[][] mat =
        {
            { 0, 0, 0, 1, 1 },
            { 0, 0, 1, 1, 1 },
            { 0, 0, 0, 0, 0 },
            { 0, 1, 1, 1, 1 },
            { 0, 0, 0, 0, 1 }
        };
 
        int rowIndex = findRowIndex(mat);
 
        
        if (rowIndex != 0) {
            System.out.print("The maximum 1's are present in the row " + rowIndex);
        }
    }
}

//  3. Find the transpose of a given matrix. 
//  Transpose Matrix is formed by changing all the row elements to column elements and vice -versa
// Java Program to find
// transpose of a matrix

class tpmatrix{
	static final int N = 3;
	static final int m = 2;
	
	
	static void transpose(int A[][])
	{
		for (int i = 0; i < N; i++)
			for (int j = i+1; j < m; j++)
			{
				int temp = A[i][j];
				A[i][j] = A[j][i];
				A[j][i] = temp;
			}
	}

	public static void main (String[] args)
	{
		int A[][] = { {1, 1, 1, 1},
					{2, 2, 2, 2},
					{3, 3, 3, 3},
					{4, 4, 4, 4}};
		
		transpose(A);
	
		System.out.print("Modified matrix is \n");
		for (int i = 0; i < N; i++)
		{
			for (int j = 0; j < m; j++)
			System.out.print(A[i][j] + " ");
			System.out.print("\n");
		}
	}
}



