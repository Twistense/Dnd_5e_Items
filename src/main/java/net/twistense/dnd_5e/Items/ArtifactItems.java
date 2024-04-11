package net.twistense.dnd_5e.Items;

import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.SwordItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.twistense.dnd_5e.DnD5eMod;

public class ArtifactItems {
    public static final DeferredRegister<Item> ARTIFACTS = DeferredRegister.create(ForgeRegistries.ITEMS, DnD5eMod.MOD_ID);

    public static final RegistryObject<Item> ADZE_OF_ANNAM = ARTIFACTS.register("axe_of_adze", () -> new AxeItem(ModToolTiers.ARTIFACT_TOOL, 1000, 0, new Item.Properties()));
    public static final RegistryObject<Item> AKMON_THE_HAMMER_OF_PURPHOROS = ARTIFACTS.register("akmon_the_hammer_of_purphoros", () -> new AxeItem(ModToolTiers.ARTIFACT_TOOL, 1000, 0, new Item.Properties()));
    public static final RegistryObject<Item> AXE_OF_THE_DWARVISH_LORDS = ARTIFACTS.register("axe_of_the_dwarvish_lords", () -> new AxeItem(ModToolTiers.ARTIFACT_TOOL, 1000, 0, new Item.Properties()));
    public static final RegistryObject<Item> BLADE_OF_AVERNUS = ARTIFACTS.register("blade_of_avernus", () -> new SwordItem(ModToolTiers.ARTIFACT_TOOL, 1000, 0, new Item.Properties()));
    public static final RegistryObject<Item> BLADE_OF_BROKEN_MIRRORS = ARTIFACTS.register("blade_of_broken_mirrors", () -> new SwordItem(ModToolTiers.ARTIFACT_TOOL, 1000, 0, new Item.Properties()));
    public static final RegistryObject<Item> DEKELLA_BIDENT_OF_THASSA = ARTIFACTS.register("dekella_bident_of_thassa", () -> new SwordItem(ModToolTiers.ARTIFACT_TOOL, 1000, 0, new Item.Properties()));
    public static final RegistryObject<Item> EPHIXIS_BOW_OF_NYELA = ARTIFACTS.register("ephixis_bow_of_nyela", () -> new AxeItem(ModToolTiers.ARTIFACT_TOOL, 1000, 0, new Item.Properties()));
    public static final RegistryObject<Item> GROVELTHRASH = ARTIFACTS.register("grovelthrash", () -> new AxeItem(ModToolTiers.ARTIFACT_TOOL, 1000, 0, new Item.Properties()));
    public static final RegistryObject<Item> KHRUSOR_SPEAR_OF_HELIOD = ARTIFACTS.register("khrusor_spear_of_heliod", () -> new AxeItem(ModToolTiers.ARTIFACT_TOOL, 1000, 0, new Item.Properties()));
    public static final RegistryObject<Item> LASH_OF_SHADOWS = ARTIFACTS.register("lash_of_shadows", () -> new AxeItem(ModToolTiers.ARTIFACT_TOOL, 1000, 0, new Item.Properties()));
    public static final RegistryObject<Item> MACE_OF_THE_BLACK_CROWN = ARTIFACTS.register("mace_of_the_black_crown", () -> new AxeItem(ModToolTiers.ARTIFACT_TOOL, 1000, 0, new Item.Properties()));
    public static final RegistryObject<Item> MASTIX_WHIP_OF_EREBOS = ARTIFACTS.register("mastix_whip_of_erebos", () -> new AxeItem(ModToolTiers.ARTIFACT_TOOL, 1000, 0, new Item.Properties()));
    public static final RegistryObject<Item> RUINS_WAKE = ARTIFACTS.register("ruins_wake", () -> new AxeItem(ModToolTiers.ARTIFACT_TOOL, 1000, 0, new Item.Properties()));
    public static final RegistryObject<Item> SILKEN_SPITE = ARTIFACTS.register("silken_spite", () -> new SwordItem(ModToolTiers.ARTIFACT_TOOL, 1000, 0, new Item.Properties()));
    public static final RegistryObject<Item> SWORD_OF_KAS = ARTIFACTS.register("sword_of_kas", () -> new SwordItem(ModToolTiers.ARTIFACT_TOOL, 1000, 0, new Item.Properties()));
    public static final RegistryObject<Item> SWORD_OF_ZARIEL = ARTIFACTS.register("sword_of_zariel", () -> new SwordItem(ModToolTiers.ARTIFACT_TOOL, 1000, 0, new Item.Properties()));
    public static final RegistryObject<Item> THE_BLOODY_END = ARTIFACTS.register("the_bloody_end", () -> new AxeItem(ModToolTiers.ARTIFACT_TOOL, 1000, 0, new Item.Properties()));
    public static final RegistryObject<Item> WILL_OF_THE_TALON = ARTIFACTS.register("will_of_the_talon", () -> new PickaxeItem(ModToolTiers.ARTIFACT_TOOL, 1000, 0, new Item.Properties()));
    public static void register(IEventBus eventBus) {
        ARTIFACTS.register(eventBus);
    }

}
