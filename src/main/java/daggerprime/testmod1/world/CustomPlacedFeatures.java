package daggerprime.testmod1.world;

import daggerprime.testmod1.TestMod1;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.FeatureConfig;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.placementmodifier.HeightRangePlacementModifier;
import net.minecraft.world.gen.placementmodifier.PlacementModifier;

import java.util.List;

public class CustomPlacedFeatures {
    public static final RegistryKey<PlacedFeature> VOID_ORE_PLACED_KEY = registerKey("void_ore_placed");
    public static final RegistryKey<PlacedFeature> CHRONITE_ORE_PLACED_KEY = registerKey("chronite_ore_placed");
    public static final RegistryKey<PlacedFeature> RUBY_ORE_PLACED_KEY = registerKey("ruby_ore_placed");
    public static final RegistryKey<PlacedFeature> PLATINUM_ORE_PLACED_KEY = registerKey("platinum_ore_placed");
    public static final RegistryKey<PlacedFeature> ASTRALITE_ORE_PLACED_KEY = registerKey("astralite_ore_placed");



    public static void bootstrap(Registerable<PlacedFeature> context) {
        var configuredFeatureRegistryEntryLookup = context.getRegistryLookup(RegistryKeys.CONFIGURED_FEATURE);

        register(context, PLATINUM_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(CustomConfiguredFeatures.PLATINUM_ORE_KEY),
                CustomOrePlacement.modifiersWithCount(8, HeightRangePlacementModifier.uniform(YOffset.fixed(-64), YOffset.fixed(32))));
        register(context, RUBY_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(CustomConfiguredFeatures.RUBY_ORE_KEY),
                CustomOrePlacement.modifiersWithCount(10, HeightRangePlacementModifier.uniform(YOffset.fixed(0), YOffset.fixed(50))));
        register(context, VOID_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(CustomConfiguredFeatures.VOID_ORE_KEY),
                CustomOrePlacement.modifiersWithCount(4, HeightRangePlacementModifier.uniform(YOffset.fixed(-64), YOffset.fixed(-32))));
        register(context, CHRONITE_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(CustomConfiguredFeatures.CHRONITE_ORE_KEY),
                CustomOrePlacement.modifiersWithCount(4, HeightRangePlacementModifier.uniform(YOffset.fixed(-32), YOffset.fixed(32))));
        register(context, ASTRALITE_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(CustomConfiguredFeatures.ASTRALITE_ORE_KEY),
                CustomOrePlacement.modifiersWithCount(4, HeightRangePlacementModifier.uniform(YOffset.fixed(-32), YOffset.fixed(32))));

    }

    public static RegistryKey<PlacedFeature> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.PLACED_FEATURE, Identifier.of(TestMod1.MOD_ID, name));
    }

    private static void register(Registerable<PlacedFeature> context, RegistryKey<PlacedFeature> key, RegistryEntry<ConfiguredFeature<?, ?>> configuration,
                                 List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<PlacedFeature> context, RegistryKey<PlacedFeature> key,
                                                                                   RegistryEntry<ConfiguredFeature<?, ?>> configuration,
                                                                                   PlacementModifier... modifiers) {
        register(context, key, configuration, List.of(modifiers));
    }
}
