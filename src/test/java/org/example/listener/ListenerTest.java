package org.example.listener;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

// listener also can be added via xml
@Listeners(value = LoggingListener.class)
public class ListenerTest {

    @Test
    public void simpleTestForListener() {

    }

}
