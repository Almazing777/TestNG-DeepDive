package test;

import org.testng.annotations.Test;

public class day3 {
    @Test (groups ={"Smoke"})
    public void WebLoginLoan(){
        //selenium
        System.out.println("weblogincar");
    }

    @Test (enabled = false)
    public void MobileLoginCarLoan(){
        //appium
        System.out.println("mobilelogincar");
    }

    @Test (timeOut = 4000)
    public void MobileSignInCarLoan(){
        //appium
        System.out.println("mobilelogincar");
    }

    @Test
    public void MobileLogOutCarLoan(){
        //appium
        System.out.println("mobilelogincar");
    }

    @Test
    public void LoginAPICarLoan(){
        //Rest API automation
        System.out.println("databaselogin");
    }
}
