package daggerprime.testmod1.item;

import daggerprime.testmod1.TestMod1;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class CustomItemGroups {
    public static final ItemGroup FLUORITE_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(TestMod1.MOD_ID, "astralite"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.astralite"))
                    .icon(() -> new ItemStack(CustomItems.ASTRALITE_INGOT)).entries((displayContext, entries) -> {
                        entries.add(CustomItems.ASTRALITE_INGOT);
                        entries.add(CustomItems.CHRONITE_INGOT);
                        entries.add(CustomItems.CHRONITE_PRISM);
                        entries.add(CustomItems.MAGITECH_INGOT);
                        entries.add(CustomItems.FERRUM_CHALYBS_INGOT);
                        entries.add(CustomItems.MULTUS_GEMMA_INGOT);
                        entries.add(CustomItems.PLATINUM_INGOT);
                        entries.add(CustomItems.RAW_PLATINUM);
                        entries.add(CustomItems.RAW_RUBY);
                        entries.add(CustomItems.RUBY_INGOT);
                        entries.add(CustomItems.VOID_INGOT);
                        entries.add(CustomItems.VOID_SHARD);

                    }).build());

    public static void registerItemGroups() {
        TestMod1.LOGGER.info("Registering Item Groups for " + TestMod1.MOD_ID);
    }
}