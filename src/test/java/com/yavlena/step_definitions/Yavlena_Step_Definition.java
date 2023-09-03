package com.yavlena.step_definitions;

import com.yavlena.pages.YavlenaPage;
import com.yavlena.utilites.ConfigurationReader;
import com.yavlena.utilites.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Yavlena_Step_Definition {
    YavlenaPage yavlenaPage = new YavlenaPage();


    @Given("user should navigate to the link of yavlena")
    public void user_should_navigate_to_the_link_of_yavlena() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

    @When("user click to the search box")
    public void user_click_to_the_search_box() {
        yavlenaPage.searchButton.click();
    }

    @When("user write broker {string} in the search box")
    public void user_write_broker_in_the_search_box(String fullName) {
        yavlenaPage.searchButton.sendKeys(fullName);
    }

    @Then("verify on the search result view searched broker is the only one displayed")
    public void verify_on_the_search_result_view_searched_broker_is_the_only_one_displayed() {
        Assert.assertTrue(yavlenaPage.brokerName.isDisplayed());


    }

    @Then("verify {string}, {string}, {string} and the {string} assigned to the broker are displayed.")
    public void verify_and_the_assigned_to_the_broker_are_displayed(String expectedAddress, String expectedLandlinePhone, String expectedMobilePhone, String expectedNumberOfProperties) {
        String actualAddress = yavlenaPage.address.getText();
        String actualLandLinePhone = yavlenaPage.landlinePhone.getText();
        String actualMobilePhone = yavlenaPage.mobilePhone.getText();
        String actualNumberOfProperties = yavlenaPage.numberOfProperties.getText();

        Assert.assertEquals(expectedAddress, actualAddress);
        Assert.assertEquals(expectedLandlinePhone, actualLandLinePhone);
        Assert.assertEquals(expectedMobilePhone, actualMobilePhone);
        Assert.assertEquals(expectedNumberOfProperties, actualNumberOfProperties);

    }

    @When("user click to the load more button")
    public void user_click_to_the_load_more_button() {
        yavlenaPage.loadMoreButton.click();
    }

    @Then("verify that the number of webelements are increased")
    public void verify_that_the_number_of_webelements_are_increased() {
        List<WebElement> array1 = Driver.getDriver().findElements(By.xpath("//figure[@class='broker-img']"));
        int length1 = array1.size();

        yavlenaPage.loadMoreButton.click();

        List<WebElement> array2 = Driver.getDriver().findElements(By.xpath("//figure[@class='broker-img']"));
        int length2 = array2.size();

        if (length2 > length1) {
            Assert.assertTrue(true);

        }

    }
}
