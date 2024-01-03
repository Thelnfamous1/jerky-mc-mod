package net.jerkymod;

import com.google.common.base.Suppliers;
import dev.architectury.registry.CreativeTabRegistry;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.Registries;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

import java.util.function.Supplier;

public class JerkyMod {
    public static final String MOD_ID = "jerkymod";
    // We can use this if we don't want to use DeferredRegister
    public static final Supplier<Registries> REGISTRIES = Suppliers.memoize(() -> Registries.get(MOD_ID));
    // Registering a new creative tab
    // public static final CreativeModeTab JERKY_TAB = CreativeTabRegistry.create(new ResourceLocation(MOD_ID, "jerky_tab"), () ->
    //         new ItemStack(JerkyMod.BEEF_JERKY_ITEM.get()));
    
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(MOD_ID, Registry.ITEM_REGISTRY);
    public static final RegistrySupplier<Item> BEEF_JERKY_ITEM = ITEMS.register("beef_jerky", () ->
            new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD).food(ModFood.BEEF_JERKY)));
    public static final RegistrySupplier<Item> CHICKEN_JERKY_ITEM = ITEMS.register("chicken_jerky", () ->
            new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD).food(ModFood.CHICKEN_JERKY)));
    public static final RegistrySupplier<Item> MUTTON_JERKY_ITEM = ITEMS.register("mutton_jerky", () ->
            new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD).food(ModFood.MUTTON_JERKY)));
    public static final RegistrySupplier<Item> PORK_JERKY_ITEM = ITEMS.register("pork_jerky", () ->
            new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD).food(ModFood.PORK_JERKY)));
    public static final RegistrySupplier<Item> RABBIT_JERKY_ITEM = ITEMS.register("rabbit_jerky", () ->
            new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD).food(ModFood.RABBIT_JERKY)));
    public static final RegistrySupplier<Item> SMOLKED_COD_ITEM = ITEMS.register("smoked_cod", () ->
            new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD).food(ModFood.SMOKED_COD)));
    public static final RegistrySupplier<Item> SMOKED_SALMON_ITEM = ITEMS.register("smoked_salmon", () ->
            new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD).food(ModFood.SMOKED_SALMON)));
    
    public static void init() {
        ITEMS.register();
        
        System.out.println(JerkyExpectPlatform.getConfigDirectory().toAbsolutePath().normalize().toString());
    }
}
