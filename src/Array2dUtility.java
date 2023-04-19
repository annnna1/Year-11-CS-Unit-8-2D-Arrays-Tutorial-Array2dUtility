public class Array2dUtility {

    // Declare all methods as static.

    // 1. print
    // Implement a method called print that prints out the values of a 2D array of integers row by row.
    public static void print(int[][] array)
    {
        for(int row = 0 ; row < array.length ; row++)
        {
            for(int col = 0 ; col < array[row].length ; col ++)
            {
                System.out.print(array[row][col]);
            }
            System.out.println();
        }
    }
    // 2. sum
    // Implement a method called sum that returns the sum of a 2D array of integers
    public static int sum (int[][] array)
    {
        int sum = 0;
        for(int row = 0 ; row < array.length ; row++)
        {
            for(int col = 0 ; col < array[row].length ; col ++)
            {
                sum += array[row][col];
            }
        }
        return sum;
    }
    // 3. average
    // Implement a method called average that returns the average value of a 2D array of integers.
    // You may assume that the 2D array is a square. That is, it has the same number of rows and columns.
    // Reminder: call your sum method within the average method.
    public static double average(int[][] array)
    {
        double elements = array.length*array.length;
        return ((double)sum(array)/elements);
    }
    // 4. minimum
    // Implement a method called minimum that returns the minimum value of a 2D array of integers.
    public static int minimum (int[][] array)
    {
        int min = array[0][0];
        for(int row = 0 ; row < array.length ; row++)
        {
            for(int col = 0 ; col < array[row].length ; col ++)
            {
                if(min > array[row][col])
                {
                    min = array[row][col];
                }
            }
        }
        return min;
    }
    // 5. maximum
    // Implement a method called maximum that returns the maximum value of a 2D array of integers.
    public static int maximum (int[][] array)
    {
        int max = array[0][0];
        for(int row = 0 ; row < array.length ; row++)
        {
            for(int col = 0 ; col < array[row].length ; col ++)
            {
                if(max < array[row][col])
                {
                    max = array[row][col];
                }
            }
        }
        return max;
    }
    // 6. evenCountStandard
    // Implement a method called evenCountStandard that returns the number of even numbers in a 2D array of integers.
    // Use a standard for loop to implement this method.
    public static int evenCountStandard(int[][] array)
    {
        int evenCount = 0;
        for(int row = 0 ; row < array.length ; row++)
        {
            for(int col = 0 ; col < array[row].length ; col ++)
            {
                if(array[row][col]%2==0)
                {
                    evenCount++;
                }
            }
        }
        return evenCount;
    }
    // 7. evenCountEnhanced
    // Implement a method called evenCountEnhanced that returns the number of even numbers in a 2D array of integers.
    // Use an enhanced for loop to implement this method.
    public static int evenCountEnhanced(int[][] array)
    {
        int evenCount = 0;
        for(int[] row : array)
        {
            for(int col : row)
            {
                if(col%2==0)
                {
                    evenCount++;
                }
            }
        }
        return evenCount;
    }

    // 8. allPositive
    // Implement a method called allPositive that returns true if all the values in a 2D array of integers are positive.
    public static boolean allPositive(int[][] array)
    {
        boolean allPositive = true;
        for(int[] row : array)
        {
            for(int col : row)
            {
                    if(col<=0)
                        allPositive = false;
            }
        }
        return allPositive;
    }
    // 9. rowSums
    // Implement a method called rowSums that returns a one dimensional array that contains the sum of each row at each index.
    public static int[] rowSums(int[][] array)
    {
        int[] sumArray = new int[array.length];
        for(int row = 0 ; row < array.length ; row++)
        {
            int sum = 0;
            for(int col = 0 ; col < array[row].length ; col ++)
            {
                sum += array[row][col];
            }
            sumArray[row] = sum;
        }
        return sumArray;
    }
    // 10. colSums
    // Implement a method called colSums that returns a one dimensional array that contains the sum of each col at each index.
    public static int[] colSums(int[][] array)
    {
        int[] sumArray = new int[array.length];
        for(int col = 0 ; col < array[0].length ; col++)
        {
            int sum = 0;
            for(int row = 0; row < array.length ; row ++)
            {
                sum += array[row][col];
            }
            sumArray[col] = sum;
        }
        return sumArray;
    }
}
