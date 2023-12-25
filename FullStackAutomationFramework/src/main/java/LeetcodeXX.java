public class LeetcodeXX {
    public static void main(String[] args) {
        System.out.println(climbStairs(2));
    }
        public static int climbStairs(int n) {
            int sum = 0;
            int a = 0;
            int b = 1;
            if(n == 0){
                return 0;
            }
            if(n == 1){
                return 1;
            }
            for(int i = 1; i <= n; i++){
                sum = a + b;
                a = b;
                b = sum;
            }
            return sum;
    }

}
