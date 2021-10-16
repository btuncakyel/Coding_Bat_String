package String;

public class atFirst {

    //Given a string, return a string length 2 made of its first 2 chars.
    // If the string length is less than 2, use '@' for the missing chars.

    public String atFirst(String str) {

        if(str.length() >= 2){
            String firstTwo = str.substring(0,2);
            return firstTwo;

        }

        if(str.length() == 1){
            String withAt = str.substring(0,1) + "@";
            return withAt;
        }
        return "@@";

    }

}
