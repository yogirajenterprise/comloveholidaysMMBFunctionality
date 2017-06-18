package com.loveholidays;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by Prakash Narola on 17/06/2017.
 */

@RunWith(Cucumber.class)
@CucumberOptions(features = ".",format = "html:target/cucumber.reports", tags = "@test,@test1")
public class CukeTest {
}
