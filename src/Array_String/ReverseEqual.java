package Array_String;

/**
 * Created by root on 2016/6/12.
 */
import java.util.*;

public class ReverseEqual {
    public boolean checkReverseEqual(String s1, String s2) {
        // write code here
        if(s1 == null || s2 == null)	return false;
        if(s1.length() == 0 || s2.length() == 0)	return false;
        if(s1.length() != s2.length())	return false;
        String str = s2+ s2;
        return str.contains(s1);

    }
}