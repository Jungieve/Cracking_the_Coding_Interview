package Array_String;

/**
 * Created by ZihanCong on 16/6/12.
 */
public class Same {
    public boolean checkSam(String stringA, String stringB) {
        // write code here
        if(stringA == null){
            if(stringB == null)
                return true;
            else
                return false;
        }
        if(stringA.length() != stringB.length())
            return false;
        int temp[] = new int[256];
        for(int i = 0;i<stringA.length();i++){
            temp[stringA.charAt(i)]++;
            temp[stringB.charAt(i)]--;
        }
        for(int i = 0;i<256;i++){
            if(temp[i]!=0)
                return false;
        }
        return true;

    }
}