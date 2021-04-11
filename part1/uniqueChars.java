package StringsAndArrays;

public class uniqueChars {

    public static void main(String[] args){
        String wordfalse = "HelloWorld";
        String wordtrue = "HeloWrd";
        Boolean[] characterMap = new Boolean[256];

        for(int i=0; i<wordtrue.length(); i++){
            
            int ascii = (int)wordtrue.charAt(i);

            if(characterMap[ascii] != null){
                System.out.println("Duplicate charcater found");
                break;
            } else {
                characterMap[ascii] = false;
                if(i == wordtrue.length()-1){
                    System.out.println("String is unique");
                }
            }
        }
    }

    

    // for(int i=0; i<wordfalse.length; i++){
    //     if(characterMap)
    // }

}