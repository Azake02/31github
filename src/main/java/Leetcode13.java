public class Leetcode13 {
//    # Write your MySQL query statement below
//    SELECT name, population, area
//    FROM world
//    WHERE area >= 3000000 OR population >= 25000000;

    public int numJewelsInStones(String jewels, String stones) {
        int count = 0;
        for (int i = 0; i < jewels.length(); i++) {
            for (int j = 0; j < stones.length(); j++) {
                if (jewels.charAt(i) == stones.charAt(j)) {
                    count++;
                }
            }

        }
        return count;
    }
}

