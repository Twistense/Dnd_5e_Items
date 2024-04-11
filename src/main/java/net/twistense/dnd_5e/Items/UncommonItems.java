package net.twistense.dnd_5e.Items;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.twistense.dnd_5e.DnD5eMod;

public class UncommonItems {
    public static final DeferredRegister<Item> UNCOMMON = DeferredRegister.create(ForgeRegistries.ITEMS, DnD5eMod.MOD_ID);

    public static final RegistryObject<Item> BLOOD_SPEAR = UNCOMMON.register("blood_spear", () -> new SwordItem(ModToolTiers.UNCOMMON_TOOL, 100, 4, new Item.Properties()));
    public static void register(IEventBus eventBus) {
        UNCOMMON.register(eventBus);
    }
}
