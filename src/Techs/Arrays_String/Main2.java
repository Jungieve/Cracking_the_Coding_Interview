package Techs.Arrays_String;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by root on 2016/9/10.
 */
public class Main2 {
    public String sort(String s){
        char[] content = s.toCharArray();
        Arrays.sort(content);
        return new String(content);
    }
    public boolean permutation(String s1,String s2){
        if(s1.length() != s2.length())
            return false;
       return sort(s1) == sort(s2);
    }

    //做法2 组成两个单词表进行判断每个字符出现的次数即可
    public boolean permutation2(String s1, String s2){
        if(s1.length() != s2.length())
            return false;
        int[] letters = new int[256];
        for(char c: s1.toCharArray())
            letters[c]++;
        for(char c: s2.toCharArray())
            letters[c]--;
        for(int i = 0;i<256;i++)
        {
            if (letters[i]!=0)
                return false;
        }
        return true;
    }
}
