public class Leetcode19 {
    public static void main(String[] args) {
        int num = 7;
        System.out.println(numberOfMatches(num));
    }

    public static int numberOfMatches(int n) {
        int match = 0;
        while(n>=2){
            if(n%2!=0){
                match+=(n-1)/2+1;
                n/=2;
            }
            else{
                match+=n/2;
                n/=2;
            }
        }
        return match;
    }
}
