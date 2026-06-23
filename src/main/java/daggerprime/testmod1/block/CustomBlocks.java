package daggerprime.testmod1.block;

import daggerprime.testmod1.TestMod1;
import daggerprime.testmod1.block.custom.StormBerryCropBlock;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;

public class CustomBlocks {
    public static final Block RUBY_ORE = registerBlock("ruby_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(1,3), AbstractBlock.Settings.create()
                    .sounds(BlockSoundGroup.DEEPSLATE)
                    .strength(3f)
                    .requiresTool()));

    public static final Block PLATINUM_ORE = registerBlock("platinum_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(2,4), AbstractBlock.Settings.create()
                    .sounds(BlockSoundGroup.ANVIL)
                    .strength(8f)
                    .requiresTool()));

    public static final Block VOID_ORE = registerBlock("void_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(8,8), AbstractBlock.Settings.create()
                    .sounds(BlockSoundGroup.CALCITE)
                    .strength(6f)
                    .requiresTool()));

    public static final Block CHRONITE_ORE = registerBlock("chronite_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(3,6), AbstractBlock.Settings.create()
                    .sounds(BlockSoundGroup.DECORATED_POT_SHATTER)
                    .strength(5f)
                    .requiresTool()));

    public static final Block ASTRALITE_ORE = registerBlock("astralite_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(3,5), AbstractBlock.Settings.create()
                    .sounds(BlockSoundGroup.DECORATED_POT_SHATTER)
                    .strength(4f)
                    .requiresTool()));

    public static final Block STORMBERRY_PLANT = registerBlockWithoutBlockItem("stormberry_plant",
            new StormBerryCropBlock(AbstractBlock.Settings.copy(Blocks.WHEAT)));

    private static Block registerBlockWithoutBlockItem(String name, Block block) {
        return Registry.register(Registries.BLOCK, Identifier.of(TestMod1.MOD_ID, name), block);
    }

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(TestMod1.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(TestMod1.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerCustomBlocks() {
        TestMod1.LOGGER.info("Registering Custom Blocks For" + TestMod1.MOD_ID);

    }
}
