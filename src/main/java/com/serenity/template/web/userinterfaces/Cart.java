package com.serenity.template.web.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class Cart {
    public static final Target ADD_PRODUCT = Target.the("Product Image").locatedBy("//a[normalize-space()='Add to cart']");
    public static final Target GO_TO_CART = Target.the("Product Image").locatedBy("//a[normalize-space()='Cart']");
    public static final Target PRODUCT_NAME = Target.the("Product Image").locatedBy("//h2[@class='name']");
    public static final Target TOTAL_LBL = Target.the("Total label").locatedBy("//h3[@id='totalp']");
    public static final Target PRODUCT_VALUE = Target.the("Product value").locatedBy("//h3[@class='price-container']");
    public static final Target PRODUCTS_LBL = Target.the("Product label").locatedBy("    //h2[normalize-space()='Products']");









}

