import java.util.Arrays;

public class driver {
  public static void main(String[] args) {
    int[][] ary = new int[5][5];
    System.out.println("Empty array should be initialized to 0: " + Arrays.deepToString(ary));
    System.out.println("Row sum of a new array's row should be 0: " + ArrayMethods.rowSum(ary, 2));
    for (int i = 0; i < ary[0].length; ++i)
      ary[0][i] = 5;
    System.out.println("Row sum of row with five 5s should 25: " + ArrayMethods.rowSum(ary, 0));
    System.out.println();

    //Testing columnSum()
    ary[0][2] = 4;
    ary[1][2] = 10;
    ary[2][2] = -5;
    ary[3][2] = -15;
    ary[4][2] = 20;
    System.out.println("Just to see what's changed: " + Arrays.deepToString(ary));
    System.out.println("Column sum of column 2 is 4 + 10 - 5 - 15 + 20 is 14: " + ArrayMethods.columnSum(ary, 2));
    System.out.println();

    //Testing allRowSums()
    System.out.println("As of now, the rowSums should be [24, 10, -5, -15, and 20]: " + Arrays.toString(ArrayMethods.allRowSums(ary)));
    //Testing allColSums()
    System.out.println("As of now, the columnSums should be [5, 5, 14, 5, and 5]: " + Arrays.toString(ArrayMethods.allColSums(ary)));
    System.out.println();

    //Testing isRowMagic()
    System.out.println("Shouldn't be magic yet: " + ArrayMethods.isRowMagic(ary));
    int[][] ary2 = new int[5][];
    ary2[0] = new int[]{1, 14};
    ary2[1] = new int[]{1, 2, 12};
    ary2[2] = new int[]{1, 2, 3, 4, 5};
    ary2[3] = new int[]{1, 2, 3, 9};
    ary2[4] = new int[]{15};

    System.out.println("Let's make a magic-row arr: " + Arrays.deepToString(ary2));
    System.out.println("Is it magic now? " + ArrayMethods.isRowMagic(ary2));
    System.out.println();

    System.out.println("Just to verify rowSum works with non-rectangular arrays: " + ArrayMethods.rowSum(ary2, 1));
    System.out.println("Same with columnSum: " + ArrayMethods.columnSum(ary2, 2));
    System.out.println("Again, just for fun: " + ArrayMethods.columnSum(ary2, 3));
    System.out.println();

    //Testing isColumnMagic()
    System.out.println("Columns shouldn't be magic yet: " + ArrayMethods.isColumnMagic(ary));
    int[][] ary3 = new int[4][];
    ary3[0] = new int[]{1, 2};
    ary3[1] = new int[]{1, 1, 0};
    ary3[2] = new int[]{1, 1, 3, 4, 4};
    ary3[3] = new int[]{1, 0, 1, 0};

    System.out.println("But now it should be, with this array: " + Arrays.deepToString(ary3));
    System.out.println("Is it magic-column now? " + ArrayMethods.isColumnMagic(ary3));
  }
}
