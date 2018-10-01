package com.patres.training.tricky.equal;

import java.math.BigInteger;

public class GlobalLogicNumbers {

    public static void main(String[] args) {
        String globalLogicText = "";

        Integer a100 = 100;
        Integer b100 = 100;

        Integer a200 = 200;
        Integer b200 = 200;

        if (a100 == b100) globalLogicText += "Global";

        if (a200 == b200) globalLogicText += "Logic";

        BigInteger globalInteger = BigInteger.ONE;
        globalInteger.add(BigInteger.TEN);
        globalLogicText += " " + globalInteger;

        boolean check = true;
        Number number = check ? new Integer(8) : new Double(2.0);
        globalLogicText += number;

        System.out.println(globalLogicText);
    }
}
