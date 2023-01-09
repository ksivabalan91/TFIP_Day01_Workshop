// java -cp classes day01 DotProduct 4 3
// enter three numbers (1): 1 2 3
// enter three numbers (2): 1 2 3
// enter three numbers (3): 1 2 3
// enter three numbers (4): 1 2 3
// enter the weights 3no.: 3 2 1
// perform Dot.Product calculation and print out the 4 values
// can be any size array, doesnt have to be 4x3.
// look at documentation in string.split() to extract numbers

package day01Workshop;

import java.io.Console;
import java.util.Arrays;

public class DotProduct {
    public static void main(String[] args) {
        
        Console cons= System.console();
        
        int totalrows = Integer.parseInt(args[0]);
        int totalcols = Integer.parseInt(args[1]);
        System.out.printf("no of rows: %d\nno of columns: %d\n",totalrows,totalcols);
        
        // initialize arrays to store matrices
        Integer[][] mat = new Integer[totalrows][totalcols];
        Integer[] weight = new Integer[totalcols];

        for (int i = 0; i<totalrows;i++){
     
            String row = cons.readLine("\nrow %d, Enter %d numbers: ",i+1,totalcols);
            // split input string into array
            String[] splitrow = row.trim().split(" ",totalcols); 
            // convert each string into int
            for (int j =0; j<splitrow.length;j++){
                mat[i][j]=Integer.parseInt(splitrow[j]);
            }

        }

        String WeightInput = cons.readLine("\nWeight: Enter %d numbers ",totalcols);
        String[] splitweight = WeightInput.trim().split(" ",totalcols);
        for (int i =0; i<splitweight.length;i++){
            weight[i]=Integer.parseInt(splitweight[i]);
        }

        System.out.printf("Matrix:\n");
        for (int k=0;k<mat.length;k++){
            System.out.println(Arrays.toString(mat[k]));            
        }
        System.out.printf("Weight:\n");
        System.out.println(Arrays.toString(weight));
    
        // mathematics

        int[] ans = new int[totalrows];

        for(int j=0;j<mat.length;j++){
            int sum = 0;
            for(int k=0;k<mat[0].length;k++){
                // System.out.printf("%d. mat: %d * wt: %d\n",ans[i],mat[j][k],weight[k]);
                sum += mat[j][k]*weight[k];
            }
                ans[j]=sum;
        }
        
        System.out.printf("The Dot product is:\n");
        System.out.println(Arrays.toString(ans));


    }
    
}

