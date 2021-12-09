class Solution {
    public void setZeroes(int[][] matrix) {
        int col0=1,row=matrix.length,col=matrix[0].length;
        int copy[][]=new int[row][col];
        
        for(int i=0;i<row;i++)
        {
        for(int j=0;j<col;j++)
             copy[i][j]=matrix[i][j];
            
        }
  
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                if(matrix[i][j]==0)
                {
                     int m=0,n=0;
                    while(m<row)
                    {
                        copy[m][j]=0;
                        m++;
                    }
                    while(n<col)
                    {
                       
                       copy[i][n]=0;
                        n++;
                    }
                }
            }
            
        }
        for(int i=0;i<row;i++)
        {
        for(int j=0;j<col;j++)
             matrix[i][j]=copy[i][j];     
        }
    }
}
