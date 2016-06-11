package Array_String;

/**
 * Created by ZihanCong on 16/6/12.
 */

/**
 * 请实现一个算法，确定一个字符串的所有字符是否全都不同。这里我们要求不允许使用额外的存储结构。
 给定一个string iniString，请返回一个bool值,True代表所有字符全都不同，False代表存在相同的字符。保证字符串中的字符为ASCII字符。字符串的长度小于等于3000。
 */
public class Different {
    public boolean checkDifferent(String iniString) {
        if (iniString == null)
            return true;
        int len = iniString.length();
        for (int i = 0; i < len - 1; i++) {
            if (iniString.indexOf(iniString.charAt(i), i + 1) > 0)
                return false;
        }
        return true;
    }
}