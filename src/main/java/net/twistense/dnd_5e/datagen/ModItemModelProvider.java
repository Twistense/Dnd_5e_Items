package net.twistense.dnd_5e.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;
import net.twistense.dnd_5e.DnD5eMod;
import net.twistense.dnd_5e.Items.ArtifactItems;
import net.twistense.dnd_5e.Items.CommonItems;
import net.twistense.dnd_5e.Items.LegendaryItems;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, DnD5eMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(CommonItems.COMMON_MATERIAL);
        simpleItem(CommonItems.UNCOMMON_MATERIAL);
        simpleItem(CommonItems.RARE_MATERIAL);
        simpleItem(CommonItems.EPIC_MATERIAL);
        simpleItem(CommonItems.LEGENDARY_MATERIAL);
        simpleItem(CommonItems.ARTIFACT_MATERIAL);

        handheldItem(ArtifactItems.ADZE_OF_ANNAM);
        handheldItem(ArtifactItems.AKMON_THE_HAMMER_OF_PURPHOROS);
        handheldItem(ArtifactItems.AXE_OF_THE_DWARVISH_LORDS);
        handheldItem(ArtifactItems.BLADE_OF_AVERNUS);
        handheldItem(ArtifactItems.BLADE_OF_BROKEN_MIRRORS);
        handheldItem(ArtifactItems.DEKELLA_BIDENT_OF_THASSA);
        handheldItem(ArtifactItems.EPHIXIS_BOW_OF_NYELA);
        handheldItem(ArtifactItems.GROVELTHRASH);
        handheldItem(ArtifactItems.KHRUSOR_SPEAR_OF_HELIOD);
        handheldItem(ArtifactItems.LASH_OF_SHADOWS);
        handheldItem(ArtifactItems.MACE_OF_THE_BLACK_CROWN);
        handheldItem(ArtifactItems.MASTIX_WHIP_OF_EREBOS);
        handheldItem(ArtifactItems.RUINS_WAKE);
        handheldItem(ArtifactItems.SILKEN_SPITE);
        handheldItem(ArtifactItems.SWORD_OF_KAS);
        handheldItem(ArtifactItems.SWORD_OF_ZARIEL);
        handheldItem(ArtifactItems.THE_BLOODY_END);
        handheldItem(ArtifactItems.WILL_OF_THE_TALON);

        handheldItem(LegendaryItems.BLACKRAZOR);

    }
    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(DnD5eMod.MOD_ID,"item/" +item.getId().getPath()));
    }
    private ItemModelBuilder handheldItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/handheld")).texture("layer0",
                new ResourceLocation(DnD5eMod.MOD_ID,"item/" +item.getId().getPath()));
    }
}
