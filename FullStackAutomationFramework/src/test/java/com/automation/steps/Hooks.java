package com.automation.steps;

import com.automation.utils.ConfigProperties;
import com.automation.utils.DriverUtils;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends DriverUtils{
    @Before
    public void setUp(){
        ConfigProperties.initProperties();
        DriverUtils.createDriver();
    }

    @After
    public void cleanUp(){
        DriverUtils.getDriver().quit();
    }
}
