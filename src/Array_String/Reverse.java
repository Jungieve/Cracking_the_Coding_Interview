package Array_String;

/**
 * Created by ZihanCong on 16/6/12.
 */
import java.util.*;

public class Reverse {
    public String reverseString(String iniString) {
        if(iniString == null)
            return null;
        // write code here
        char arr[] = iniString.toCharArray();
        for(int i = 0;i<=arr.length/2-1;i++)
        {
            char temp = arr[arr.length-1-i];
            arr[arr.length-1-i] = arr[i];
            arr[i] = temp;
        }
        return new String(arr);
    }
}