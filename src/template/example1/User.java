package template.example1;

import org.junit.Test;

public class User {
    @Test
    public void usingMobile(){
        MobileTemplate mobile = new Netflix();
        mobile.startBrowsing();
        System.out.println("============================");

        MobileTemplate browser = new Browser();
        browser.startBrowsing();
        System.out.println("======================");
    }
}
