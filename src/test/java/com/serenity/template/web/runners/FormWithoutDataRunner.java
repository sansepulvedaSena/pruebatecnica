package com.serenity.template.web.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        glue = "com.serenity.template.web.stepdefinitions",
        features = "src/test/resources/features/fill_form_without_data.feature",
        snippets = SnippetType.CAMELCASE)
public class FormWithoutDataRunner {
}
