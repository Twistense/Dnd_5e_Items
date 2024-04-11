package net.twistense.dnd_5e.Items;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;
import net.twistense.dnd_5e.DnD5eMod;
import net.twistense.dnd_5e.util.ModTags;

import java.util.List;

public class ModToolTiers {
    public static final Tier COMMON_TOOL = TierSortingRegistry.registerTier(
            new ForgeTier(5,1500, 5f,4f,25,
                    ModTags.Blocks.NEEDS_COMMON_TOOL, ()-> Ingredient.of(CommonItems.COMMON_MATERIAL.get())),
            new ResourceLocation(DnD5eMod.MOD_ID, "common_material"), List.of(Tiers.NETHERITE), List.of());
    public static final Tier UNCOMMON_TOOL = TierSortingRegistry.registerTier(
            new ForgeTier(6,3000, 6f,6f,30,
                    ModTags.Blocks.NEEDS_UNCOMMON_TOOL, ()-> Ingredient.of(CommonItems.UNCOMMON_MATERIAL.get())),
            new ResourceLocation(DnD5eMod.MOD_ID, "uncommon_material"), List.of(Tiers.NETHERITE), List.of());
    public static final Tier RARE_TOOL = TierSortingRegistry.registerTier(
            new ForgeTier(7,4500, 7f,10f,35,
                    ModTags.Blocks.NEEDS_RARE_TOOL, ()-> Ingredient.of(CommonItems.RARE_MATERIAL.get())),
            new ResourceLocation(DnD5eMod.MOD_ID, "rare_material"), List.of(Tiers.NETHERITE), List.of());
    public static final Tier EPIC_TOOL = TierSortingRegistry.registerTier(
            new ForgeTier(8,6000, 8f,15f,40,
                    ModTags.Blocks.NEEDS_EPIC_TOOL, ()-> Ingredient.of(CommonItems.EPIC_MATERIAL.get())),
            new ResourceLocation(DnD5eMod.MOD_ID, "epic_material"), List.of(Tiers.NETHERITE), List.of());
    public static final Tier LEGENDARY_TOOL = TierSortingRegistry.registerTier(
            new ForgeTier(9,10000, 9f,20f,45,
                    ModTags.Blocks.NEEDS_LEGENDARY_TOOL, ()-> Ingredient.of(CommonItems.LEGENDARY_MATERIAL.get())),
            new ResourceLocation(DnD5eMod.MOD_ID, "legendary_material"), List.of(Tiers.NETHERITE), List.of());
    public static final Tier ARTIFACT_TOOL = TierSortingRegistry.registerTier(
            new ForgeTier(10,50000, 15f,40f,90,
                    ModTags.Blocks.NEEDS_ARTIFACT_TOOL, ()-> Ingredient.of(CommonItems.ARTIFACT_MATERIAL.get())),
            new ResourceLocation(DnD5eMod.MOD_ID, "artifact_material"), List.of(Tiers.NETHERITE), List.of());


}
