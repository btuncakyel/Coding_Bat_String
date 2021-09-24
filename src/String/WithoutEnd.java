package String;

public class WithoutEnd {
    /*

Given a string, return a version without the first and last char,
so "Hello" yields "ell". The string length will be at least 2.

     */

    public String withoutEnd(String str) {

        String str1 = str.substring(1,str.length()-1);
        return str1;

    }

}
