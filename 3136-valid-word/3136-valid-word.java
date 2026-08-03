class Solution {
    public boolean isValid(String word) {
        if (word.length()<3){
            return false;
        }
        boolean has_vowel= false;
        boolean has_consonant= false;

        for (int i=0;i<word.length();i++){
            char ch = word.charAt(i);
            if (Character.isLetter(ch)){
                ch = Character.toLowerCase(ch);
                if (ch=='a'|| ch=='e'|| ch=='i'||ch=='o'||ch=='u'){
                    has_vowel=true;
                }
                else{
                    has_consonant=true;
                }
            }
            else if (Character.isDigit(ch)){
                continue;
            }
            else {
                return false;
            }
        }
        return has_vowel && has_consonant;
    }
}