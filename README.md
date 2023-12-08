# 31github

For 31 days I'm gonna work on my gitHub and programming skills

# day1

This project will include the preparation for the MAANG companies by solving Leetcode tasks with explanation

# day2

Today I've installed terminal

# day3

I've uploaded code

# day4

I'm solving some tasks in Leetcode and here is my code:
class Solution {
public boolean isPalindrome(int x) {
int temp=0;
int reverse =0;
int num2 = x;
if(x>=0){
while(x>0){
temp=x%10;
reverse = reverse\*10+temp;
x=x/10;
temp=0;
}
if(reverse==num2){
return true;
}

# day6
I've started implement my automation framework and I will improve it everyday


# day7
It throws an exception and I am trying to fix it. As soon I will fix it, will redeploy
}
return false;
}
}

(![Leetcode img](%D0%BB%D0%B8%D1%82%D0%BA%D0%BE%D0%B4.png))

# day8 I've uploaded leetcode task here and I'm still working on my automation framework
class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String  str1=new String ();
        String  str2=new String ();
        for(int i=0;i<word1.length;i++){
            str1 +=word1[i];
        }
        for(int i=0;i<word2.length;i++){
            str2 +=word2[i];
        }
        if(str1.equals(str2)){
            return true;
        }else{
            return false;
        }
    }
}

# day9 I've pushed my framework and now I will solve Leetcode task. Also I've started reading the book "Грокаем алгоритмы"
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int j=0;
        for(int i=m;i<nums1.length;i++){
             nums1[i]=nums2[j];

# day10 I'm gonna push my framework and 1 task from Leetcode

             class Solution {
    public int countCharacters(String[] words, String chars) {
        int k=0;
        for(int i=0;i<words.length;i++){
            char ch[]=words[i].toCharArray(),mh[]=chars.toCharArray();
            int v=0;
            for(int l=0;l<words[i].length();l++)
            {
            for(int j=0;j<chars.length();j++){
              if(ch[l]==mh[j]){
                  mh[j]='0';
              v++;
                break;
              }
            }
            }
            if(v==words[i].length())
            k+=words[i].length();
        }
        return k;
    }
}
