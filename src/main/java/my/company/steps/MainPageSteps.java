package my.company.steps;



import my.company.pages.MainPage;
import io.qameta.allure.Step;

/**
 * Created by Maria on 29.04.2017.
 */
public class MainPageSteps {



    @Step("выбран пункт меню {0}")
    public void selectMenuItem(String menuItem){
        new MainPage().selectMenuItem(menuItem);
    }

    @Step("выбран вид страхования {0}")
    public void selectMenuInsurance(String menuItem){
        new MainPage().selectInsuranceItem(menuItem);
    }

}
