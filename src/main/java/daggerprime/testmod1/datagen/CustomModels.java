package daggerprime.testmod1.datagen;

import daggerprime.testmod1.block.CustomBlocks;
import daggerprime.testmod1.item.CustomItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class CustomModels extends FabricModelProvider {
    public CustomModels(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(CustomBlocks.VOID_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(CustomBlocks.ASTRALITE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(CustomBlocks.RUBY_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(CustomBlocks.PLATINUM_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(CustomBlocks.CHRONITE_ORE);

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(CustomItems.VOID_SHARD, Models.GENERATED);
        itemModelGenerator.register(CustomItems.CHRONITE_PRISM, Models.GENERATED);
        itemModelGenerator.register(CustomItems.CHRONITE_INGOT, Models.GENERATED);
        itemModelGenerator.register(CustomItems.FERRUM_CHALYBS_INGOT, Models.GENERATED);
        itemModelGenerator.register(CustomItems.MAGITECH_INGOT, Models.GENERATED);
        itemModelGenerator.register(CustomItems.RAW_RUBY, Models.GENERATED);
        itemModelGenerator.register(CustomItems.RAW_PLATINUM, Models.GENERATED);
        itemModelGenerator.register(CustomItems.RUBY_INGOT, Models.GENERATED);
        itemModelGenerator.register(CustomItems.ASTRALITE_INGOT, Models.GENERATED);
        itemModelGenerator.register(CustomItems.PLATINUM_INGOT, Models.GENERATED);
        itemModelGenerator.register(CustomItems.MULTUS_GEMMA_INGOT, Models.GENERATED);
        itemModelGenerator.register(CustomItems.VOID_INGOT, Models.GENERATED);
    }
}
