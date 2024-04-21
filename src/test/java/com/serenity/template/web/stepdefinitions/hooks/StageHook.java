package com.serenity.template.web.stepdefinitions.hooks;

import com.serenity.template.web.utils.DriverManager;
import com.serenity.template.web.utils.SerenitySession;
import com.serenity.template.web.utils.constants.Defaults;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;


public class StageHook {

    @BeforeAll
    public static void setUp() {
        SerenitySession.createActor(Defaults.ACTOR_NAME);
    }

    @Before(order=1)
    public static void startSession() {
        SerenitySession.createActorForWeb("https://www.demoblaze.com/", Defaults.ACTOR_NAME);
    }

    @After
    public static void stopSession() {
        DriverManager.stop();
    }


}
