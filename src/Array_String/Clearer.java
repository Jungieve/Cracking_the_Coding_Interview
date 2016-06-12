package Array_String;

/**
 * Created by root on 2016/6/12.
 */
import java.util.*;

public class Clearer {
    public int[][] clearZero(int[][] mat, int n) {
        // write code here
        boolean[] row = new boolean[n];
        boolean[] column = new boolean[n];
        //扫描含有0的行与列
        for(int i = 0;i<n;i++)
            for(int j = 0;j<n;j++)
                if(mat[i][j] == 0){
                    row[i] = true;
                    column[j] = true;
                }
        //重扫描并清除
        for(int i = 0;i<n;i++)
            for(int j = 0;j<n;j++)
                if(row[i] || column[j])
                    mat[i][j] = 0;
        return mat;
    }
}