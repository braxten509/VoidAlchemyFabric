package net.braxtenchenay.voidalchemy.world.feature;

import net.braxtenchenay.voidalchemy.VoidAlchemy;
import net.braxtenchenay.voidalchemy.block.ModBlocks;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.feature.*;

import java.util.List;

public class ModConfiguredFeatures {

    public static final List<OreFeatureConfig.Target> OVERWORLD_ALCHEMICAL_ORES = List.of(
            OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES, ModBlocks.ALCHEMICAL_ORE.getDefaultState()),
            OreFeatureConfig.createTarget(OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DEEPSLATE_ALCHEMICAL_ORE.getDefaultState()));

    public static final List<OreFeatureConfig.Target> VOID_ARCAMIRUS_ORES = List.of(
            OreFeatureConfig.createTarget(OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DEEPSLATE_ARCAMIRUS_ORE.getDefaultState()));

    public static final List<OreFeatureConfig.Target> VOID_FORLORN_STONES = List.of(
            OreFeatureConfig.createTarget(OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.FORNLORN_STONE.getDefaultState()));

    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> ALCHEMICAL_ORE =
            ConfiguredFeatures.register("alchemical_ore", Feature.ORE, new OreFeatureConfig(OVERWORLD_ALCHEMICAL_ORES, 5));

    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> ARCAMIRUS_ORE =
            ConfiguredFeatures.register("arcamirus_ore", Feature.ORE, new OreFeatureConfig(VOID_ARCAMIRUS_ORES, 8));

    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> FORLORN_STONE =
            ConfiguredFeatures.register("forlorn_stone", Feature.ORE, new OreFeatureConfig(VOID_FORLORN_STONES, 8));

    public static void registerConfiguredFeatures() {
        VoidAlchemy.LOGGER.debug("Registering the ModConfiguredFeatures for " + VoidAlchemy.MOD_ID);
    }

}
