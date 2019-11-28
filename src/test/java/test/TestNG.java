package test;

import org.testng.annotations.Test;

public class TestNG {

    @Test
    public void Demo(){
        System.out.println("hello");
    }

    @Test (groups ={"Smoke"})
    public void SecondTest(){
        System.out.println("bye");
    }

}
