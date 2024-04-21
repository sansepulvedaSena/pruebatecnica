package com.serenity.template.web.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class OrderForm {
    public static final Target INPUT_NAME = Target.the("Name input in form").locatedBy("//input[@id='name']");
    public static final Target INPUT_COUNTRY = Target.the("Country input in form").locatedBy("//input[@id='country']");
    public static final Target INPUT_CITY = Target.the("City input in form").locatedBy("//input[@id='city']");
    public static final Target INPUT_CREDIT_CARD = Target.the("Credit card input in form").locatedBy("//input[@id='card']");
    public static final Target INPUT_MONTH = Target.the("Month input in form").locatedBy("//input[@id='month']");
    public static final Target INPUT_YEAR = Target.the("Year input in form").locatedBy("//input[@id='year']");
    public static final Target PURCHASE_BTN = Target.the("Purchase button").locatedBy("//button[normalize-space()='Purchase']");
    public static final Target CONFIRM_PURCHASE_BTN = Target.the("OK in confirmation modal").locatedBy("//button[normalize-space()='OK']");

    public static final Target PLACE_ORDER_BTN = Target.the("Place Order button").locatedBy("//button[normalize-space()='Place Order']");

    public static final Target CONFIRMATION_MODAL = Target.the("Confirmation modal").locatedBy("//body/div[10]");





}