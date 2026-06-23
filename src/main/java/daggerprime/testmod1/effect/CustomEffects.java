package daggerprime.testmod1.effect;

import daggerprime.testmod1.TestMod1;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;

public class CustomEffects {
    public static final RegistryEntry<StatusEffect> ANGELIC_BOON_OF_POWER = registerStatusEffect("angelic_boon_of_power",
            new AngelicBoonEffect(StatusEffectCategory.BENEFICIAL, 0xFFFFFF)
                    .addAttributeModifier(EntityAttributes.GENERIC_ATTACK_DAMAGE,
                            Identifier.of(TestMod1.MOD_ID, "angelic"), 0.15f,
                            EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL));


    private static RegistryEntry<StatusEffect> registerStatusEffect(String name, StatusEffect statusEffect) {
        return Registry.registerReference(Registries.STATUS_EFFECT, Identifier.of(TestMod1.MOD_ID, name), statusEffect);
    }

    public static void registerEffects() {
        TestMod1.LOGGER.info("Registering Mod Effects for " + TestMod1.MOD_ID);
    }
}
