package com.ayuubspace.mce.items;

import com.ayuubspace.mce.ModMCE;
import com.ayuubspace.mce.blocks.ModBlocks;
import com.ayuubspace.mce.items.custom.SmelterItem;
import com.ayuubspace.mce.tier.ArmorTiers;
import com.ayuubspace.mce.tier.ToolTiers;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.*;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ModMCE.MOD_ID);


    // Items

    public static final RegistryObject<Item> RUBY = ITEMS.register("ruby",
            () -> new Item(new Item.Properties().tab(ModMCE.TAB)));
    public static final RegistryObject<Item> STONE_STICK = ITEMS.register("stone_stick",
            () -> new Item(new Item.Properties().tab(ModMCE.TAB)));
    public static final RegistryObject<Item> ANGEL_RING = ITEMS.register("angel_ring", () ->
            new Item(new Item.Properties().tab(ModMCE.TAB)));
    public static final RegistryObject<Item> RUBY_NUGGET = ITEMS.register("ruby_nugget", () ->
            new Item(new Item.Properties().tab(ModMCE.TAB)));
    public static final RegistryObject<Item> SMELTER = ITEMS.register("smelter", () ->
            new SmelterItem(new Item.Properties().tab(ModMCE.TAB).durability(300)));
    public static final RegistryObject<Item> RUBY_APPLE = ITEMS.register("ruby_apple", () ->
            new Item(new Item.Properties().tab(ModMCE.TAB).food(new FoodProperties.Builder()
                    .nutrition(5)
                    .effect(() -> new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 20000, 1), 1.0f)
                    .saturationMod(5)
                    .effect(() -> new MobEffectInstance(MobEffects.ABSORPTION, 20000, 5), 1.0f)
                    .alwaysEat()
                    .build())));

    // Tools

    public static final RegistryObject<SwordItem> RUBY_SWORD = ITEMS.register("ruby_sword", () ->
            new SwordItem(ToolTiers.RUBY, 5, -2.4f, new Item.Properties().tab(ModMCE.TAB).stacksTo(1)));

    public static final RegistryObject<PickaxeItem> RUBY_PICKAXE = ITEMS.register("ruby_pickaxe", () ->
            new PickaxeItem(ToolTiers.RUBY, 0, -2.4F, new Item.Properties().tab(ModMCE.TAB).stacksTo(1)));

    public static final RegistryObject<ShovelItem> RUBY_SHOVEL = ITEMS.register("ruby_shovel", () ->
            new ShovelItem(ToolTiers.RUBY, -1, -2.4F, new Item.Properties().tab(ModMCE.TAB).stacksTo(1)));

    public static final RegistryObject<AxeItem> RUBY_AXE = ITEMS.register("ruby_axe", () ->
            new AxeItem(ToolTiers.RUBY, 6, -2.4F, new Item.Properties().tab(ModMCE.TAB).stacksTo(1)));

    public static final RegistryObject<HoeItem> RUBY_HOE = ITEMS.register("ruby_hoe", () ->
            new HoeItem(ToolTiers.RUBY, -2, -2.4f, new Item.Properties().tab(ModMCE.TAB).stacksTo(1)));

    // Armor

    public static final RegistryObject<ArmorItem> RUBY_HELMET = ITEMS.register("ruby_helmet", () ->
            new ArmorItem(ArmorTiers.RUBY, EquipmentSlot.HEAD, new Item.Properties().tab(ModMCE.TAB).stacksTo(1)));

    public static final RegistryObject<ArmorItem> RUBY_CHESTPLATE = ITEMS.register("ruby_chestplate", () ->
            new ArmorItem(ArmorTiers.RUBY, EquipmentSlot.CHEST, new Item.Properties().tab(ModMCE.TAB).stacksTo(1)));

    public static final RegistryObject<ArmorItem> RUBY_LEGGINGS = ITEMS.register("ruby_leggings", () ->
            new ArmorItem(ArmorTiers.RUBY, EquipmentSlot.LEGS, new Item.Properties().tab(ModMCE.TAB).stacksTo(1)));

    public static final RegistryObject<ArmorItem> RUBY_BOOTS = ITEMS.register("ruby_boots", () ->
            new ArmorItem(ArmorTiers.RUBY, EquipmentSlot.FEET, new Item.Properties().tab(ModMCE.TAB).stacksTo(1)));


    // Block items

    public static final RegistryObject<BlockItem> RUBY_BLOCK_ITEM = ITEMS.register("ruby_block", () ->
        new BlockItem(ModBlocks.RUBY_BLOCK.get(), new Item.Properties().tab(ModMCE.TAB)));
    public static final RegistryObject<BlockItem> RUBY_ORE_ITEM = ITEMS.register("ruby_ore", () ->
            new BlockItem(ModBlocks.RUBY_ORE.get(), new Item.Properties().tab(ModMCE.TAB)));
    public static final RegistryObject<BlockItem> RUBY_END_ORE_ITEM = ITEMS.register("ruby_end_ore", () ->
            new BlockItem(ModBlocks.RUBY_END_ORE.get(), new Item.Properties().tab(ModMCE.TAB)));
    public static final RegistryObject<BlockItem> RUBY_DEEPSLATE_ORE_ITEM = ITEMS.register("ruby_deepslate_ore", () ->
            new BlockItem(ModBlocks.RUBY_DEPSLATE_ORE.get(), new Item.Properties().tab(ModMCE.TAB)));


}
