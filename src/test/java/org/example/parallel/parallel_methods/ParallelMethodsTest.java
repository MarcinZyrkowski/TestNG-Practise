package org.example.parallel.parallel_methods;

import lombok.SneakyThrows;
import org.testng.annotations.Test;

public class ParallelMethodsTest {

    @Test
    @SneakyThrows
    public void firstParallelMethodTest() {
        Thread.sleep(5000);
    }

    @Test
    @SneakyThrows
    public void secondParallelMethodTest() {
        Thread.sleep(5000);
    }

    @Test
    @SneakyThrows
    public void thirdParallelMethodTest() {
        Thread.sleep(5000);
    }

    @Test
    @SneakyThrows
    public void fourthParallelMethodTest() {
        Thread.sleep(5000);
    }
}
