package daggerprime.testmod1;

import daggerprime.testmod1.item.CustomItemGroups;
import daggerprime.testmod1.item.CustomItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestMod1 implements ModInitializer {
    public static final String MOD_ID = "test-mod-1";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        CustomItems.registerCustomItems();
        CustomItemGroups.registerItemGroups();

        LOGGER.info("Hello Fabric world!");
    }
}