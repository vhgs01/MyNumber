package br.com.hugo.victor.mynumber.utils;

public class Convertor {

    public static String convertToNumber(String input) {

        if (input.equals("-")) {
            return "-";
        }
        if (input.equals("1")) {
            return "1";
        }
        if (input.equals("0")) {
            return "0";
        }
        if (input.toUpperCase().equals("A") | input.toUpperCase().equals("B") | input.toUpperCase().equals("C")) {
            return "2";
        }
        if (input.toUpperCase().equals("D") | input.toUpperCase().equals("E") | input.toUpperCase().equals("F")) {
            return "3";
        }
        if (input.toUpperCase().equals("G") | input.toUpperCase().equals("H") | input.toUpperCase().equals("I")) {
            return "4";
        }
        if (input.toUpperCase().equals("J") | input.toUpperCase().equals("K") | input.toUpperCase().equals("L")) {
            return "5";
        }
        if (input.toUpperCase().equals("M") | input.toUpperCase().equals("N") | input.toUpperCase().equals("O")) {
            return "6";
        }
        if (input.toUpperCase().equals("P") | input.toUpperCase().equals("Q") | input.toUpperCase().equals("R") | input.toUpperCase().equals("S")) {
            return "7";
        }
        if (input.toUpperCase().equals("T") | input.toUpperCase().equals("U") | input.toUpperCase().equals("V")) {
            return "8";
        }
        if (input.toUpperCase().equals("W") | input.toUpperCase().equals("X") | input.toUpperCase().equals("Y") | input.toUpperCase().equals("Z")) {
            return "9";
        }

        return null;

    }

}
