class Solution {
    public String capitalizeTitle(String title) {
        String [] arr= title.split(" ");
        for (int i=0;i<arr.length;i++){
            String word=arr[i].toLowerCase();
            if (word.length()<=2){
                arr[i]=word;
            }else{
                char ch = word.charAt(0);
                ch= Character.toUpperCase(ch);
                arr[i]= ch+word.substring(1);
            }
            
        }
        return String.join(" ",arr);
    }
}