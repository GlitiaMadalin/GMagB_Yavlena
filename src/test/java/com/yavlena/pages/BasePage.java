package com.yavlena.pages;

import com.yavlena.utilites.Driver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    public BasePage() {PageFactory.initElements(Driver.getDriver(),this);}
}
