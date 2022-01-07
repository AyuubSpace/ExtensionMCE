package com.ayuubspace.mce.intergration.jei;

import com.ayuubspace.mce.ModMCE;
import mezz.jei.api.IModPlugin;
import mezz.jei.api.JeiPlugin;
import net.minecraft.resources.ResourceLocation;


@JeiPlugin
public class MCEJei implements IModPlugin {

    @Override
    public ResourceLocation getPluginUid() {
        return new ResourceLocation(ModMCE.MOD_ID, "jei_plugin");
    }

}
