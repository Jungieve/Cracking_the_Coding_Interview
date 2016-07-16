package Bit;

/**
 * Created by root on 2016/7/16.
 */
public class BinDecimal {
    public String printBin(double num) {
        // write code here
        StringBuffer result = new StringBuffer();
        result.append('0');
        result.append('.');
        for(int i = 0;i<32;i++){
            num *= 2;
            if(num >= 1){
                num -= 1;
                result.append('1');
            }
            else if(num == 0)
                break;
            else
                result.append('0');

        }
        return (num == 0)?result.toString():"Error";
    }
}
