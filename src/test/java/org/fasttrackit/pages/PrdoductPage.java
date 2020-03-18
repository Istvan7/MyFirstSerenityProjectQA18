package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://testfasttrackit.info/selenium-test/chelsea-tee-703.html")
public class PrdoductPage extends PageObject {
  @FindBy(css="#product_addtocart_form > div.product-shop > div.product-name > span")
 private WebElementFacade findproduct;

  public String getfindproduct(){
return findproduct.getText();
  }


}
