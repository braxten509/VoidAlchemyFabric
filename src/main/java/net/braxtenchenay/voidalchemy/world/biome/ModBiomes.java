package net.braxtenchenay.voidalchemy.world.biome;

import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.biome.Biome;

public class ModBiomes {

    public static final RegistryKey<Biome> VOID_BIOME = RegistryKey.of(Registry.BIOME_KEY, new Identifier("voidalchemy", "void_biome"));

}
