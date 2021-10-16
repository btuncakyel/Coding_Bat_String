package String;

public class conCat {


    //Given two strings, append them together (known as "concatenation")
    // and return the result. However, if the concatenation creates a double-char,
    // then omit one of the chars, so "abc" and "cat" yields "abcat".


    public String conCat(String a, String b) {
        if(b.length() == 0){
            return a;
        }
        else if(a.length() == 0){
            return b;
        }
        else if (a.charAt(a.length()-1) != b.charAt(0)){
            return a + b;
        }
        else {
            return a + b.substring(1);
        }

    }
}
