import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class EMITestRunner extends Setup{

    @BeforeTest
    public void startEMICalc(){
        EMIScreen emiScreen = new EMIScreen(driver);
        emiScreen.btnStart.click();

    }

    @Test(priority = 1, dataProviderClass = Dataset.class, dataProvider = "data-provider")
    public void calculateEMI(int amount, double interest, int period, double processingFee, int mEMI, int tInterest, int pFee, int tPayment){
        EMIScreen emiScreen = new EMIScreen(driver);
        emiScreen.calculateEMI(amount, interest, period, processingFee);

        int actualEMI = (int)Math.round(Double.parseDouble(emiScreen.lblMonthlyEMI.getText().replace(",","")));
        int actualInterest = (int)Math.round(Double.parseDouble(emiScreen.lblTotalInterest.getText().replace(",","")));
        int actualpFee = (int)Math.round(Double.parseDouble(emiScreen.lblTotalProcessingFee.getText().replace(",","")));
        int actualpayment = (int)Math.round(Double.parseDouble(emiScreen.lblTotalPayment.getText().replace(",","")));

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(actualEMI, mEMI);
        softAssert.assertEquals(actualInterest, tInterest);
        softAssert.assertEquals(actualpFee, pFee);
        softAssert.assertEquals(actualpayment, tPayment);
        softAssert.assertAll();


        emiScreen.btnReset.click();
    }

}
