class Solution {
    public int compress(char[] chars) {
        int n= chars.length;
        int k=0;

        for (int i=0;i<n;i++){
            char ch = chars[i];
            int count=0;

            while(i<n && chars[i]==ch){
                count++;
                i++;
            }
            i--;
            chars[k++]= ch;

            if (count>1){
                String s= ""+count;
                for (int j=0;j<s.length();j++){
                    chars[k++]=s.charAt(j);
                }
            }
        }
        return k;
    }
}