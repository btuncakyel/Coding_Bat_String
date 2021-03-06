package String;

public class minCat {

    //Given two strings, append them together (known as "concatenation")
    // and return the result. However, if the strings are different lengths,
    // omit chars from the longer string so it is the same length as the shorter string.
    // So "Hello" and "Hi" yield "loHi". The strings may be any length.

    public String minCat(String a, String b) {

        if(a.length() == b.length()){
            return a + b;
        }

        if(a.length() > b.length()){
            int difference = a.length() - b.length();
            return a.substring(difference, a.length()) + b;

        }else{

            int difference = b.length() - a.length();
            return a + b.substring(difference, b.length());

        }




    }
}
