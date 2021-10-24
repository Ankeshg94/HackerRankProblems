package com.ankesh.learning;

/*
Find No of Substring occurrences in a given String

Sample Input
ABCDCDC
CDC

Sample Output
2

 */
public class FindSubstring {


    static int findSubstringOccurrences(String str, String subStr) {

        int j = 0;
        int matchingTracker = 0;
        int count = 0;
        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == subStr.charAt(j)) {
                matchingTracker = 0;
                j++;
            } else {
                matchingTracker++;
            }

            if (matchingTracker == 0 && j == subStr.length()) {
                count++;
                if (i != str.length()) i--;
                j = 0;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        //System.out.println(findSubstringOccurrences("CDCABCDCDCCDC","CDC"));

        String a = "11", b = "1";

        int i = a.length() - 1, j = b.length() - 1;
        int sum = 0;
        String result = "";

        while (i >= 0 || j >= 0) {
            sum += i >= 0 ? a.charAt(i) : 0;
            sum += j >= 0 ? b.charAt(j) : 0;

            if (sum % 2 != 0) {
                result = "1" + result;
            } else {
                result = "0" + result;
            }

            sum /= 2;
            i--;
            j--;
        }


    }
}
