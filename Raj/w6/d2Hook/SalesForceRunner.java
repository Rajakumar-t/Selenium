package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions
(features ="src/main/java/feature/CreateSaleforeAccount.feature" ,glue="steps" ,monochrome=true, publish=true)
public class SalesForceRunner extends AbstractTestNGCucumberTests{

}
