package net.braxtenchenay.voidalchemy.item;

import net.braxtenchenay.voidalchemy.VoidAlchemy;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {

    public static final ItemGroup VOID_DUST = FabricItemGroupBuilder.build(
            new Identifier(VoidAlchemy.MOD_ID,"void_dust"), () -> new ItemStack(ModItems.VOID_DUST));

}
