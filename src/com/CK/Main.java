package com.CK;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }
}

class Solution {
    public String convertToBase7(int num) {
        return num < 0 ? "-" + convertToBase7NonNeg(-num) :
                convertToBase7NonNeg(num);
    }

    private String convertToBase7NonNeg(int num){
        if (0 <= num && num < 7)
            return String.valueOf(num);

        int divider = num / 7, remaining = num - divider * 7;
        return convertToBase7NonNeg(divider) + remaining;
    }
}