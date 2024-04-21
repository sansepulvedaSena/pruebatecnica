package com.serenity.template.web.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class Cart {
    public static final Target ADD_PRODUCT = Target.the("Product Image").locatedBy("//a[normalize-space()='Add to cart']");
    public static final Target GO_TO_CART = Target.the("Product Image").locatedBy("//a[normalize-space()='Cart']");
        public static final Target PRODUCT_NAME = Target.the("Product Image").locatedBy("//h2[@class='name']");



}

