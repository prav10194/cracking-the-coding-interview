package StringsAndArrays;

public class urlify {

    public static char[] url(char[] word, int truelength){
        int spaceCount = 0;
        for(int i=0; i<truelength; i++){
            if(word[i] == ' '){
                spaceCount++;
            }
        }
        int index = truelength + spaceCount*2;
        if(truelength < word.length){
            word[truelength] = '\0';
        }
        for(int i=index; i>=0; i--){
            if(word[i] == ' '){
                word[index-1] = '0';
                word[index-2] = '2';
                word[index-3] = '%';
                index = index - 3;
            } else {
                word[index-1] = word[i-1];
            }
        }

        return word;
    }

    public static void main(String[] args){
        url("Mr John Smith ".toCharArray(), 13);
    }

}