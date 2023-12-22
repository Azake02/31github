public class Leetcode18 {
    public static void main(String[] args) {
        String word = "USA";
        System.out.println(detectCapitalUse(word));
    }
        public static boolean detectCapitalUse(String word) {
            int c=0;
            for(int i=0;i<word.length();i++){
                if(Character.isUpperCase(word.charAt(i))){
                    c++;
                }
            }
            if(c==word.length() || c==0){
                return true;
            }
            if(c==1 && Character.isUpperCase(word.charAt(0))){
                return true;
            }
            return false;
        }
    }

