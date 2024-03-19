package com.drivera.opencart.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"com.drivera.opencart.stepDefinitions", "com.drivera.opencart.hooks"},
        snippets = CucumberOptions.SnippetType.CAMELCASE//,
        //tags = "@TEST-Carrito"
)
public class CucumberRunnerTest extends AbstractTestNGCucumberTests {

}
