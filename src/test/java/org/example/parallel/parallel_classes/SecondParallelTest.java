package org.example.parallel.parallel_classes;

import lombok.SneakyThrows;
import org.testng.annotations.Test;

public class SecondParallelTest {

    @Test
    @SneakyThrows
    public void secondParallelTest() {
        Thread.sleep(5000);
    }

}
