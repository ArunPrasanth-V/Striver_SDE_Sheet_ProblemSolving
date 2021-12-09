public class MyClass {
    public static void main(String args[]) {
      int a[][]={{0,1,2,0},{3,4,5,2},{1,3,1,5}};
      setZeroes(a);
    }
public static void setZeroes(int[][] matrix) {
    
        int row=matrix.length,col=matrix[0].length;
 System.out.println(row);
 System.out.println(col);
     int row1[]=new int[row];
   
        for(int i=0;i<row;i++)
            row1[i]=1;
     int col1[]=new int[col];
        for(int i=0;i<row;i++)
           col1[i]=1;
           
  
 for(int i=0;i<row;i++)
  {
      for(int j=0;j<col;j++)
      {
          if(matrix[i][j]==0)
          {
              System.out.println("i--"+i+"  j-- "+j);
              row1[i]=0;
              col1[j]=0;
          }
      }
  }
     
     for(int i=0;i<row1.length;i++)
     {
         if(row1[i]==0)
         {
             int m=0;
             while(m<row1.length)
             {
                 matrix[m][i]=0;
                 m++;
             }
         }
     }
     for(int i=0;i<col1.length;i++)
     {
         if(col1[i]==0)
         {
             int m=0;
             while(m<row1.length )
             {
                 matrix[i][m]=0;
                 m++;
             }
         }
     }
            
       
       
    
    for(int i=0;i<row;i++){
        for(int j=0;j<col;j++)
           System.out.print(matrix[i][j]);
           System.out.println();}
}
}
