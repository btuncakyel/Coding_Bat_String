package String;

public class deFront {

    //Given a string, return a version without the first 2 chars.
    // Except keep the first char if it is 'a' and keep the second char if it is 'b'.
    // The string may be any length. Harder than it looks.

    public String deFront(String str) {

        if(str.startsWith("ab")){
            return str;


        }if(str.startsWith("a") && str.charAt(1) != 'b' ){

            return str.charAt(0) + str.substring(2);
        }
        if(str.charAt(1) == 'b' && str.charAt(0) != 'a' ){

            return str.substring(1);
        }

        else{
            return str.substring(2);
        }

    }
}
