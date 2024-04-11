package net.twistense.dnd_5e.util;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.twistense.dnd_5e.DnD5eMod;

public class ModTags {
    public static class Blocks {

        public static final TagKey<Block> NEEDS_COMMON_TOOL = tag("needs_common_tool");
        public static final TagKey<Block> NEEDS_UNCOMMON_TOOL = tag("needs_uncommon_tool");
        public static final TagKey<Block> NEEDS_RARE_TOOL = tag("needs_rare_tool");
        public static final TagKey<Block> NEEDS_EPIC_TOOL = tag("needs_epic_tool");
        public static final TagKey<Block> NEEDS_LEGENDARY_TOOL = tag("needs_legendary_tool");
        public static final TagKey<Block> NEEDS_ARTIFACT_TOOL = tag("needs_artifact_tool");


        private static TagKey<Block> tag(String name) {
            return BlockTags.create(new ResourceLocation(DnD5eMod.MOD_ID, name));
        }
    }
    public static class Items {
        private static TagKey<Item> tag(String name) {
            return ItemTags.create(new ResourceLocation(DnD5eMod.MOD_ID, name));
        }
    }
}
