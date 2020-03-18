package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://testfasttrackit.info/selenium-test/catalogsearch/result/?q=chelsea")
public class SearchPage extends PageObject {
    @FindBy(id = "product-collection-image-410")
    private WebElementFacade product1;



    public void product1(){
        clickOn(product1);
    }
}
