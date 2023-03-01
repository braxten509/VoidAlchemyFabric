package net.braxtenchenay.voidalchemy.item;

import net.braxtenchenay.voidalchemy.VoidAlchemy;
import net.braxtenchenay.voidalchemy.item.custom.GlimmerOfHopeItem;
import net.braxtenchenay.voidalchemy.item.custom.SupernaturalStrengthItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
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


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(VoidAlchemy.MOD_ID, name), item);
    }

    public static void registerModItems() {

        VoidAlchemy.LOGGER.debug("Registering Mod Items for " + VoidAlchemy.MOD_ID);

    }

}
