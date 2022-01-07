package com.ayuubspace.mce;

import com.ayuubspace.mce.blocks.ModBlocks;
import com.ayuubspace.mce.items.ModItems;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static com.ayuubspace.mce.ModMCE.MOD_ID;

@Mod(MOD_ID)
public class ModMCE {
    public static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "mce";
    private static final IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();


    public ModMCE() {

        ModBlocks.BLOCKS.register(eventBus);
        ModItems.ITEMS.register(eventBus);

        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);


        MinecraftForge.EVENT_BUS.register(this);


    }


    private void setup(final FMLCommonSetupEvent event) {
    }

    public static final CreativeModeTab TAB = new CreativeModeTab("extension") {
        @Override
        public ItemStack makeIcon() {
            return ModItems.RUBY.get().getDefaultInstance();
        }
    };

}


