package com.borokali.challenges;

/**
 * Print duplicate characters from a string
 */
public class FindDuplicateChars {
    public static void main(String[] args) {
        String input = "Hello world";
        char[] inputChar=input.toCharArray();
        for(int i=0; i< inputChar.length; i++){
            int count=1;
            for(int j=i+1; j<inputChar.length; j++){
                if(inputChar[i] == inputChar[j] && inputChar[i] != ' '){
                    count++;
                    inputChar[j]='0';
                }
            }
            if(count >1 && inputChar[i] !='0')
                System.out.println(inputChar[i]);
        }
    }
}
