package daggerprime.testmod1.trim;

import daggerprime.testmod1.TestMod1;
import daggerprime.testmod1.item.CustomItems;
import net.minecraft.item.Item;
import net.minecraft.item.trim.ArmorTrimMaterial;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.text.Style;
import net.minecraft.text.Text;
import net.minecraft.text.TextColor;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;

import java.util.Map;

public class CustomTrimMaterials {
    public static final RegistryKey<ArmorTrimMaterial> MAGITECH = RegistryKey.of(RegistryKeys.TRIM_MATERIAL,
            Identifier.of(TestMod1.MOD_ID, "magitech"));

    public static void bootstrap(Registerable<ArmorTrimMaterial> registerable) {
        register(registerable, MAGITECH, Registries.ITEM.getEntry(CustomItems.MAGITECH_INGOT), Style.EMPTY.withColor(TextColor.parse("#6B3A9A").getOrThrow()),
                1.0f);
    }

    private static void register(Registerable<ArmorTrimMaterial> registerable, RegistryKey<ArmorTrimMaterial> armorTrimKey, RegistryEntry<Item> item, Style style,
                                 float itemModelIndex) {
        ArmorTrimMaterial trimmaterial = new ArmorTrimMaterial(armorTrimKey.getValue().getPath(), item, itemModelIndex, Map.of(),
                Text.translatable(Util.createTranslationKey("trim_material", armorTrimKey.getValue())).fillStyle(style));

        registerable.register(armorTrimKey, trimmaterial);
    }
}
