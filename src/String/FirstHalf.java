package String;

public class FirstHalf {
    /*

Given a string of even length, return the first half.
 So the string "WooHoo" yields "Woo".

     */
    public String firstHalf(String str) {

        if(str.length() % 2 ==0){
            String half =str.substring(0,str.length()/2);
            return half;

        }
        return str;
    }

}
