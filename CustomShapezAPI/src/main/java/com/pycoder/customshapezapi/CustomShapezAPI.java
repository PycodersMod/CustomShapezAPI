package com.pycoder.customshapezapi;

import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

import net.minecraftforge.fml.common.Mod;

@Mod(CustomShapezAPI.MOD_ID)
public class CustomShapezAPI {
    public static final String MOD_ID = "customshapezapi";
    private static final Logger LOGGER = LogUtils.getLogger();

    public CustomShapezAPI() {
        LOGGER.info("{} loaded", MOD_ID);
    }
}
