package daggerprime.testmod1.datagen;

import daggerprime.testmod1.item.CustomItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.item.ItemConvertible;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class CustomRecipes  extends FabricRecipeProvider {
    public CustomRecipes(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter exporter) {
        List<ItemConvertible> VOID = List.of(CustomItems.VOID_SHARD);
        offerSmelting(exporter, VOID , RecipeCategory.MISC, CustomItems.VOID_INGOT, 1.2f, 2000, "Special Ores");
        offerBlasting(exporter, VOID, RecipeCategory.MISC, CustomItems.VOID_INGOT, 1.2f, 1600, "Special Ores");
        List<ItemConvertible> RUBY = List.of(CustomItems.RAW_RUBY);
        offerSmelting(exporter, RUBY , RecipeCategory.MISC, CustomItems.RUBY_INGOT, 0.2f, 400, "Special Ores");
        offerBlasting(exporter, RUBY , RecipeCategory.MISC, CustomItems.RUBY_INGOT, 0.2f, 300, "Special Ores");
        List<ItemConvertible> PLAT = List.of(CustomItems.RAW_PLATINUM);
        offerSmelting(exporter, PLAT , RecipeCategory.MISC, CustomItems.PLATINUM_INGOT, 0.4f, 600, "Special Ores");
        offerBlasting(exporter, PLAT , RecipeCategory.MISC, CustomItems.PLATINUM_INGOT, 0.4f, 500, "Special Ores");
        List<ItemConvertible> CHRON = List.of(CustomItems.CHRONITE_PRISM);
        offerSmelting(exporter, CHRON , RecipeCategory.MISC, CustomItems.CHRONITE_INGOT, 0.8f, 800, "Special Ores");
        offerBlasting(exporter, CHRON , RecipeCategory.MISC, CustomItems.CHRONITE_INGOT, 0.8f, 700, "Special Ores");


    }
}
