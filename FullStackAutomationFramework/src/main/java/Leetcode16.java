import java.util.Arrays;

public class Leetcode16 {
        public static void main(String[] args) {

            String  arr[] =  {"--X","X++","X++"};
            System.out.println(finalValueAfterOperations(arr));
        }
        public static int finalValueAfterOperations(String[] operations) {
        int x = 0;
        String decr = "--X";
        String decr2 = "X--";
        String incr = "++X";
        String incr1 = "X++";
        for(int i=0; i<operations.length; i++){
            if(operations[i].equals(incr) || operations[i].equals(incr1)){
                x++;
            }
            else x--;
        }
        return x;
    }
    }

