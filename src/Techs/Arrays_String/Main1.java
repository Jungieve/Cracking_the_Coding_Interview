package Techs.Arrays_String;

/**
 * Created by root on 2016/9/10.
 */
public class Main1 {
    public boolean isUniqueChars2(String str){
        if(str.length() > 256)  return false;
        boolean[] char_set = new boolean[256];
        for(int i = 0;i<str.length();i++){
            char t = str.charAt(i);
            if(char_set[t])
                return false;
            char_set[t] = true;
        }
        return true;
    }
    //如果字符串只含有小写字母a-z,采用bitmap的形式来代替数组
    public boolean isUniqueChars3(String str){
        if(str.length() > 256)  return false;
        int checker = 0;
        for(int i = 0;i<str.length();i++){
            char t = str.charAt(i);
            int val = t - 'a';
            if((checker & (1<<val))  == 1)
                return false;
            else
                checker |= (1<<val);
        }
        return true;
    }
}
