public class Leetcode24 {
    public static void main(String[] args) {
        System.out.println(reverse(123));
    }
        public static int reverse(int x) {
            if(x==Integer.MIN_VALUE){
                return 0;
            }
            if (x < 0) {
                return -reverse(-x);
            }

            long reversed = 0;
            while (x > 0) {
                reversed = reversed * 10 + x % 10;
                x /= 10;
            }

            if (reversed > Integer.MAX_VALUE) {
                return 0;
            }

            return (int) reversed;
        }
    }
