package template.example1;

import org.junit.Test;

//DRY  ======

public class User {

    @Test
    public void usingMobile(){
        MobileTemplate mobile = new Netflix();
        mobile.startUsing();
        System.out.println("============================");

        MobileTemplate browser = new Browser();
        browser.startUsing();
        System.out.println("======================");
    }
}
