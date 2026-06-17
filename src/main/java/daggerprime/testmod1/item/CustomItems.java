package daggerprime.testmod1.item;


import daggerprime.testmod1.TestMod1;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Style;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Identifier;
import java.util.List;


public class CustomItems {
    public static final Item VOID_SHARD = registerItem("void_shard", new Item(new Item.Settings()) {
        @Override
        public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
            tooltip.add(Text.translatable("void_shard.tooltip1"));
            super.appendTooltip(stack, context, tooltip, type);
        }
    });
    public static final Item RAW_RUBY = registerItem("raw_ruby", new Item(new Item.Settings()) {
        @Override
        public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
            tooltip.add(Text.translatable("rr1").styled(style -> style.withColor(16748800)));
            super.appendTooltip(stack, context, tooltip, type);
        }
    });
    public static final Item CHRONITE_PRISM = registerItem("chronite_prism", new Item(new Item.Settings()));
    public static final Item RAW_PLATINUM = registerItem("raw_platinum", new Item(new Item.Settings()));

    public static final Item ASTRALITE_INGOT = registerItem("astralite_ingot", new Item(new Item.Settings()));
    public static final Item VOID_INGOT = registerItem("void_ingot", new Item(new Item.Settings()));
    public static final Item RUBY_INGOT = registerItem("ruby_ingot", new Item(new Item.Settings()));
    public static final Item CHRONITE_INGOT = registerItem("chronite_ingot", new Item(new Item.Settings()));
    public static final Item PLATINUM_INGOT = registerItem("platinum_ingot", new Item(new Item.Settings()));

    public static final Item MULTUS_GEMMA_INGOT = registerItem("multus_gemma_ingot", new Item(new Item.Settings()));
    public static final Item FERRUM_CHALYBS_INGOT = registerItem("ferrum_chalybs_ingot", new Item(new Item.Settings()));
    public static final Item MAGITECH_INGOT = registerItem("magitech_ingot", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(TestMod1.MOD_ID, name), item);
    }



    public static void registerCustomItems() {
        TestMod1.LOGGER.info("Registering Custom Items for " + TestMod1.MOD_ID);

    }
}