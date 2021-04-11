package StringsAndArrays;
import java.util.Arrays;

public class palindromePermutation {

    public static boolean isPalindromePermutation(String word){

        int[] characterCount = new int[256];
        int spaceCount = 0;
        for(char ch : word.toCharArray()){
            if(Character.toLowerCase(ch) != ' '){
                characterCount[(int)Character.toLowerCase(ch)]++;
            } else {
                spaceCount++;
            }
        }
        if((word.length()-spaceCount) % 2 ==0){
            for(int i=0; i<characterCount.length; i++){
                if(characterCount[i] % 2 != 0){
                    return false;
                }
            }
            return true;
        } else {
            int index = 0;
            for(int i=0; i<characterCount.length; i++){
                if(characterCount[i] % 2 != 0){
                    index++;
                }
            }
            if(index != 1){
                return false;
            }
            return true;
        }
    }

    public static void main(String[] args){
        System.out.println(isPalindromePermutation("Malayalam"));
    }

}