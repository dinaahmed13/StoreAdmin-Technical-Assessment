package data;

import org.testng.annotations.DataProvider;


public class TestData {
    @DataProvider(name = "productData")
    public Object[][] productData() {

        return new Object[][] {
                {"Laptop", "3220"},
              //  {"Keyboard", "2500"},
              //  {"Mouse", "1200"}
        };
    }
}
