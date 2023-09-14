package org.example;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {

    // dataProviderClass is needed when method marked as @DataProvider is in another class
    @Test(dataProvider = "data-provider", dataProviderClass = DataProviderTest.class)
    public void dataProviderTest(String val) {
        System.out.println("Passed Parameter Is : " + val);
    }

    @DataProvider(name = "data-provider")
    public Object[][] dpMethod() {
        return new Object[][]{
                {"First-Value"},
                {"Second-Value"}
        };
    }

}
