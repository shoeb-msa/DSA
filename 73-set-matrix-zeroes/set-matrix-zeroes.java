class Solution {
    public void setZeroes(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int[][] arr = new int[n][m];
        for(int[] i:arr)
        {
        Arrays.fill(i,-1);
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(matrix[i][j]==0)
                {

                    for(int k=0;k<n;k++)
                    {
                        arr[k][j] = 0;
                    }


                    for(int k=0;k<m;k++)
                    {
                        arr[i][k] = 0;

                    }
                }
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(arr[i][j]== 0)
                {
                matrix[i][j] = arr[i][j];
                }
               
            }
        }
        
    }
}