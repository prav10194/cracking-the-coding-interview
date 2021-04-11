package StringsAndArrays;

public class permutation {

    public static boolean isPermutation(String firstWord, String secondWord){
        if(firstWord.length() != secondWord.length()){
            return false;
        } else {
            int[] characterMap = new int[256];
            for(int i=0; i<firstWord.length(); i++){
                int ch = (int)firstWord.charAt(i);
                characterMap[ch] = characterMap[ch] + 1;
            }

            for(int i=0; i<secondWord.length(); i++){
                int ch = (int)secondWord.charAt(i);
                if(characterMap[ch] == 0){
                    return false;
                } else {
                    characterMap[ch] = characterMap[ch] - 1;
                    if(i == secondWord.length()-1){
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String firstWord = "delhi";
        String secondWord = "ihlde";
        System.out.println(isPermutation(firstWord, secondWord));
    }

}