package datahandledemo;

import org.testng.annotations.Factory;

public class FactoryDemo {

    @Factory
    public Object[] environmentBasedTest(){
        DataProviderDemo qa = new DataProviderDemo();
        qa.env = "QA";
        DataProviderDemo dev = new DataProviderDemo();
        dev.env = "DEV";
        DataProviderDemo uat = new DataProviderDemo();
        uat.env = "UAT";
        Object[] obj  = new Object[]{
        qa,dev,uat
        };
        return obj;
    }

}
