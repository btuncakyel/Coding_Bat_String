package String;

public class NonStart {
    /*

Given 2 strings, return their concatenation, except omit the first char of each.
 The strings will be at least length 1.
     */

    public String nonStart(String a, String b) {
        String a1 = a.substring(1);
        String b1 = b.substring(1);
        return a1+b1;
    }

}
