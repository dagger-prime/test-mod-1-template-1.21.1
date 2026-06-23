package daggerprime.testmod1.item;

import daggerprime.testmod1.TestMod1;
import daggerprime.testmod1.block.CustomBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class CustomItemGroups {
    public static final ItemGroup SPECIAL_ORES = Registry.register(Registries.ITEM_GROUP,
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
                        entries.add(CustomBlocks.CHRONITE_ORE);
                        entries.add(CustomBlocks.ASTRALITE_ORE);
                        entries.add(CustomBlocks.PLATINUM_ORE);
                        entries.add(CustomBlocks.RUBY_ORE);
                        entries.add(CustomBlocks.VOID_ORE);

                    }).build());

    public static final ItemGroup CUSTOM_GEAR = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(TestMod1.MOD_ID, "platinum"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.custom_tools"))
                    .icon(() -> new ItemStack(CustomItems.PLATINUM_PICKAXE)).entries((displayContext, entries) -> {
                        entries.add(CustomItems.PLATINUM_PICKAXE);
                        entries.add(CustomItems.MAGITECH_AXE);
                        entries.add(CustomItems.MAGITECH_HOE);
                        entries.add(CustomItems.MAGITECH_PICKAXE);
                        entries.add(CustomItems.MAGITECH_SHOVEL);
                        entries.add(CustomItems.MAGITECH_SWORD);
                        entries.add(CustomItems.MAGITECH_HELMET);
                        entries.add(CustomItems.MAGITECH_CHESTPLATE);
                        entries.add(CustomItems.MAGITECH_BOOTS);
                        entries.add(CustomItems.MAGITECH_LEGGINGS);


                    }).build());

    public static final ItemGroup MODDED_ENVIRONMENT = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(TestMod1.MOD_ID, "stormberry"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.modded_environment"))
                    .icon(() -> new ItemStack(CustomItems.STORMBERRY_SEEDS)).entries((displayContext, entries) -> {
                        entries.add(CustomItems.STORMBERRY_SEEDS);
                        entries.add(CustomItems.STORMBERRIES);

                    }).build());



    public static void registerItemGroups() {
        TestMod1.LOGGER.info("Registering Item Groups for " + TestMod1.MOD_ID);
    }
}