package com.company.class24.interfaceTask1;

public interface WebDriver {
    void openBrowser();
    void closeBrowser();
    void maximizeWindow();
    void findElement();

}
class ChromeDriver implements WebDriver {
    public void openBrowser() {
        System.out.println("Open browser");
    }


 public void closeBrowser() {
     System.out.println("Close browser");
    }

    public void maximizeWindow() {
        System.out.println("Maximize window");

    }

    public void findElement() {
        System.out.println("find elements");
    }
}
class FirefoxDriver implements WebDriver {

    @Override
    public void openBrowser() {
        System.out.println("open Firefox browser");
    }

    @Override
    public void closeBrowser() {
        System.out.println(" close Firefox browser");
    }

    @Override
    public void maximizeWindow() {
        System.out.println("Maximize Firefox window");
    }

    @Override
    public void findElement() {
        System.out.println("Find Firefox elements");
    }
}