import org.testng.annotations.DataProvider;

public class Dataset {

    @DataProvider(name = "data-provider")
    public Object[][] setData(){
        return new Object[][]{
                {100000, 9.0, 2, 2.0, 4568, 9643, 2000, 109643},
                {325000, 9.5, 5, 1.5, 6826, 84536, 4875, 409536},
                {450000, 11.0, 7, 1.8, 7705, 197228, 8100, 647228},
                {99000000, 10.0, 4, 1.25, 2510896, 21522996, 1237500, 120522996},
                {50000, 12.0, 9, 2.2, 759, 31995, 1100, 81995}
        };
    }

}
