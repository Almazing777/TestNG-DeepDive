package test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day3 {

    @Parameters({ "URL" })

    @Test (groups ={"Smoke"})
    public void WebLoginLoan(String urlName){
        //selenium
        System.out.println("weblogincar");
        System.out.println(urlName);
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

    @Test(dataProvider = "getData")
    public void LoginAPICarLoan(String username, String password){
        //Rest API automation
        System.out.println("databaselogin");
        System.out.println(username);
        System.out.println(password);
    }

    @DataProvider
    public Object[][] getData(){
        //1st combination - username password - good history
        //2nd - username password - no history
        //3rd - username password fraudulent
        Object[][] data = new Object[3][2];

        //1st set
        data[0][0] = "firstSetUsername";
        data[0][1] = "password";

        //2nd set
        data[1][0] = "secondSetUsername";
        data[1][1] = "secondPassword";

        //3rd set
        data[2][0] = "thirdSetUsername";
        data[2][1] = "thirdPassword";

        return data;

    }
}
