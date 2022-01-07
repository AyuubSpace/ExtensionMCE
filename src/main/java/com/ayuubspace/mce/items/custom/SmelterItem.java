package com.ayuubspace.mce.items.custom;

import com.google.common.collect.ImmutableMap;
import net.minecraft.Util;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;

import java.util.Map;

public class SmelterItem extends Item {
    public static final Map<Block, Item> SMELTER_SMELTING_CRAFTABLES = new ImmutableMap.Builder<Block, Item>()
            .put(Blocks.IRON_ORE, Items.IRON_INGOT)
            .put(Blocks.GOLD_ORE, Items.GOLD_INGOT)
            .put(Blocks.ANCIENT_DEBRIS, Items.NETHERITE_INGOT)
            .put(Blocks.COPPER_ORE, Items.COPPER_INGOT)
            .put(Blocks.SAND, Items.GLASS)
            .put(Blocks.COBBLESTONE, Items.STONE)
            .build();

    public SmelterItem(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public InteractionResult useOn(UseOnContext pContext) {
        if(!pContext.getLevel().isClientSide()) {
            Level level = pContext.getLevel();
            BlockPos position = pContext.getClickedPos();
            Block blockClicked = pContext.getLevel().getBlockState(position).getBlock();

            if(canSmelt(blockClicked)) {
                ItemEntity entityItem = new ItemEntity(level, position.getX(), position.getY(), position.getZ(),
                        new ItemStack(SMELTER_SMELTING_CRAFTABLES.get(blockClicked), 1));
                level.destroyBlock(position, false);
                level.addFreshEntity(entityItem);

                pContext.getItemInHand().hurtAndBreak(1, pContext.getPlayer(), p ->
                        p.broadcastBreakEvent(pContext.getHand()));

            } else {
                pContext.getPlayer().sendMessage(new TextComponent("Not able to smelt this block, If this is incorrect please contact me."), Util.NIL_UUID);

            }

        }

        return InteractionResult.SUCCESS;
    }

    public boolean canSmelt(Block block) {
        return SMELTER_SMELTING_CRAFTABLES.containsKey(block);
    }
}
