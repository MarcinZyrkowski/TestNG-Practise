package org.example;

import org.testng.annotations.Test;

public class TestAnnotationParametersTest {

    @Test(description = "This name is displayed in allure report", testName = "This name is displayed in IntelliJ")
    public void descriptionAndTestNameTest() {

    }

    // we expect exactly the same error message as in parameter
    @Test(expectedExceptions = RuntimeException.class, expectedExceptionsMessageRegExp = "Sample exception is thrown")
    public void exceptionTest() {
        throw new RuntimeException("Sample exception is thrown");
    }


}
