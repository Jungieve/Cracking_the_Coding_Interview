package Array_String;

/**
 * Created by root on 2016/6/12.
 */
import java.util.*;

public class Zipper {
    public String zipString(String iniString) {
        // write code here
        if(iniString == null && iniString.length()==0)
            return "";
        StringBuilder sb = new StringBuilder();
        char temp = iniString.charAt(0);
        int count = 0;
        boolean zipped = false;
        for(int i = 1;i<iniString.length();i++){
            if(iniString.charAt(i) == temp)
                count++;
            else{
                sb.append(temp);
                sb.append(count+1);
                temp = iniString.charAt(i);
                count = 0;
            }
            if(count > 1)
                zipped = true;
        }
        sb.append(temp);
        sb.append(count+1);
        return (zipped == true)?sb.toString():iniString;
    }
}