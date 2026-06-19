package daggerprime.testmod1.datagen;

import daggerprime.testmod1.block.CustomBlocks;
import daggerprime.testmod1.util.CustomTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class CustomBlockTag extends FabricTagProvider.BlockTagProvider {

    public CustomBlockTag(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup lookup) {
        getOrCreateTagBuilder(CustomTags.NEEDS_PLATINUM_TOOL)
                .add(CustomBlocks.ASTRALITE_ORE,
                        CustomBlocks.VOID_ORE,
                        CustomBlocks.CHRONITE_ORE
                        );
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(CustomBlocks.ASTRALITE_ORE,
                        CustomBlocks.CHRONITE_ORE,
                        CustomBlocks.RUBY_ORE,
                        CustomBlocks.VOID_ORE,
                        CustomBlocks.PLATINUM_ORE
                        );
        getOrCreateTagBuilder(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(CustomBlocks.RUBY_ORE,
                        CustomBlocks.PLATINUM_ORE
                );
        getOrCreateTagBuilder(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
                .addTag(CustomTags.NEEDS_PLATINUM_TOOL);

        getOrCreateTagBuilder(BlockTags.INCORRECT_FOR_STONE_TOOL)
                .addTag(CustomTags.NEEDS_PLATINUM_TOOL);

        getOrCreateTagBuilder(BlockTags.INCORRECT_FOR_IRON_TOOL)
                .addTag(CustomTags.NEEDS_PLATINUM_TOOL);

        getOrCreateTagBuilder(BlockTags.INCORRECT_FOR_DIAMOND_TOOL)
                .addTag(CustomTags.NEEDS_PLATINUM_TOOL);

        getOrCreateTagBuilder(BlockTags.INCORRECT_FOR_NETHERITE_TOOL)
                .addTag(CustomTags.NEEDS_PLATINUM_TOOL);


    }
}
