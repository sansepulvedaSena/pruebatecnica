package com.serenity.template.web.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class Landing {
    public static final Target PRODUCT = Target.the("Product in landing").locatedBy("//div[@id='tbodyid']//div[1]//div[1]//a[1]//img[1]");
    public static final Target SELECT_CATEGORY = Target.the("Category in landing").locatedBy("//a[3]");

}
