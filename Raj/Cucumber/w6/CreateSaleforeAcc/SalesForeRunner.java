package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions
(features ="src/main/java/features/CreateAccount.feature" ,glue="steps" ,monochrome=true, publish=true)
public class SalesForeRunner extends AbstractTestNGCucumberTests{
	


}
