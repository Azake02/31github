public class Leetcode23 {
    public static void main(String[] args) {
        int num = 9669;
        System.out.println(maximum69Number(num));
    }
        public static int maximum69Number (int num) {
            String str = String.valueOf(num);

            for(int i = 0; i < str.length(); i++) {
                if(str.charAt(i) == '6') {
                    str = str.substring(0, i) + "9" + str.substring(i+1);
                    break;
                }
            }

            return Integer.parseInt(str);

        }

}
