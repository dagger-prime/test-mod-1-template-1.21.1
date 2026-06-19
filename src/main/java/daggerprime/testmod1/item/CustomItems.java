package daggerprime.testmod1.item;


import daggerprime.testmod1.TestMod1;
import net.minecraft.item.*;
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
    public static final Item CHRONITE_PRISM = registerItem("chronite_prism", new Item(new Item.Settings()) {
        @Override
        public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
            tooltip.add(Text.translatable("cp1"));
            super.appendTooltip(stack, context, tooltip, type);
    }});
    public static final Item RAW_PLATINUM = registerItem("raw_platinum", new Item(new Item.Settings()));

    public static final Item ASTRALITE_INGOT = registerItem("astralite_ingot", new Item(new Item.Settings()));
    public static final Item VOID_INGOT = registerItem("void_ingot", new Item(new Item.Settings()));
    public static final Item RUBY_INGOT = registerItem("ruby_ingot", new Item(new Item.Settings()));
    public static final Item CHRONITE_INGOT = registerItem("chronite_ingot", new Item(new Item.Settings()));
    public static final Item PLATINUM_INGOT = registerItem("platinum_ingot", new Item(new Item.Settings()));

    public static final Item MULTUS_GEMMA_INGOT = registerItem("multus_gemma_ingot", new Item(new Item.Settings()));
    public static final Item FERRUM_CHALYBS_INGOT = registerItem("ferrum_chalybs_ingot", new Item(new Item.Settings()));
    public static final Item MAGITECH_INGOT = registerItem("magitech_ingot", new Item(new Item.Settings()));

    public static final Item PLATINUM_PICKAXE = registerItem("platinum_pickaxe", new PickaxeItem(CustomToolMaterials.PLATINUM,
            new Item.Settings().attributeModifiers(PickaxeItem.createAttributeModifiers(CustomToolMaterials.PLATINUM, 2, -2.8F))));
    public static final Item MAGITECH_SWORD = registerItem("magitech_sword", new SwordItem(CustomToolMaterials.MAGITECH,
            new Item.Settings().attributeModifiers(SwordItem.createAttributeModifiers(CustomToolMaterials.MAGITECH,3,-2.4f))));
    public static final Item MAGITECH_AXE = registerItem("magitech_axe", new AxeItem(CustomToolMaterials.MAGITECH,
            new Item.Settings().attributeModifiers(AxeItem.createAttributeModifiers(CustomToolMaterials.MAGITECH,6,-3.1f))));
    public static final Item MAGITECH_SHOVEL = registerItem("magitech_shovel", new ShovelItem(CustomToolMaterials.MAGITECH,
            new Item.Settings().attributeModifiers(ShovelItem.createAttributeModifiers(CustomToolMaterials.MAGITECH,1.5F,-3.0f))));
    public static final Item MAGITECH_PICKAXE = registerItem("magitech_pickaxe", new PickaxeItem(CustomToolMaterials.MAGITECH,
            new Item.Settings().attributeModifiers(PickaxeItem.createAttributeModifiers(CustomToolMaterials.MAGITECH,1,-2.8f))));
    public static final Item MAGITECH_HOE = registerItem("magitech_hoe", new HoeItem(CustomToolMaterials.MAGITECH,
            new Item.Settings().attributeModifiers(HoeItem.createAttributeModifiers(CustomToolMaterials.MAGITECH,-2,-1.0f))));

    public static final Item MAGITECH_HELMET = registerItem("magitech_helmet", new ArmorItem(CustomArmorMaterials.MAGITECH_ARMOR_MATERIAL,
            ArmorItem.Type.HELMET, new Item.Settings().maxDamage(ArmorItem.Type.HELMET.getMaxDamage(15))));
    public static final Item MAGITECH_CHESTPLATE = registerItem("magitech_chestplate", new ArmorItem(CustomArmorMaterials.MAGITECH_ARMOR_MATERIAL,
            ArmorItem.Type.CHESTPLATE, new Item.Settings().maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(15))));
    public static final Item MAGITECH_LEGGINGS = registerItem("magitech_leggings", new ArmorItem(CustomArmorMaterials.MAGITECH_ARMOR_MATERIAL,
            ArmorItem.Type.LEGGINGS, new Item.Settings().maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(15))));
    public static final Item MAGITECH_BOOTS = registerItem("magitech_boots", new ArmorItem(CustomArmorMaterials.MAGITECH_ARMOR_MATERIAL,
            ArmorItem.Type.BOOTS, new Item.Settings().maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(15))));



    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(TestMod1.MOD_ID, name), item);
    }



    public static void registerCustomItems() {
        TestMod1.LOGGER.info("Registering Custom Items for " + TestMod1.MOD_ID);

    }
}