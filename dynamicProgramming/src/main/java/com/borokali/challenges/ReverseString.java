package com.borokali.challenges;

import java.util.Collections;
import java.util.stream.Collectors;

public class ReverseString {
    public static void main(String[] args) {
        String str="hello";
        String res = str.chars()
                .mapToObj(c -> (char)c)
                .collect(Collectors.collectingAndThen(Collectors.toList(),
                        lst -> {
                            Collections.reverse(lst);
                            return lst.stream();
                        }
                        ))
                .map(String::valueOf)
                .collect(Collectors.joining());
        System.out.println("Reversed:"+res);
    }
}
