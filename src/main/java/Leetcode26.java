public class Leetcode26 {
    public static void main(String[] args) {
        System.out.println(addDigits(38));
    }
        public static int addDigits(int num) {
            if(num == 0) return 0;
            else if(num % 9 == 0) return 9;
            else return num % 9;
        }
}
