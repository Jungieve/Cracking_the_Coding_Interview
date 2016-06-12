package Array_String;

/**
 * Created by root on 2016/6/12.
 */
public class Transform {
    public int[][] transformImage(int[][] mat, int n) {
        // write code here
        if(mat == null)	return null;
        //对角线翻转
        for(int i = 0 ;i<n;i++)
            for(int j = 0;j<i;j++)
                swap(i,j,j,i,mat);
        //左右翻转
        for(int i = 0 ;i<n;i++)
            for(int j = 0;j<=n/2-1;j++)
                swap(i,j,i,n-1-j,mat);
        return mat;

    }
    public void swap(int i,int j ,int i2,int j2,int[][] mat){
        if(mat[i][j] == mat[i2][j2])	return;
        mat[i][j] = mat[i][j]^mat[i2][j2];
        mat[i2][j2] = mat[i][j]^mat[i2][j2];
        mat[i][j] = mat[i][j]^mat[i2][j2];
    }
}