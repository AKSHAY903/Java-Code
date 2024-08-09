public class SumOfDiagonal {
    public static void main(String[] args) {
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        int row = 3;
        int col = 3;
        System.out.println("Printing Array Elements: ");
        for(int i=0;i<row;i++)
        {
           for(int j=0;j<col;j++)
           {
            System.out.print(arr[i][j]+" ");
           }
           System.out.println();
        }

        int sum = 0;
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                if(i==j)
                {
                    sum = sum+arr[i][j];
                }
            }
        }
        System.out.println("Sum of Digonal is: "+ sum);
    }
}
