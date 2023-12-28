public class Leetcode30 {
    public static void main(String[] args) {
        System.out.println(findComplement(5));
    }
        public static int findComplement(int num) {
            String binaryString = Integer.toBinaryString(num);
            String res = "";
            for (int i = 0 ; i < binaryString.length() ; i++){
                if(binaryString.charAt(i) == '0'){
                    res += 1;
                }else{
                    res += 0;
                }
            }
            int result = Integer.parseInt(res,2);
            return result;
        }
}
