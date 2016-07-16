package Bit;

/**
 * Created by root on 2016/7/16.
 */
public class CloseNumber {
    public int[] getCloseNumber(int x) {
        // write code here
        int[] result = new int[2];
        result[0] = getSmaller(x);
        result[1] = getLarger(x);
        return result;
    }
    public int getLarger(int x){
        //拖尾0的个数
        int c0 = 0;
        //拖尾0之前连续的1的个数
        int c1 = 0;
        int c = x;
        //计算c0
        while(((c & 1)==0) && c!=0){
            c0++;
            c >>= 1;
        }
        //计算c1
        while(((c & 1)==1) && c!=0){
            c1++;
            c >>= 1;
        }
        // x + (1<<c0)将p右边清零
        // (1<<(c1-1))-1 补齐c1-1右边为1
        return x + (1<<c0) + (1<<(c1-1))-1;
    }

    public int getSmaller(int x){
        //拖尾1之前连续的0的个数
        int c0 = 0;
        //拖尾1的个数
        int c1 = 0;
        int c = x;
        //计算c0
        while(((c & 1)==1) && c!=0){
            c1++;
            c >>= 1;
        }
        //计算c1
        while(((c & 1)==0) && c!=0){
            c0++;
            c >>= 1;
        }
        // x + (1<<c0)将p右边清零
        // (1<<(c1-1))-1 补齐c1-1右边为1
        return x - (1<<c1) - (1<<(c0-1))+1;
    }
}
