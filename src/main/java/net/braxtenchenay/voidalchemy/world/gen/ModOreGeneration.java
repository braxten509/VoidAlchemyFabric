package net.braxtenchenay.voidalchemy.world.gen;

import net.braxtenchenay.voidalchemy.world.biome.ModBiomes;
import net.braxtenchenay.voidalchemy.world.feature.ModPlacedFeatures;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.world.gen.GenerationStep;

public class ModOreGeneration {

    public static void generateOres() {
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.ALCHEMICAL_ORE_PLACED.getKey().get());

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(ModBiomes.VOID_BIOME),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.ARCAMIRUS_ORE_PLACED.getKey().get());

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(ModBiomes.VOID_BIOME),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.FORLORN_STONE_PLACED.getKey().get());
    }

}

