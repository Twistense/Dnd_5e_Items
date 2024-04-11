package net.twistense.dnd_5e.Items;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.twistense.dnd_5e.DnD5eMod;

public class RareItems {
    public static final DeferredRegister<Item> RARE = DeferredRegister.create(ForgeRegistries.ITEMS, DnD5eMod.MOD_ID);

    public static final RegistryObject<Item> BESERKER_AXE = RARE.register("beserker_axe", () -> new SwordItem(ModToolTiers.RARE_TOOL, 100, 4, new Item.Properties()));

    public static void register(IEventBus eventBus) {
        RARE.register(eventBus);
    }
}
