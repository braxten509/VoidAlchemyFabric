package net.braxtenchenay.voidalchemy.item;

import net.braxtenchenay.voidalchemy.VoidAlchemy;
import net.braxtenchenay.voidalchemy.block.ModBlocks;
import net.braxtenchenay.voidalchemy.item.custom.GlimmerOfHopeItem;
import net.braxtenchenay.voidalchemy.item.custom.SupernaturalStrengthItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item VOID_DUST = registerItem("void_dust",
            new Item(new FabricItemSettings().group(ModItemGroup.VOID_DUST)));

    public static final Item ALCHEMICAL_DUST = registerItem("alchemical_dust",
            new Item(new FabricItemSettings().group(ModItemGroup.VOID_DUST)));

    public static final Item ARCAMIRUS_DUST = registerItem("arcamirus_dust",
            new Item(new FabricItemSettings().group(ModItemGroup.VOID_DUST)));

    public static final Item MIRCANTERS_DUST = registerItem("mircanters_dust",
            new Item(new FabricItemSettings().group(ModItemGroup.VOID_DUST)));

    public static final Item BAG_OF_ALCHEMICAL_DUST = registerItem("bag_of_alchemical_dust",
            new Item(new FabricItemSettings().group(ModItemGroup.VOID_DUST)));

    public static final Item BAG_OF_ARCAMIRUS_DUST = registerItem("bag_of_arcamirus_dust",
            new Item(new FabricItemSettings().group(ModItemGroup.VOID_DUST)));

    public static final Item BAG_OF_MIRCANTERS_DUST = registerItem("bag_of_mircanters_dust",
            new Item(new FabricItemSettings().group(ModItemGroup.VOID_DUST)));

    public static final Item SUPERNATURAL_STRENGTH = registerItem("supernatural_strength",
            new SupernaturalStrengthItem(new FabricItemSettings().group(ModItemGroup.VOID_DUST)));

    public static final Item GLIMMER_OF_HOPE = registerItem("glimmer_of_hope",
            new GlimmerOfHopeItem(new FabricItemSettings().group(ModItemGroup.VOID_DUST)));

    public static final Item GABE_PEPPER_SEEDS = registerItem("gabe_pepper_seeds",
            new AliasedBlockItem(ModBlocks.GABE_PEPPER_CROP,
                    new FabricItemSettings().group(ModItemGroup.VOID_DUST)));

    public static final Item GABE_PEPPER = registerItem("gabe_pepper",
            new Item(new FabricItemSettings().group(ModItemGroup.VOID_DUST)
                    .food(new FoodComponent.Builder().hunger(10).saturationModifier(10f)
                            .statusEffect(new StatusEffectInstance(StatusEffects.WITHER,80,1), 0.8f)
                            .statusEffect(new StatusEffectInstance(StatusEffects.SPEED,120,1), 1.0f).build())));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(VoidAlchemy.MOD_ID, name), item);
    }

    public static void registerModItems() {

        VoidAlchemy.LOGGER.debug("Registering Mod Items for " + VoidAlchemy.MOD_ID);

    }

}
