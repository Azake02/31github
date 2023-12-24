public class Leetcode12 {
    public static void main(String[] args) {
        int n = 4;
        System.out.println(Fibonacci(n));
    }

   public static int Fibonacci(int n) {
            int sum = 0;
            int a = 0;
            int b = 1;
            if(n == 0){
                return 0;
            }
            if(n == 1){
                return 1;
            }
            for(int i = 2; i <= n; i++){
                sum = a + b;
                a = b;
                b = sum;
            }
            return sum;
        }
}
