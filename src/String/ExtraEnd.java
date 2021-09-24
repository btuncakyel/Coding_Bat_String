package String;

public class ExtraEnd {
    /*

Given a string, return a new string made of 3 copies of the last 2 chars of the original string.
The string length will be at least 2.
     */

    public String extraEnd(String str) {
        if(str.length() >2){
            String substring = str.substring(str.length()-2);
            return substring+substring+substring;
        }
        return str+str+str;
    }


}
