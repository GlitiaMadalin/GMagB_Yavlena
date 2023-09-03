package com.yavlena.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class YavlenaPage extends BasePage{

    @FindBy(xpath = "//input[@placeholder=\"name, region\"]")
    public WebElement searchButton;


    @FindBy(xpath = "//*[.='Desisilava Petrova']")
    public WebElement brokerName;


    @FindBy(xpath = "//div[@class='office']")
    public WebElement address;

    @FindBy(xpath = "//a[.='+359 73 88 20 05']")
    public WebElement landlinePhone;

    @FindBy(xpath = "//a[.='+359 886 880 290']")
    public WebElement mobilePhone;

    @FindBy(xpath = "//a[.='(21 Properties)']")
    public WebElement numberOfProperties;

    @FindBy(xpath = "//*[@class=\"green-btn load-more-results-list\"]")
    public WebElement loadMoreButton;





}
