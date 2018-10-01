package com.patres.training.tricky.name;

import java.util.HashSet;
import java.util.Set;

public class GlobalLogicName {
    private final String first, last;

    public GlobalLogicName(String first, String last) {
        this.first = first;
        this.last = last;
    }

    public static void main(String[] args) {
        Set<GlobalLogicName> globalLogicSet = new HashSet<>();
        globalLogicSet.add(new GlobalLogicName("Global", "Logic"));
        System.out.println(
                globalLogicSet.contains(new GlobalLogicName("Global", "Logic")));
    }

    public boolean equals(GlobalLogicName n) {
        return n.first.equals(first) && n.last.equals(last);
    }

    public int hashCode() {
        return 31 * first.hashCode() + last.hashCode();
    }
}