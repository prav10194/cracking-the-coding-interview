package StringsAndArrays;

public class StringRotation {

    public static boolean isSubstring(String word, String subString){
        int index = 0;
        boolean flag = false;
        for(int i=0; i<word.length(); i++){
            if(flag){
                if(word.charAt(i) != subString.charAt(index)){
                    return false;
                } else {
                    index++;
                    if(index == subString.length()){
                        return true;
                    }
                }
            } else {
                if(word.charAt(i) == subString.charAt(index)){
                    flag = true;
                    index++;
                } 
            }
        }
        return false;
    }

    public static boolean checkRotation(String firstString, String secondString) {

        if(firstString.length() != secondString.length()){
            return false;
        } else {
            return isSubstring(firstString+firstString, secondString);
        }
    }

    public static void main(String[] args) {
        System.out.println(isSubstring("bhatia", "tia"));
    }

}