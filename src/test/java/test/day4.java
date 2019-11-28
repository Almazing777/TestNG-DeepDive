package test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day4 {
    @BeforeTest
    public void preRequisite(){
        System.out.println("I'm a BeforeTest");
    }

    @AfterTest
    public void lastExecution(){
        System.out.println("I' am AfterTest");
    }

    @Test
    public void WebLoginHomeLoan(){
        //selenium
        System.out.println("webloginHome");
    }

    @Test (groups ={"Smoke"})
    public void MobileLoginHomeLoan(){
        //appium
        System.out.println("mobileloginHome");
    }

    @Test
    public void LoginAPIHomeLoan(){
        //Rest API automation
        System.out.println("databaseloginHome");
    }
}
