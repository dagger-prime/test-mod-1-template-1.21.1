package daggerprime.testmod1;

import daggerprime.testmod1.datagen.*;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class TestMod1DataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

        pack.addProvider(CustomBlockTag::new);
        pack.addProvider(CustomModels::new);
        pack.addProvider(CustomRecipes::new);
        pack.addProvider(CustomLootTables::new);
        pack.addProvider(CustomItemTag::new);

	}
}
