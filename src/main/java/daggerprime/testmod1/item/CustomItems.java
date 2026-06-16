package daggerprime.testmod1.item;


import daggerprime.testmod1.TestMod1;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class CustomItems {

    public static final Item ASTRALITE_INGOT = registerItem("astralite_ingot", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(TestMod1.MOD_ID, name), item);
    }

    private static void specialOres(FabricItemGroupEntries entries) {
        entries.add(ASTRALITE_INGOT);
    }

    public static void registerCustomItems() {
        TestMod1.LOGGER.info("Registering Custom Items for " + TestMod1.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(CustomItems::specialOres);
    }
}