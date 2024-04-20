package com.serenity.template.web.utils;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

public class GenericUtils {
    public static void waitSeconds(double seconds) {
        LockSupport.parkNanos(TimeUnit.MILLISECONDS.toNanos((long) (seconds * 1000)));
    }
}
