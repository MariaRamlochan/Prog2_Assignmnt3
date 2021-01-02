package assignment3;
import java.util.Arrays;

/**
 * Variety of different methods for a 2D array
 * 
 * @author maria ramlochan
 */
public class Assignment3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double[] nums = {10,11,12};
        double[][] numss = {{1,2,3}, {4,5,6}, {7,8,9}};
        double[][] numss1 = {{1,2,3}, {4,5,6}, {7,8,9}};
        double[][] numss2 = {{11,21,31}, {41,51,61}, {20,30,40}};
        String str = "maria";
        String[] strs = {"aiden", "maria"};
        String[][] strss = {{"aiden"}, {"maria"}, {"samuel"}};
        
        System.out.println("Sum: " + sum(numss));
        System.out.println("SumRow: " + Arrays.toString(sumRow(numss)));
        System.out.println("SumColumn: " + Arrays.toString(sumColumn(numss)));
        System.out.println("Avg: " + avg(numss));
        System.out.println("AvgRow: " + Arrays.toString(avgRow(numss)));
        System.out.println("AvgColumn: " + Arrays.toString(avgColumn(numss)));
        System.out.println("MaxValue: " + maxValue(numss));
        System.out.println("MaxValueRow: " + Arrays.toString(maxValueRow(numss)));
        System.out.println("MaxValueColumn: " + Arrays.toString(maxValueColumn(numss)));
        System.out.println("CountVowels: " + countVowels(str));
        System.out.println("CountVowels1D: " + countVowels1D(strs));
        System.out.println("CountVowels2D: " + countVowels2D(strss));
        System.out.println("AddNum: " + Arrays.deepToString(addNum(numss, 1)));
        System.out.println("Add2D " + Arrays.deepToString(add2D(numss1, numss2, 3, 1)));
        System.out.println("Append1D " + Arrays.deepToString(append1D(numss, nums)));
        System.out.println("AppendUnder " + Arrays.deepToString(appendUnder(numss1,
                numss2)));
        System.out.println("AppendRight " + Arrays.deepToString(appendRight(numss1,
                numss2)));
    }
    
    /**
     * Method to calculate the sum of all numbers in a 2D array
     * @param numss numbers in a 2D array
     * @return the sum of all numbers
     */
    public static double sum(double[][] numss) {
        double sum = 0;
        for(double[] nums : numss)
            for(double num : nums)
                sum += num;
        return sum;
    }
    
    /**
     * Method to calculate the sum of a row in a 2D array
     * @param numss numbers in a 2D array
     * @return the sum of the row of a 2D array
     */
    public static double[] sumRow(double[][] numss) {
        double[] sumRow = new double[numss.length];
        for(int i = 0; i < numss.length; i++)
            for(double nums : numss[i])
                sumRow[i] += nums;
        return sumRow;
    }
    
    /**
     * Method to calculate the sum of a column in a 2D array
     * @param numss numbers in a 2D array
     * @return the sum of the column of a 2D array
     */
    public static double[] sumColumn(double[][] numss) {
        double[] sumColumn = new double[numss.length];
        for(int i = 0; i < numss.length; i++)
            for(int j = 0; j < numss[i].length; j++)
                sumColumn[i] += numss[j][i];
        return sumColumn;
    }
    
    /**
     * Method to calculate the average in a 2D array
     * @param numss numbers in a 2D array
     * @return the average of all numbers in a 2D array
     */
    public static double avg(double[][] numss) {
        return sum(numss) / numss.length;
    }
    
    /**
     * Method to calculate the average of a row in a 2D array
     * @param numss numbers in a 2D array
     * @return the average of a row in a 2D array
     */
    public static double[] avgRow(double[][] numss) {
        double[] avgRow = new double[numss.length];
        for(int i = 0; i < numss.length; i++)
            avgRow[i] = sumRow(numss)[i] / numss[i].length;
        return avgRow;

    }
    
    /**
     * Method to calculate the average of a column of a 2D array
     * @param numss numbers in a 2D array
     * @return the average of a column in a 2D array
     */
    public static double[] avgColumn(double[][] numss) {
        double[] avgColumn = new double[numss.length];
        for(double[] nums : numss)
            for(int j = 0; j < nums.length; j++)
                avgColumn[j] = sumColumn(numss)[j] / numss.length;
        return avgColumn;
    }
    
    /**
     * Method to get the maximum value in a 2D array
     * @param numss numbers in a 2D array
     * @return the maximum value in a 2D array
     */
    public static double maxValue(double[][] numss) {
        double maxValue = Double.NEGATIVE_INFINITY;
        for(double[] nums : numss)
            for(double num : nums)
                if(num > maxValue)
                    maxValue = num;
        return maxValue;
    }
    
    /**
     * Method to get the maximum value in a row in a 2D array
     * @param numss numbers in a 2D array
     * @return the maximum value in a row in a 2D array
     */
    public static double[] maxValueRow(double[][] numss) {
        double[] maxValueRow = new double[numss.length];
        double max = Double.NEGATIVE_INFINITY;
        for(int i = 0; i < numss.length; i++) {
            for(double nums : numss[i])
                if(nums > max)
                    max = nums;
            maxValueRow[i] = max;
        }
        return maxValueRow;
    }
    
    /**
     * Method to get the maximum value in a column in a 2D array
     * @param numss numbers in a 2D array
     * @return the maximum value in a column in a 2D array
     */
    public static double[] maxValueColumn(double[][] numss) {
        double[] maxValueColumn = new double[numss.length];
        double max = Double.NEGATIVE_INFINITY;
        for(int i = 0; i < numss.length; i++) {
            for(int j = 0; j < numss[i].length; j++)
                if(numss[j][i] > max)
                    max = numss[j][i];
            maxValueColumn[i] = max;
        }
        return maxValueColumn;
    }
    
    /**
     * Method to count the number of vowels in a String
     * @param str String
     * @return number of vowels in a String
     */
    public static int countVowels(String str) {
        int countVowels = 0;
        for(int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
                countVowels++;
        }
        return countVowels;
    }
    
    /**
     * Method to count the number of vowels in a 1D String array
     * @param strs string in a 1D array
     * @return the number of vowels in a 1D String array
     */
    public static int countVowels1D(String[] strs) {
        int countVowels1D = 0;
        for(String str : strs)
            countVowels1D += countVowels(str);
        return countVowels1D;
    }
    
    /**
     * Method to count the number of vowels in a 2D String array
     * @param strss Strings in a 2D array
     * @return the number of vowels in a 2D String array
     */
    public static int countVowels2D(String[][] strss) {
        int countVovels2D = 0;
        for(String[] strs : strss) {
            countVowels1D(strs);
            countVovels2D += countVowels1D(strs);
        }
        return countVovels2D;  
    }
    
    /**
     * Method to add a number to each element of a 2D double array
     * @param numss numbers in a 2D array
     * @param num the number to increase each element of the 2D array
     * @return a new array with the increased value
     */
    public static double[][] addNum(double[][] numss, double num) {
        double[][] newNumss = new double[numss.length][numss[1].length];
        for(int i = 0; i < numss.length; i++)
            for(int j = 0; j < numss[i].length; j++)
                newNumss[i][j] = numss[i][j] + num;
        return newNumss;
    }
    
    /**
     * Method to append a 1d double array to a 2d double array as a new row
     * @param numss1 numbers in a first 2D array
     * @param numss2 numbers in a second 2D array
     * @param rows location of the row
     * @param cols location of the column
     * @return a new array
     */
    public static double[][] add2D(double[][] numss1, double[][] numss2, int rows, 
            int cols) {
        double[][] newArray = new double[rows][cols];
        for(int i = 0; i < rows; i++)
            for(int j = 0; j < cols; j++) 
                newArray[i][j] = numss1[i][j] + numss1[i][j];
        return newArray;
    }
    
    /**
     * Method to add two 2d double arrays
     * @param numss numbers in a 2D array
     * @param nums numbers in a 1D array
     * @return a new array
     */
    public static double[][] append1D(double[][] numss, double[] nums) {
        double[][] newArray = new double[numss.length + 1][];
        for(int i = 0; i < numss.length; i++) {
            newArray[i] = new double[numss[i].length];
            System.arraycopy(numss[i], 0, newArray[i], 0, numss[i].length);
        }
        newArray[numss.length] = new double[nums.length];
        System.arraycopy(nums, 0, newArray[numss.length], 0, nums.length);
        return newArray;
    }
    
    /**
     * Method to append a 2d double array at the right of another 2d double array
     * @param numss1 numbers in a first 2D array
     * @param numss2 numbers in a second 2D array
     * @return a new array
     */
    public static double[][] appendUnder(double[][] numss1, double[][] numss2) {
        double[][] newArray = new double[numss1.length + numss2.length][];
        System.arraycopy(numss1, 0, newArray, 0, numss1.length);
        System.arraycopy(numss2, 0, newArray, numss1.length, numss2.length);
        return newArray;
    }
    
    /**
     * Method to append a 2d double array at the right of another 2d double array
     * @param numss1 numbers in a first 2D array
     * @param numss2 numbers in a second 2D array
     * @return a new array
     */
    public static double[][] appendRight(double[][] numss1, double[][] numss2) {
        double[][] newArray = new double[Math.max(numss1.length, numss2.length)][];
        for (int i = 0; i < newArray.length; i++) {
            double[] newRow = new double[numss1[i].length + numss2[i].length];
            System.arraycopy(numss1[i], 0, newRow, 0, numss1[i].length);
            System.arraycopy(numss2[i], 0, newRow, numss1[i].length, numss2[i].length);
            newArray[i] = newRow;
        }
        return newArray;
    }
    
    /**
     * Method to remove a row from a 2d double array
     * @param numss the numbers in a 2D array
     * @param idx the index to indicate which element will be deleted
     * @return a new array
     */
    public static double[][] removeRow(double[][] numss, int idx) {
        double[][] newArray = new double[numss.length - 1][numss[0].length];
        int result = 0;
        for(double[] nums : numss) {
            if (nums[0] == idx)
                System.arraycopy(nums, 0, newArray[result], 0, nums.length);
            result++;
        }
        return newArray;
    }
    
}
