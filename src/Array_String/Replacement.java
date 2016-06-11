package Array_String;

/**
 * Created by ZihanCong on 16/6/12.
 */
public class Replacement {
    public String replaceSpace(String iniString, int length) {
        // write code here
        if(iniString == null)
            return null;
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i<length;i++){
            char t = iniString.charAt(i);
            if(t == ' ')
                sb.append("%20");
            else
                sb.append(t);
        }
        return sb.toString();
    }
}