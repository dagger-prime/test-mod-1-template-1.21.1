package daggerprime.testmod1.trim;

import daggerprime.testmod1.TestMod1;
import daggerprime.testmod1.item.CustomItems;
import net.minecraft.item.Item;
import net.minecraft.item.trim.ArmorTrimPattern;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;

public class CustomTrimPatterns {
    public static final RegistryKey<ArmorTrimPattern> NOVA = RegistryKey.of(RegistryKeys.TRIM_PATTERN, Identifier.of(TestMod1.MOD_ID, "nova"));

    public static void bootstrap(Registerable<ArmorTrimPattern> context) {
        register(context, CustomItems.NOVA_SMITHING_TEMPLATE, NOVA);
    }

    private static void register(Registerable<ArmorTrimPattern> context, Item item, RegistryKey<ArmorTrimPattern> key) {
        ArmorTrimPattern trimPattern = new ArmorTrimPattern(key.getValue(), Registries.ITEM.getEntry(item),
                Text.translatable(Util.createTranslationKey("trim_pattern", key.getValue())), false);
        context.register(key, trimPattern);
    }
}
