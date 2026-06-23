package daggerprime.testmod1;

import daggerprime.testmod1.datagen.*;
import daggerprime.testmod1.trim.CustomTrimMaterials;
import daggerprime.testmod1.trim.CustomTrimPatterns;
import daggerprime.testmod1.world.CustomConfiguredFeatures;
import daggerprime.testmod1.world.CustomPlacedFeatures;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.minecraft.registry.RegistryBuilder;
import net.minecraft.registry.RegistryKeys;

public class TestMod1DataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

        pack.addProvider(CustomBlockTag::new);
        pack.addProvider(CustomModels::new);
        pack.addProvider(CustomRecipes::new);
        pack.addProvider(CustomLootTables::new);
        pack.addProvider(CustomItemTag::new);
        pack.addProvider(CustomRegistryDataGenerator::new);
        pack.addProvider(CustomWorldGenerator::new);

	}
    @Override
    public void buildRegistry(RegistryBuilder registryBuilder) {
        registryBuilder.addRegistry(RegistryKeys.TRIM_MATERIAL, CustomTrimMaterials::bootstrap);
        registryBuilder.addRegistry(RegistryKeys.TRIM_PATTERN, CustomTrimPatterns::bootstrap);
        registryBuilder.addRegistry(RegistryKeys.CONFIGURED_FEATURE, CustomConfiguredFeatures::bootstrap);
        registryBuilder.addRegistry(RegistryKeys.PLACED_FEATURE, CustomPlacedFeatures::bootstrap);

    }
}
