package com.practice.ex2;

/**
 * 자바로 NPE 를 다루는 3가지 샘플
 * 아래 3가지 방법을 코틀린으로 다루는 것을 목적으로 만듦
 */
public class ex2JavaSample {

    public static void main(String[] args) {
    }

    public boolean startsWithASample1(String str) {
        if (str == null) {
            throw new IllegalArgumentException("null 예외 처리");
        }

        return str.startsWith("A");
    }

    public Boolean startsWithASample2(String str) {
        if (str == null) {
            return null;
        }

        return str.startsWith("A");
    }

    public boolean startsWithASample3(String str) {
        if (str == null) {
            return false;
        }

        return str.startsWith("A");
    }
}
