public class ArrayMethods{

   /*
   *PART 1
   */
   public static int rowSum(int[][] ary, int x){
     int sum = 0;
     for (int i=0; i < ary[x].length; i++){
       sum+=ary[x][i];
     }
     return sum;
   }
    //returns the sum of the elements in Row x of ary.

   public static int columnSum(int[][] ary, int x){
     int sum = 0;
     for (int i = 0; i < ary.length; i++){
       for (int z = 0; z < ary[i].length; z++){
         if (z == x) sum+=ary[i][z];
        }
      }
      return sum;
    }
    //returns the sum of the elements in Column x of ary (careful with rows of different lengths!).
   /*
   *PART 2 - use prior methods where appropriate
   */
   public static int[] allRowSums(int[][] ary){
     int sum[] = new int[ary.length];
     int rowSum = 0;
     for (int i = 0; i < ary.length; i++){
       for (int z = 0; z < ary[i].length; z++){
         rowSum+=ary[i][z];
        }
        sum[i] = rowSum;
        rowSum=0;
      }
      return sum;
   }
    //returns an array of the row sums for each row of ary.
    //Index i of the return array contains the sum of elements in row i.

    public static int[] allColSums(int[][] ary){}
    //Returns an array with the column sum of each column of ary.
    //When a row is not long enough to reach the column count it as a zero. (NO indexOutOfBounds should ever occur)
    //Index i of the return array contains the sum of elements in column i, ignoring any rows that are too short.
    //The length of the returned array should be the length of the LONGEST array in ary.


   /*
   *PART 3 - use prior methods where appropriate
   */
   public static boolean isRowMagic(int[][] ary){}
     //checks if the array is row-magic (this means that every row has the same row sum).

   public static boolean isColumnMagic(int[][] ary){}
    //checks if the array is column-magic (this means that every column has the same column sum).

}
