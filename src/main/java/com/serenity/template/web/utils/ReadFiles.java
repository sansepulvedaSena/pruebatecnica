package com.serenity.template.web.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import net.thucydides.model.environment.SystemEnvironmentVariables;


public class ReadFiles {

    private static final Logger LOGGER = LoggerFactory.getLogger(ReadFiles.class);
    private static final SystemEnvironmentVariables CONF = SystemEnvironmentVariables.createEnvironmentVariables();

    public static String getConfig(String key) {
        String config = CONF.getProperty(key);
        if (config != null) {
            LOGGER.info("Config found! '" + key + "': " + config);
        } else {
            LOGGER.error("Config not found! '" + key + "'");
        }
        return config;
    }
}
