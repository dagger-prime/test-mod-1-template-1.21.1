package daggerprime.testmod1.datagen;

import daggerprime.testmod1.item.CustomItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

public class CustomItemTag extends FabricTagProvider.ItemTagProvider {
    public CustomItemTag(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup lookup) {
        getOrCreateTagBuilder(ItemTags.SWORDS)
                .add(CustomItems.MAGITECH_SWORD);
        getOrCreateTagBuilder(ItemTags.PICKAXES)
                .add(CustomItems.MAGITECH_PICKAXE);
        getOrCreateTagBuilder(ItemTags.SHOVELS)
                .add(CustomItems.MAGITECH_SWORD);
        getOrCreateTagBuilder(ItemTags.AXES)
                .add(CustomItems.MAGITECH_AXE);
        getOrCreateTagBuilder(ItemTags.HOES)
                .add(CustomItems.MAGITECH_HOE);
        getOrCreateTagBuilder(ItemTags.HEAD_ARMOR)
                .add(CustomItems.MAGITECH_HELMET);
        getOrCreateTagBuilder(ItemTags.CHEST_ARMOR)
                .add(CustomItems.MAGITECH_CHESTPLATE);
        getOrCreateTagBuilder(ItemTags.LEG_ARMOR)
                .add(CustomItems.MAGITECH_LEGGINGS);
        getOrCreateTagBuilder(ItemTags.FOOT_ARMOR)
                .add(CustomItems.MAGITECH_BOOTS);
        getOrCreateTagBuilder(ItemTags.HEAD_ARMOR_ENCHANTABLE)
                .add(CustomItems.MAGITECH_HELMET);
        getOrCreateTagBuilder(ItemTags.CHEST_ARMOR_ENCHANTABLE)
                .add(CustomItems.MAGITECH_CHESTPLATE);
        getOrCreateTagBuilder(ItemTags.LEG_ARMOR_ENCHANTABLE)
                .add(CustomItems.MAGITECH_LEGGINGS);
        getOrCreateTagBuilder(ItemTags.FOOT_ARMOR_ENCHANTABLE)
                .add(CustomItems.MAGITECH_BOOTS);

    }
}
