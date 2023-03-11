package net.braxtenchenay.voidalchemy.world.dimension;

import net.minecraft.resource.Resource;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.World;

public class ModDimension {
    public static final RegistryKey<World> VOID = RegistryKey.of(Registry.WORLD_KEY, new Identifier("void"));

}
