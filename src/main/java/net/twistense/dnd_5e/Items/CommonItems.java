package net.twistense.dnd_5e.Items;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.twistense.dnd_5e.DnD5eMod;

public class CommonItems {
    public static final DeferredRegister<Item> MATERIALS = DeferredRegister.create(ForgeRegistries.ITEMS, DnD5eMod.MOD_ID);
    public static final DeferredRegister<Item> COMMON = DeferredRegister.create(ForgeRegistries.ITEMS, DnD5eMod.MOD_ID);


    //materials needed for each tier
    public static final RegistryObject<Item> COMMON_MATERIAL = MATERIALS.register("common_material", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> UNCOMMON_MATERIAL = MATERIALS.register("uncommon_material", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RARE_MATERIAL = MATERIALS.register("rare_material", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> EPIC_MATERIAL = MATERIALS.register("epic_material", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> LEGENDARY_MATERIAL = MATERIALS.register("legendary_material", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ARTIFACT_MATERIAL = MATERIALS.register("artifact_material", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> ARMBLADE = COMMON.register("armblade", () -> new SwordItem(ModToolTiers.COMMON_TOOL, 100, 4, new Item.Properties()));
    public static final RegistryObject<Item> MOON_TOUCHED_SWORD = COMMON.register("moon_touched_sword", () -> new SwordItem(ModToolTiers.COMMON_TOOL, 100, 4, new Item.Properties()));
    public static final RegistryObject<Item> UNBREAKABLE_ARROW = COMMON.register("unbreakable_arrow", () -> new SwordItem(ModToolTiers.COMMON_TOOL, 100, 4, new Item.Properties()));
    public static final RegistryObject<Item> WALLOPING_AMMUNITION = COMMON.register("walloping_ammunition", () -> new SwordItem(ModToolTiers.COMMON_TOOL, 100, 4, new Item.Properties()));

    public static void register(IEventBus eventBus) {
        MATERIALS.register(eventBus);
        COMMON.register(eventBus);
    }
}
