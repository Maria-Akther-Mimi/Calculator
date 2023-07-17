import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class CalcTestRunner extends Setup{
    CalcScreen calcScreen;
    @Test(priority = 1, description = "Do series 1")
    public void doSeries() throws InterruptedException {
        calcScreen = new CalcScreen(driver);
        Thread.sleep(1000);
        String res = calcScreen.calculateSeries("100/10*5-10+60");
        Assert.assertTrue(res.contains("100"));
    }
    @Test(priority = 2, description = "Do series 2")
    public void doSeries2() throws InterruptedException {
        calcScreen = new CalcScreen(driver);
        Thread.sleep(1000);
        String res = calcScreen.calculateSeries("50+10-20*2+10/2");
        Assert.assertTrue(res.contains("25"));
        Thread.sleep(1000);
    }

    @AfterMethod
    public void ClearScreen(){
        calcScreen = new CalcScreen(driver);
        calcScreen.clearScreen();
    }
}