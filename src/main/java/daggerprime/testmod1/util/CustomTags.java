package daggerprime.testmod1.util;

import daggerprime.testmod1.TestMod1;
import net.minecraft.block.Block;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

import static net.minecraft.registry.tag.TagEntry.createTag;

public class CustomTags {
    public static final TagKey<Block> NEEDS_PLATINUM_TOOL = createTag("needs_platinum_tool");
    public static final TagKey<Block> INCORRECT_FOR_PLATINUM_TOOL = createTag("incorrect_for_platinum_tool");
    public static final TagKey<Block> NEEDS_MAGITECH_TOOL = createTag("needs_magitech_tool");
    public static final TagKey<Block> INCORRECT_FOR_MAGITECH_TOOL = createTag("incorrect_for_magitech_tool");

    private static TagKey<Block> createTag(String name) {
        return TagKey.of(RegistryKeys.BLOCK, Identifier.of(TestMod1.MOD_ID, name));
    }
}
