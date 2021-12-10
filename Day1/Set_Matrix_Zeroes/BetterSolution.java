class Solution {
    public void setZeroes(int[][] arr) {
          
        
        
        int row=arr.length,col=arr[0].length;
        int arrrow[]=new int[row];
        //to all new row set as 1
        for(int i=0;i<row;i++)
            arrrow[i]=1;
        
        //to all new column set as 1
        int arrcol[]=new int[col];
        for(int i=0;i<col;i++)
            arrcol[i]=1;
            
            //to set 0 in new arr
            for(int i=0;i<row;i++)
            {
                for(int j=0;j<col;j++)
                {
                    if(arr[i][j]==0)
                    {
                        arrrow[i]=0;
                        arrcol[j]=0;
                    }
                }
            }
            
            
            
            
            
            //update that zero 
            //row checking update in colum 
            for(int i=0;i<row;i++)
            {
                if(arrrow[i]==0)
                {
                    for(int j=0;j<col;j++)
                     arr[i][j]=0;
                }
            }
            //for column checking update in column
            for(int i=0;i<col;i++)
            {
                if(arrcol[i]==0)
                {
                    for(int j=0;j<row;j++)
                    {
                        arr[j][i]=0;
                    }
                }
            }
            
        
        
    }
}
