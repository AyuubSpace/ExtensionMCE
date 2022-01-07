package com.ayuubspace.mce.blocks;

import com.ayuubspace.mce.ModMCE;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, ModMCE.MOD_ID);

    public static final RegistryObject<Block> RUBY_BLOCK = BLOCKS.register("ruby_block", () ->
            new Block(BlockBehaviour.Properties.of(Material.HEAVY_METAL)
                    .color(MaterialColor.COLOR_RED)
                    .explosionResistance(3f)
                    .sound(SoundType.METAL)
                    .destroyTime(25f)
                    .strength(5.0f)
            ));
    public static final RegistryObject<Block> RUBY_ORE = BLOCKS.register("ruby_ore",  () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
            .color(MaterialColor.COLOR_GRAY)
            .explosionResistance(3f)
            .sound(SoundType.METAL)
            .requiresCorrectToolForDrops()
            .destroyTime(15f)
            .strength(1.5f, 5.0f)
    ));
    public static final RegistryObject<Block> RUBY_END_ORE = BLOCKS.register("ruby_end_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .color(MaterialColor.COLOR_YELLOW)
                    .explosionResistance(3f)
                    .sound(SoundType.METAL)
                    .requiresCorrectToolForDrops()
                    .destroyTime(15f)
                    .strength(1.5f, 5.0f)
            ));
    public static final RegistryObject<Block> RUBY_DEPSLATE_ORE = BLOCKS.register("ruby_deepslate_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .color(MaterialColor.COLOR_GRAY)
                    .explosionResistance(3f)
                    .sound(SoundType.METAL)
                    .requiresCorrectToolForDrops()
                    .destroyTime(15f)
                    .strength(1.5f, 5.0f)
            ));

}
