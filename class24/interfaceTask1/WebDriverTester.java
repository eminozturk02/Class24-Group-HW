package com.company.class24.interfaceTask1;

public class WebDriverTester {
    public static void main(String[] args) {
        ChromeDriver chromeDriver = new ChromeDriver();
        chromeDriver.closeBrowser();
        chromeDriver.maximizeWindow();
        chromeDriver.findElement();
        chromeDriver.openBrowser();

        FirefoxDriver firefoxDriver = new FirefoxDriver();
        firefoxDriver.closeBrowser();
        firefoxDriver.findElement();
        firefoxDriver.maximizeWindow();
        firefoxDriver.openBrowser();
    }
}