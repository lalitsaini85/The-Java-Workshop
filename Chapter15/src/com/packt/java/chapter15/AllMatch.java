package com.packt.java.chapter15;

import java.util.stream.Stream;

public class AllMatch {

    public static void main(String[] args) {

        boolean matched = Stream.of(6, 3, 8, 12, 3, 9).allMatch((e) -> { return e > 10; });
        System.out.println(matched);

    }

}
