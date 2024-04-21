package com.serenity.template.web.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class InCart {
    public static final Target PRODUCT_TITLE = Target.the("Product name").locatedBy("(//td)[2]");
    public static final Target DELETE_PRODUCT = Target.the("Product name").locatedBy("//a[normalize-space()='Delete']");

}
