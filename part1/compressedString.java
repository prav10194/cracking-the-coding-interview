package StringsAndArrays;

public class compressedString {

    public static StringBuilder compressString(StringBuilder originalString) {

        int countCharacter = 0;
        StringBuilder newString = new StringBuilder();

        for(int i=1; i<originalString.length(); i++){
            if(originalString.charAt(i-1) == originalString.charAt(i)){
                countCharacter++;
                if(i == originalString.length()-1) {
                    newString.append(originalString.charAt(i-1));
                    newString.append(String.valueOf(countCharacter+1));
                }
            } else {
                newString.append(originalString.charAt(i-1));
                newString.append(String.valueOf(countCharacter+1));
                countCharacter = 0;
            }
        }

        return newString.length() < originalString.length() ? newString : originalString;
    }

    public static void main(String[] args) {
        System.out.println(compressString(new StringBuilder("aaaaabbccccddddaaa")));
    }

}