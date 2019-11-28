package test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
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

    @Parameters({ "URL", "APIKey/usrname"})

    @Test
    public void WebLoginHomeLoan(String urlParam, String key){
        //selenium
        System.out.println("webloginHome");
        System.out.println(urlParam);
        System.out.println(key);
    }

    @Test (groups ={"Smoke"})
    public void MobileLoginHomeLoan(){
        //appium
        System.out.println("mobileloginHome");
    }

    @Test(dependsOnMethods = {"WebLoginHomeLoan"})
    public void LoginAPIHomeLoan(){
        //Rest API automation
        System.out.println("databaseloginHome");
    }
}
