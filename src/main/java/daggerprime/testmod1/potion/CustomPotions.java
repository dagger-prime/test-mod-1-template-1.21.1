package daggerprime.testmod1.potion;

import daggerprime.testmod1.TestMod1;
import daggerprime.testmod1.effect.CustomEffects;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.potion.Potion;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;

public class CustomPotions {
    public static final RegistryEntry<Potion> POTION_OF_POWER = registerPotion("potion_of_power",
            new Potion(new StatusEffectInstance(CustomEffects.ANGELIC_BOON_OF_POWER, 200, 2)));


    private static RegistryEntry<Potion> registerPotion(String name, Potion potion) {
        return Registry.registerReference(Registries.POTION, Identifier.of(TestMod1.MOD_ID, name), potion);
    }

    public static void registerPotions() {
        TestMod1.LOGGER.info("Registering Potions for " + TestMod1.MOD_ID);
    }
}
