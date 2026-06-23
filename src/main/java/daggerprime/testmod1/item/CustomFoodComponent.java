package daggerprime.testmod1.item;

import net.minecraft.component.type.FoodComponent;

public class CustomFoodComponent {
    public static final FoodComponent STORMBERRIES = new FoodComponent.Builder().nutrition(3).saturationModifier(0.1F).build();
}
