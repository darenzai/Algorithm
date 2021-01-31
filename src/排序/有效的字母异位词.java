package 排序;

import java.util.Arrays;


public class 有效的字母异位词 {


        Boolean isAnagram(String s, String t) {
            if (s.length() != t.length()) {
                return false;
            }
            char [] s1=s.toCharArray();
            char [] t1=t.toCharArray();
            return Arrays.equals(s1,t1);

        }

    public static void main(String[] args) {
        有效的字母异位词 s=new 有效的字母异位词();
        System.out.println(s.isAnagram("123","112"));
    }
    }


