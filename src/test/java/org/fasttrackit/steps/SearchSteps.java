package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;
import org.fasttrackit.pages.*;
import org.junit.Assert;

public class SearchSteps {
    private HomePage homePage;
    private RegisterPage registerPage;
    private MyAccountPage myAccountPage;
    private SearchPage searchPage;
    private PrdoductPage prdoductPage;

    @Step
    public void searchTest() {
        homePage.open();
        homePage.setSearchField("chelsea");
        homePage.setClickSearch();
        searchPage.product1();

    }

    @Step
    public void findproduct(String expected) {
        String message = prdoductPage.getfindproduct();
        Assert.assertEquals(expected, message);


    }
}
