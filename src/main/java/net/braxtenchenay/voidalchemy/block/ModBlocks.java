package net.braxtenchenay.voidalchemy.block;

import net.braxtenchenay.voidalchemy.VoidAlchemy;
import net.braxtenchenay.voidalchemy.block.custom.ForlornStoneBlock;
import net.braxtenchenay.voidalchemy.item.ModItemGroup;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.block.OreBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.util.registry.Registry;

public class ModBlocks {
    /** BLOCKS **/
    public static final Block ALCHEMICAL_ORE = registerBlock("alchemical_ore",
            new OreBlock(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool(), UniformIntProvider.create(3, 7)), ModItemGroup.VOID_DUST);

    public static final Block ARCAMIRUS_ORE = registerBlock("arcamirus_ore",
            new OreBlock(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool(), UniformIntProvider.create(3, 7)), ModItemGroup.VOID_DUST);

    public static final Block DEEPSLATE_ALCHEMICAL_ORE = registerBlock("deepslate_alchemical_ore",
            new OreBlock(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool(), UniformIntProvider.create(3, 7)), ModItemGroup.VOID_DUST);

    public static final Block DEEPSLATE_ARCAMIRUS_ORE = registerBlock("deepslate_arcamirus_ore",
            new OreBlock(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool(), UniformIntProvider.create(3, 7)), ModItemGroup.VOID_DUST);

    public static final Block FORNLORN_STONE = registerBlock("forlorn_stone",
            new ForlornStoneBlock(FabricBlockSettings.of(Material.STONE).strength(15f).requiresTool()), ModItemGroup.VOID_DUST);

    public static final Block ENLIGHTENED_STONE = registerBlock("enlightened_stone",
            new Block(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool().luminance(15)), ModItemGroup.VOID_DUST);



    private static Block registerBlock(String name, Block block, ItemGroup tab) {
        registerBlockItem(name, block, tab);
        return Registry.register(Registry.BLOCK, new Identifier(VoidAlchemy.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup tab) {
        return Registry.register(Registry.ITEM, new Identifier(VoidAlchemy.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(tab)));
    }

    public static void registerModBlocks() {
        VoidAlchemy.LOGGER.debug("Registering ModBlocks for " + VoidAlchemy.MOD_ID);
    }
}
