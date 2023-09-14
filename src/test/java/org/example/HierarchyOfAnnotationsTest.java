package org.example;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HierarchyOfAnnotationsTest {

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("Execution of @BeforeSuite");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("Execution of @BeforeTest");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("Execution of @BeforeClass");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("Execution of @BeforeMethod");
    }

    @Test
    public void sampleTest() {
        System.out.println("Execution of @Test");

    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("Execution of @AfterMethod");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("Execution of @AfterClass");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("Execution of @AfterTest");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("Execution of @AfterSuite");
    }

}
