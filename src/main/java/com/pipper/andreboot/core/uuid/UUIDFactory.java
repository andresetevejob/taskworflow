package com.pipper.andreboot.core.uuid;

import java.util.UUID;

public final class UUIDFactory {

    private UUIDFactory () {}

    public static String create () {
        return UUID.randomUUID().toString().replaceAll("-", "");
    }

}