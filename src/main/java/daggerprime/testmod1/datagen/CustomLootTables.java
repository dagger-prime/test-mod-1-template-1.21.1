package daggerprime.testmod1.datagen;

import daggerprime.testmod1.block.CustomBlocks;
import daggerprime.testmod1.item.CustomItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.Block;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.entry.LootPoolEntry;
import net.minecraft.loot.function.ApplyBonusLootFunction;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class CustomLootTables extends FabricBlockLootTableProvider {
    public CustomLootTables(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        addDrop(CustomBlocks.ASTRALITE_ORE, manyOreDrops(CustomBlocks.ASTRALITE_ORE, CustomItems.ASTRALITE_INGOT, 1,1));
        addDrop(CustomBlocks.RUBY_ORE, manyOreDrops(CustomBlocks.RUBY_ORE, CustomItems.RAW_RUBY, 1,1));
        addDrop(CustomBlocks.PLATINUM_ORE, manyOreDrops(CustomBlocks.PLATINUM_ORE, CustomItems.RAW_PLATINUM, 1,1));
        addDrop(CustomBlocks.CHRONITE_ORE, manyOreDrops(CustomBlocks.CHRONITE_ORE, CustomItems.CHRONITE_PRISM, 1,1));
        addDrop(CustomBlocks.VOID_ORE, manyOreDrops(CustomBlocks.VOID_ORE, CustomItems.VOID_SHARD, 3,6));


    }
    public LootTable.Builder manyOreDrops(Block drop, Item item, float minDrops, float maxDrops) {
        RegistryWrapper.Impl<Enchantment> impl = this.registryLookup.getWrapperOrThrow(RegistryKeys.ENCHANTMENT);
        return this.dropsWithSilkTouch(drop, this.applyExplosionDecay(drop, ItemEntry.builder(item)
                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(minDrops, maxDrops)))
                .apply(ApplyBonusLootFunction.oreDrops(impl.getOrThrow(Enchantments.FORTUNE)))));
    }
}
