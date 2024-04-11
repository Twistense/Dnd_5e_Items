package net.twistense.dnd_5e;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.twistense.dnd_5e.Items.ArtifactItems;
import net.twistense.dnd_5e.Items.EpicItems;
import net.twistense.dnd_5e.Items.LegendaryItems;
import net.twistense.dnd_5e.Items.CommonItems;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, DnD5eMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> DND_5E_ITEMS = CREATIVE_MODE_TABS.register("dnd_5e", ()-> CreativeModeTab.builder().icon(()-> new ItemStack(LegendaryItems.BLACKRAZOR.get()))
            .title(Component.translatable("creativemodetab.dnd_5e_tab"))
            .displayItems((itemDisplayParameters, pOutput) -> {

                //add the materials to the creative tab
                pOutput.accept(CommonItems.COMMON_MATERIAL.get());
                pOutput.accept(CommonItems.UNCOMMON_MATERIAL.get());
                pOutput.accept(CommonItems.RARE_MATERIAL.get());
                pOutput.accept(CommonItems.EPIC_MATERIAL.get());
                pOutput.accept(CommonItems.LEGENDARY_MATERIAL.get());

                //add the weapons to the creative tab
                pOutput.accept(ArtifactItems.ADZE_OFANNAM.get());
                pOutput.accept(ArtifactItems.AKMON_THE_HAMMER_OF_PURPHOROS.get());
                pOutput.accept(ArtifactItems.AXE_OF_THE_DWARVISH_LORDS.get());
                pOutput.accept(ArtifactItems.BLADE_OF_AVERNUS.get());
                pOutput.accept(ArtifactItems.BLADE_OF_BROKEN_MIRRORS.get());
                pOutput.accept(ArtifactItems.DEKELLA_BIDENT_OF_THASSA.get());
                pOutput.accept(ArtifactItems.EPHIXIS_BOW_OF_NYELA.get());
                pOutput.accept(ArtifactItems.GROVELTHRASH.get());
                pOutput.accept(ArtifactItems.KHRUSOR_SPEAR_OF_HELIOD.get());
                pOutput.accept(ArtifactItems.LASH_OF_SHADOWS.get());
                pOutput.accept(ArtifactItems.MACE_OF_THE_BLACK_CROWN.get());
                pOutput.accept(ArtifactItems.MASTIX_WHIP_OF_EREBOS.get());
                pOutput.accept(ArtifactItems.RUINS_WAKE.get());
                pOutput.accept(ArtifactItems.SILKEN_SPITE.get());
                pOutput.accept(ArtifactItems.SWORD_OF_KAS.get());
                pOutput.accept(ArtifactItems.SWORD_OF_ZARIEL.get());
                pOutput.accept(ArtifactItems.THE_BLOODY_END.get());
                pOutput.accept(ArtifactItems.WILL_OF_THE_TALON.get());

                pOutput.accept(LegendaryItems.AZUREDGE.get());
                pOutput.accept(LegendaryItems.BLACKRAZOR.get());
                pOutput.accept(LegendaryItems.BOOKMARK.get());
                pOutput.accept(LegendaryItems.DAWNBRINGER.get());
                pOutput.accept(LegendaryItems.DEFENDER.get());
                pOutput.accept(LegendaryItems.DRAGONLANCE.get());
                pOutput.accept(LegendaryItems.DRAGONS_WRATH_WEAPON.get());
                pOutput.accept(LegendaryItems.DROWN.get());
                pOutput.accept(LegendaryItems.FANE_EATER.get());
                pOutput.accept(LegendaryItems.FLAIL_OF_TIAMAT.get());
                pOutput.accept(LegendaryItems.GURTS_GREATAXE.get());
                pOutput.accept(LegendaryItems.HAMMER_OF_THUNDERBOLTS.get());
                pOutput.accept(LegendaryItems.HAZIRAWN.get());
                pOutput.accept(LegendaryItems.HOLY_AVENGER.get());
                pOutput.accept(LegendaryItems.IRONFANG.get());
                pOutput.accept(LegendaryItems.LONGBOW_OF_THE_HEALING_HEARTH.get());
                pOutput.accept(LegendaryItems.LUCK_BLADE.get());
                pOutput.accept(LegendaryItems.MATALOTOK.get());
                pOutput.accept(LegendaryItems.MOONBLADE.get());
                pOutput.accept(LegendaryItems.NEPENTHE.get());
                pOutput.accept(LegendaryItems.NIGHTBRINGER.get());
                pOutput.accept(LegendaryItems.ORCSPLITTER.get());
                pOutput.accept(LegendaryItems.RAKDOS_RITEKNIFE.get());
                pOutput.accept(LegendaryItems.REAPERS_SCREAM.get());
                pOutput.accept(LegendaryItems.RED_WIZARD_BLADE.get());
                pOutput.accept(LegendaryItems.RUINBLADE.get());
                pOutput.accept(LegendaryItems.SNICKER_SNACK.get());
                pOutput.accept(LegendaryItems.SUNSWORD.get());
                pOutput.accept(LegendaryItems.SWORD_OF_ANSWERING.get());
                pOutput.accept(LegendaryItems.SWORD_OF_THE_PLANES.get());
                pOutput.accept(LegendaryItems.TINDERSTRIKE.get());
                pOutput.accept(LegendaryItems.TOPAZ_ANNIHILATOR.get());
                pOutput.accept(LegendaryItems.VORPAL_SWORD.get());
                pOutput.accept(LegendaryItems.WAVE.get());
                pOutput.accept(LegendaryItems.WAYTHE.get());
                pOutput.accept(LegendaryItems.WHELM.get());
                pOutput.accept(LegendaryItems.WINDVANE.get());

                pOutput.accept(EpicItems.ARROW_OF_SLAYING.get());
            })
            .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
