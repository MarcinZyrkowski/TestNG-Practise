package org.example;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class IgnoredAnnotationTest {

    @Ignore("Ignored test - e.g. no requirements")
    @Test
    public void ignoredTest() {
        System.out.println("IGNORED");
    }

}
