package com.ayuubspace.mce.tier;

import com.ayuubspace.mce.items.ModItems;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.Tags;

public final class ToolTiers {

    private ToolTiers() {

    }

    public static final ForgeTier RUBY = new ForgeTier(4, 3550, 4.0F, 4.0F, 15, Tags.Blocks.NEEDS_NETHERITE_TOOL, () ->
        Ingredient.of(ModItems.RUBY.get()));

}

