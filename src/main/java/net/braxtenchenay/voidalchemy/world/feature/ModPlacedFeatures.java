package net.braxtenchenay.voidalchemy.world.feature;

import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.feature.PlacedFeatures;
import net.minecraft.world.gen.placementmodifier.*;

import java.util.List;

public class ModPlacedFeatures {

    public static final RegistryEntry<PlacedFeature> ALCHEMICAL_ORE_PLACED = PlacedFeatures.register("alchemical_ore_placed",
            ModConfiguredFeatures.ALCHEMICAL_ORE, modifiersWithCount(9,
                    HeightRangePlacementModifier.uniform(YOffset.fixed(-80), YOffset.fixed(80))));

    //count = how many times spawns in a chunk
    public static final RegistryEntry<PlacedFeature> ARCAMIRUS_ORE_PLACED = PlacedFeatures.register("arcamirus_ore_placed",
            ModConfiguredFeatures.ARCAMIRUS_ORE, modifiersWithCount(10,
                    HeightRangePlacementModifier.uniform(YOffset.fixed(0), YOffset.fixed(80))));

    public static final RegistryEntry<PlacedFeature> FORLORN_STONE_PLACED = PlacedFeatures.register("forlorn_stone_placed",
            ModConfiguredFeatures.FORLORN_STONE, modifiersWithCount(5,
                    HeightRangePlacementModifier.uniform(YOffset.fixed(0), YOffset.fixed(80))));

    private static List<PlacementModifier> modifiers(PlacementModifier countModifier, PlacementModifier heightModifier) {
        return List.of(countModifier, SquarePlacementModifier.of(), heightModifier, BiomePlacementModifier.of());
    }
    private static List<PlacementModifier> modifiersWithCount(int count, PlacementModifier heightModifier) {
        return modifiers(CountPlacementModifier.of(count), heightModifier);
    }
    private static List<PlacementModifier> modifiersWithRarity(int chance, PlacementModifier heightModifier) {
        return modifiers(RarityFilterPlacementModifier.of(chance), heightModifier);
    }
}
