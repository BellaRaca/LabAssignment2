/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.io.*;
/**
 *
 * @author bellarao
 */


public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int[][] arr = new int[6][6];

        for (int x = 0; x < 6; x++) {
            String[] arrRowTempItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
            for (int y = 0; y < 6; y++) {
                int arrItem = Integer.parseInt(arrRowTempItems[y]);
                arr[x][y] = arrItem;
            }
        }

        bufferedReader.close();
        
        int answer = findMaxSum(arr);
        System.out.print(answer);
    }
    
    private static int findMaxSum(int[][]arr) {
        int row = arr.length;
        int col = arr[0].length;
        int currentMaxSum = -64;
        for (int x = 0; x < row - 2; x++) {
            for (int y = 0; y < col - 2; y++) {
                int currentSum = arr[x][y] + arr[x][y+1] + arr[x][y+2] + arr[x+1][y+1] + arr[x+2][y] + arr[x+2][y+1] + arr[x+2][y+2];
                if (currentSum > currentMaxSum) {
                    currentMaxSum = currentSum;
                }
            }
        }
        return currentMaxSum;
    }
}

