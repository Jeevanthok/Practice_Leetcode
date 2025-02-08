package com.random.question;

import java.util.Comparator;

public class ComparatorTest implements Comparator<ComparatorPractice> {
    @Override
    public int compare(ComparatorPractice o1, ComparatorPractice o2) {
        return Integer.compare(o1.getId(), o2.getId());
    }
}
