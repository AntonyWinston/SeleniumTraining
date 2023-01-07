package org.food;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources",
glue ="org.stepdefinition" ,
monochrome = true ,
dryRun =false ,
strict = true,
snippets = SnippetType.UNDERSCORE ,
tags = "@win,@wins,@dum,@Ink,@grip,@truble",
plugin = ( "json:Report\\jsonreport.json")
) 

public class runclass {
	

}
