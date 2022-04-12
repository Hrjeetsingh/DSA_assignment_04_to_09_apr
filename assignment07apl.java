import java.util.*;

//"1. Print the matrix in the spiral form
//a[][] =  
//{1,2,3,4}
//{5,6,7,8},
//{9,10,11,12},
//{13,14,15,16}
class spiraloo {
 
    
    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<Integer>();
 
        if (matrix.length == 0)
            return ans;
 
        int R = matrix.length, C = matrix[0].length;
        boolean[][] seen = new boolean[R][C];
        int[] dr = { 0, 1, 0, -1 };
        int[] dc = { 1, 0, -1, 0 };
        int r = 0, c = 0, di = 0;
 
      
        for (int i = 0; i < R * C; i++) {
            ans.add(matrix[r]);
            seen[r] = true;
            int cr = r + dr[di];
            int cc = c + dc[di];
 
            if (0 <= cr && cr < R && 0 <= cc && cc < C
                    && !seen[cr][cc]) {
                r = cr;
                c = cc;
            } else {
                di = (di + 1) % 4;
                r += dr[di];
                c += dc[di];
            }
        }
        return ans;
    }
 
   
    public static void main(String[] args) {
        int a[][] = {{1,2,3,4},
                    {5,6,7,8},
                    {9,10,11,12},
                    {13,14,15,16}};
 
        System.out.println(spiralOrder(a));
    }
}

//  . Given a boolean matrix mat[M][N] of size M X N, 
//  modify it such that if a matrix cell mat[i][j] is 1 (or true) then make all the cells of ith row and jth column as 1.

class boolianmatrix{
	public static void modifyMatrix(int mat[ ][ ], int R, int C)
	{
		int row[ ]= new int [R];
		int col[ ]= new int [C];
		int i, j;
	
	
		for (i = 0; i < R; i++)
		{
		row[i] = 0;
		}

		for (i = 0; i < C; i++)
		{
		col[i] = 0;
		}

		for (i = 0; i < R; i++)
		{
			for (j = 0; j < C; j++)
			{
				if (mat[i][j] == 1)
				{
					row[i] = 1;
					col[j] = 1;
				}
			}
		}
	
		for (i = 0; i < R; i++)
		{
			for (j = 0; j < C; j++)
			{
				if ( row[i] == 1 || col[j] == 1 )
				{
					mat[i][j] = 1;
				}
			}
		}
	}

	
	public static void printMatrix(int mat[ ][ ], int R, int C)
	{
		int i, j;
		for (i = 0; i < R; i++)
		{
			for (j = 0; j < C; j++)
			{
				System.out.print(mat[i][j]+ " ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args)
	{
		int mat[ ][ ] = { {1, 0, 0, 1},
						{0, 0, 1, 0},
						{0, 0, 0, 0},};
					
				System.out.println("Matrix Initially");
				
				printMatrix(mat, 3, 4);
			
				modifyMatrix(mat, 3, 4);
				System.out.println("Matrix after modification n");
				printMatrix(mat, 3, 4);
			
	}

}



