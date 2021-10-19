package String;

public class middleTwo {


        //Given a string of even length, return a string made of the middle two chars,
        // so the string "string" yields "ri". The string length will be at least 2.

        public String middleTwo(String str) {

            if(str.length() % 2 == 0){


            }
            String middle = str.substring(str.length()/2-1, str.length()/2+1);
            return middle;


        }

    }

