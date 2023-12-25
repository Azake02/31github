import java.util.Arrays;

public class Leetcode21 {
    public static void main(String[] args) {

        int num = 6;
        System.out.println(Arrays.toString(sumZero(num)));
    }

        public static int[] sumZero(int n) {
            int[] answer = new int[n];
            for (int i = 1; i<n; i+=2) {
                answer[i-1]=i;
                answer[i]=-i;
            }
            return answer;
        }
    }


