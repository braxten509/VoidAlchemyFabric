package net.braxtenchenay.voidalchemy;

import net.braxtenchenay.voidalchemy.block.ModBlocks;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;

public class VoidAlchemyClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.GABE_PEPPER_CROP, RenderLayer.getCutout());
    }
}
