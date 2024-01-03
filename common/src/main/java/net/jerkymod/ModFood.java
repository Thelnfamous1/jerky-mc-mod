package net.jerkymod;

import net.minecraft.world.food.FoodProperties;

public class ModFood {
  public static final FoodProperties BEEF_JERKY = (new FoodProperties.Builder()).nutrition(5).saturationMod(0.4F).meat().build();
  public static final FoodProperties CHICKEN_JERKY = (new FoodProperties.Builder()).nutrition(4).saturationMod(0.3F).meat().build();
  public static final FoodProperties MUTTON_JERKY = (new FoodProperties.Builder()).nutrition(4).saturationMod(0.4F).meat().build();
  public static final FoodProperties PORK_JERKY = (new FoodProperties.Builder()).nutrition(5).saturationMod(0.4F).meat().build();
  public static final FoodProperties RABBIT_JERKY = (new FoodProperties.Builder()).nutrition(4).saturationMod(0.4F).meat().build();
  public static final FoodProperties SMOKED_COD = (new FoodProperties.Builder()).nutrition(4).saturationMod(0.3F).meat().build();
  public static final FoodProperties SMOKED_SALMON = (new FoodProperties.Builder()).nutrition(4).saturationMod(0.4F).meat().build();
}
