package net.twistense.dnd_5e.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.twistense.dnd_5e.DnD5eMod;
import net.twistense.dnd_5e.util.ModTags;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator extends BlockTagsProvider {
    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, DnD5eMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {

        this.tag(BlockTags.NEEDS_IRON_TOOL);


        this.tag(ModTags.Blocks.NEEDS_COMMON_TOOL);
        this.tag(ModTags.Blocks.NEEDS_UNCOMMON_TOOL);
        this.tag(ModTags.Blocks.NEEDS_RARE_TOOL);
        this.tag(ModTags.Blocks.NEEDS_EPIC_TOOL);
        this.tag(ModTags.Blocks.NEEDS_LEGENDARY_TOOL);
        this.tag(ModTags.Blocks.NEEDS_ARTIFACT_TOOL);

        this.tag(BlockTags.MINEABLE_WITH_AXE);

    }
}
