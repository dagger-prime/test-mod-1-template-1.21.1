package daggerprime.testmod1.world;

import daggerprime.testmod1.TestMod1;
import daggerprime.testmod1.block.CustomBlocks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.structure.rule.RuleTest;
import net.minecraft.structure.rule.TagMatchRuleTest;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.FeatureConfig;
import net.minecraft.world.gen.feature.OreFeatureConfig;

import java.util.List;

public class CustomConfiguredFeatures {

    public static final RegistryKey<ConfiguredFeature<?, ?>> PLATINUM_ORE_KEY = registerKey("platinum_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> RUBY_ORE_KEY = registerKey("ruby_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> CHRONITE_ORE_KEY = registerKey("chronite_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> ASTRALITE_ORE_KEY = registerKey("astralite_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> VOID_ORE_KEY = registerKey("void_ore");

    public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> context) {
        RuleTest stoneReplaceables = new TagMatchRuleTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);
        RuleTest deepslateReplaceables = new TagMatchRuleTest(BlockTags.STONE_ORE_REPLACEABLES);

        List<OreFeatureConfig.Target> overworldOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, CustomBlocks.RUBY_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(stoneReplaceables, CustomBlocks.PLATINUM_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, CustomBlocks.ASTRALITE_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, CustomBlocks.CHRONITE_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, CustomBlocks.VOID_ORE.getDefaultState()));

        register(context, PLATINUM_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldOres, 8));
        register(context, RUBY_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldOres, 12));
        register(context, VOID_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldOres, 4 ));
        register(context, ASTRALITE_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldOres, 6));
        register(context, CHRONITE_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldOres, 6));


    }

    public static RegistryKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, Identifier.of(TestMod1.MOD_ID, name));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?, ?>> context,
                                                                                   RegistryKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}
